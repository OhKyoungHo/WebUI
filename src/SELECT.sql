-----������ �Լ�-----
-- �����, �޿�, ����(�޿�/12)�� ����ϵ� ������ �ʴ������� �ݿø��Ͽ� ���
--ROUND (n, i )N�� �Ҽ��� I�ڸ����� �ݿø�
SELECT ename, sal, ROUND(sal/12,-2) as wolgub   --12�� ���� 2�ڸ����� �ݿø�
FROM emp;
--�����κп��� �ݿø��� ���ϸ� -�� ǥ��

-- �����, �޿�, ����(�޿��� 3.3%)�� ������ �����ϰ� ���
-- TRUNC (n, i ) : ���� n�� �Ҽ��� i�ڸ����� �ڸ�
SELECT ename, sal,  TRUNC(sal*0.033,-1) as TAX  --sal*0.033�� ���� 1�ڸ����� �ݿø�
FROM emp;

SELECT ename, sal, sal*0.033, TRUNC(sal*0.033,-1) as TAX  
FROM emp;

-----������ �Լ�-----
-- smith�� ������ �����ȣ, ����, ������(�ҹ���) ���
--LOWER(str) : ���ĺ��� �ҹ��ڷ� ��ȯ
--UPPER(str) : ���ĺ��� �빮�ڷ� ��ȯ
SELECT empno, ename,  LOWER (JOB) as job
FROM emp
WHERE ENAME= 'SMITH';

SELECT empno, ename,  LOWER (JOB) as job
FROM emp
WHERE ENAME= UPPER('SMITH');

SELECT empno, ename,  LOWER (JOB) as job
FROM emp
WHERE LOWER(ENAME)= LOWER('smith');

-- �����ȣ, �����(ù���ڸ� �빮��), ������(ù���ڸ� �빮��)�� ���
--INITCAP(str) : ù��° ���ڸ� �빮�ڷ� ��ȯ
SELECT empno,INITCAP (ename) , INITCAP(JOB) 
FROM emp;

-- �̸��� ù���ڰ� ��K������ ũ�� ��Y������ ���� ����� ����( �����ȣ, �̸�, ����, �޿�, �μ���ȣ)�� ����ϵ� �̸������� ����
----SUBSTR(str,i,n) : ���ڿ� �� i��°���� n���� �Ϻ� ���ڸ� ����
SELECT empno, ename, sal, deptno
FROM emp
WHERE substr(ename, 1,1)>'K' AND substr(ename, 1,1)<'Y'
order by ename;     --������������...(�Ƚᵵ �ڵ����� �������� ���ĵ�)

SELECT empno, ename, sal, deptno
FROM emp
WHERE ename>'K' AND ename<'Y';--�ش� ��쿡�� KING���� ���ͼ� ������ �ǵ��� ���� ����

--info_tab���� ���� 
SELECT name,substr(jumin, 8,1) as gender
FROM info_tab; 

--info_tab���� ������� 
SELECT name,substr(jumin, 1,6) as birth_year
FROM info_tab; 

-- �̸��� 5���� �̻��� ������� ���
--LENGTH(str) : ���ڿ��� ����
SELECT *
FROM emp
WHERE LENGTH(ename)>=5;


-- �̸��� 15�ڷ� ���߰� ���ڴ� ���ʿ� �����ʿ��� ��*���� ä���
-- LPAD / RPAD (str, n, ch) : n �ڸ��� ��ŭ Ȯ�� �� �� ���鿡 Ư�� ���ڷ� ä��
SELECT RPAD(ename,15,'*')
FROM emp;

-- �޿��� 10�ڷ� ���߰� ���ڴ� �����ʿ� ���ʿ� ��-���� ä���
SELECT LPAD(sal,10,'-')
FROM emp;

- ���� ������ ����

select '-' || trim(' �̼��� ') || '-' as col1, 
       '-' || ltrim(' �̼��� ') || '-' as col2, 
       '-' || rtrim(' �̼��� ') || '-' as col3 
from dual;
--(*) dual : dummy ���̺�� sys user�� owner�̰� ��� ����ڰ� ��밡��.
--           ������ ���� �˰��� �� ��� �����ϰ� ����ϴ� ���̺�.

SELECT sysdate
FRON dual;

-- �޿��� ���ڿ��� �������̻�����ĥ�ȱ��� ���ڷ� ��ü
--TRANSLATE ( column, str1, str2 ) : ���ڿ����� str1�� str2�� ��ü
SELECT sal, TRANSLATE(SAL,'0123456789','�����̻�����ĥ�ȱ�') as kor_sal
FROM emp;

SELECT sal, REPLACE(SAL,'0123456789','�����̻�����ĥ�ȱ�') as kor_sal
FROM emp;-- �ٲ��� ����

-- �޿��� ���ڿ��� 0�� ��$���� �ٲپ� ���
--REPLACE ( column, str1, str2 ) : ���ڿ����� str1�� str2�� ���
SELECT sal, REPLACE ( SAL, 0, '$') as char_sal
FROM emp;

--*****��� ���� ����
--TRIM / LTRIM / RTRIM  : ���ڸ� ����  (*)���� ���� ���ſ� ���
SELECT '    ��     ��     ��     ' as ename
FROM dual;

select REPLACE('    ��     ��     ��     ',' ','') as ename 
from dual;

-----��¥�� �Լ�-----
-- �ý����� ��¥�� �������� �Լ� : SYSDATE, CURRENT_DATE, SYSTIMESTAMP, CURRENT_TIMESTAMP
-- ������� �ٹ��� ���� ���� ��� ������ ���
SELECT *
FROM emp
ORDER BY hiredate;

--������� �ٹ��� ���� ���� ��� ������ ���
SELECT *
FROM emp
ORDER BY hiredate desc;

SELECT ename, hiredate, sysdate - NVL(hiredate,SYSDATE)
FROM emp
ORDER BY sysdate-hiredate desc;

--ceil : ���� ū ����
--FLOOR : ���� ���� ����
SELECT ename, hiredate, ceil(sysdate - hiredate)     
FROM emp
ORDER BY sysdate-hiredate desc NULLS LAST;

-- ������� �ٹ��� ���� �� �� �� ���ΰ��� ���(ex, 100�� = 14�� + 2��)
--TRUNC : ��¥�� ����
-- MOD(N2,N1) : N2���� N1�� ���� ������ ����
SELECT  ename, hiredate, TRUNC((sysdate - hiredate)/7,0) as work_week,
floor(mod(sysdate - hiredate, 7)) as work_days  
FROM emp;

-- 10�� �μ��� ����� ��������� �ٹ� ������ ��� 
-- MONTHS_BETWEEN : �γ�¥ ������ ������ ���
SELECT ename, hiredate, CEIL(MONTHS_BETWEEN (sysdate,hiredate)),
                    floor(MONTHS_BETWEEN (sysdate,hiredate)),
FROM emp
WHERE DEPTNO=10;

-- ���� ��¥���� 3���� ���� ��¥ ���ϱ�
-- ADD_MONTHS : ���� ��¥�� ����
SELECT SYSDATE, ADD_MONTHS(SYSDATE,3)
FROM dual;

-- ���� ��¥���� ���ƿ��� ������������ ��¥ ���ϱ�
-- NEXT_DAY : �������Ͽ� ���� ��¥
SELECT SYSDATE, NEXT_DAY(SYSDATE,'������')
FROM dual;

SELECT SYSDATE, NEXT_DAY(SYSDATE,2)
FROM dual;

SELECT SYSDATE, NEXT_DAY(SYSDATE,'mon')
FROM dual;  --monday , mon�� ���� ����

-- ���� ��¥���� �ش� ���� ������ ��¥ ���ϱ�
-- LAST_DAY : ���� ������ ���� ���
SELECT SYSDATE, LAST_DAY(SYSDATE)
FROM dual;

-----��ȯ�Լ�-----
--TO_CHAR
--:��¥�� �̾Ƴ���, 'YYYY', 'MM', 'DD'���¸� �����ؼ� ���
-- �Ի����ڿ��� �Ի�⵵�� ���
SELECT ename, HIREDATE, EXTRACT(year from HIREDATE) as hire_year
FROM emp;

SELECT ename, hiredate, TO_CHAR(hiredate,'YYYY') as hire_year
FROM emp;

-- �Ի����ڸ� ��1999�� 1�� 1�ϡ� �������� ���
SELECT  hiredate, TO_CHAR(hiredate,'YYYY"��" MM"��" DD"��"') as hire_year
FROM emp;

-- 1981�⵵�� �Ի��� ��� �˻�
SELECT *
FROM emp
WHERE  TO_CHAR(hiredate,'YYYY') = 1981;

SELECT * 
FROM emp
WHERE EXTRACT(year from HIREDATE)=1981;

-- 5���� �Ի��� ��� �˻�
SELECT *
FROM emp
WHERE  TO_CHAR(hiredate,'MM') = 5;

SELECT * 
FROM emp
WHERE EXTRACT(MONTH from HIREDATE)=5;

--81�� 2���� �Ի��� ��� �˻�
SELECT *
FROM emp
WHERE  TO_CHAR(hiredate,'YYYY/MM') = '1981/02';

--81�⿡ �Ի����� ���� ��� �˻�
SELECT *
FROM emp
WHERE  TO_CHAR(hiredate,'YYYY') != 1981;

SELECT * 
FROM emp
WHERE NOT EXTRACT (year from HIREDATE)=1981;

--81�� �Ϲݱ⿡ �Ի��� ��� �˻�
SELECT *
FROM emp
WHERE  TO_CHAR(hiredate,'YYYY/MM') > '1981/06' AND TO_CHAR(hiredate,'YYYY') < 1982 ;

SELECT *
FROM emp
WHERE  TO_CHAR(hiredate,'YYYY/MM') > '1981/06' AND TO_CHAR(hiredate,'YYYY/MM') <= '1981/12' ;

SELECT *
FROM emp
WHERE  TO_CHAR(hiredate,'YYYY/MM') > '1981/06' AND TO_CHAR(hiredate,'YYYY/MM') < '1982/01' ;

SELECT *
FROM emp
WHERE  TO_CHAR(hiredate,'YYYY/MM') BETWEEN '1981/07' AND '1981/12' ;

-- �޿� �տ� $�� �����ϰ� 3�ڸ� ���� ,�� ���
SELECT ename, sal, TO_CHAR(sal,'$999,999,999,999') as dollar
FROM  emp;


-----�ֹι�ȣ���� ���� ���ϱ�------
--���ǹ� ����
SELECT jumin, decode( substr(jumin, 8, 1), '1', '����', '3', '����', '����') AS gender 
FROM info_tab;

SELECT jumin, CASE substr( jumin, 8, 1) 
    WHEN '1' THEN '����'
    WHEN '3' THEN '����'
    ELSE '����'
    END as gender
FROM info_tab;

-- �μ���ȣ�� 10�̸� ������, 20�̸� ������, 30�̸� IT�� �� �ܴ� ����η� ���
SELECT  ename, decode( deptno, 10, '������', 20, '������', 30, 'IT��', '�����') AS NEWDEPT 
FROM emp;

SELECT  ename, CASE  deptno
    WHEN 10 THEN '������'
    WHEN 20 THEN '������'
    WHEN 30 THEN 'IT��'
    ELSE '�����'
    END as NEWDEPT
FROM emp;


-- ����(job)�� analyst�̸� �޿� ������ 10%�̰� clerk�̸� 15%, manager�̸� 20%�� ��� �����ȣ, �����, ����, �޿�, ������ �޿��� ���
SELECT  empno, ename,job, sal, decode( job, 'ANALYST', NVL(SAL,0)*1.1, 'CLERK', NVL(SAL,0)*1.15, 'MANAGER', NVL(SAL,0)*1.20) AS NEWSAL 
FROM emp;

SELECT  empno, ename,job, sal, CASE  JOB
    WHEN 'ANALYST' THEN  SAL*1.1
    WHEN 'CLERK' THEN  SAL*1.15
    WHEN 'MANAGER' THEN  SAL*1.20
    END as NEWSAL 
FROM emp;


-----------------------------------------
SELECT emp;

SELECT all job from emp;

SELECT distinct job from emp;

desc emp;
SELECT rownum, empno, ename, job from emp;
SELECT rownum, empno, ename, job from emp WHERE rownum<=5;
--ROWNUM : SELECT�ؿ� �����Ϳ� �Ϸù�ȣ�� ���̴� ��, Ư�� ���տ��� ���ϴ� ��ŭ�� �ุ �������� ������,
-- ���� ������ ���� �ϴ� �뵵

--������ 'salesman'�� ������� ������ ���, ����, �ּҰ�, �ִ밪�� ���ϱ�
SELECT  avg(sal) as avg, sum(sal) as sum, min(sal) min, max(sal)as max
FROM emp
WHERE job ='SALESMAN';

INSERT INTO emp(empno, ename, job) VALUES(9001, 'ȫ�汹', 'SALESMAN');

--Ŀ�̼��� �޴� ������� ��
--COUNT �Լ��� ����ϸ� NULL�� �����ͷ� ���ԵǾ� ���� ���, NULL�����ʹ� ��ȯ�������� ����
SELECT COUNT(COMM) 
FROM emp
WHERE comm!=0 ;

-----�����ͱ׷�-----
--(#) ��� �÷��� �׷����ϴ� �÷��� �����Լ��� ����

-- �μ����� �ο���, ��ձ޿�, �����޿�, �ְ�޿�, �޿��� ���� ���ϱ�
SELECT deptno, COUNT(*), ceil(AVG(sal)) as AVG, min(sal) as MIN, max(sal)as MAX, sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO;

SELECT deptno, COUNT(*), ROUND(AVG(sal),-2) as AVG, min(sal) as MIN, max(sal)as MAX, sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO;

-- �μ����� �ο���, ��ձ޿�, �����޿�, �ְ�޿�, �޿��� ���� ���ϱ� ( �μ��� �޿��� ���� ���� ������
SELECT deptno, COUNT(*), ceil(AVG(sal)) as AVG, min(sal) as MIN, max(sal)as MAX, sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO 
ORDER BY sum(sal) DESC;

SELECT deptno, COUNT(*), ROUND(AVG(sal),-2) as AVG, min(sal) as MIN, max(sal)as MAX, sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO 
ORDER BY sum(sal) DESC;

-- �μ��� ������ �׷��Ͽ� �μ���ȣ, ����, �ο���, �޿��� ���, �޿��� ���� ���ϱ�
SELECT deptno,JOB, COUNT(*), ceil(AVG(sal)) as AVG, sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO, JOB ;

SELECT deptno,JOB, COUNT(*), ROUND(AVG(sal),-2) as AVG, sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO, JOB ;

-- �ִ� �޿��� 2900 �̻��� �μ��� ���� �μ���ȣ, ��� �޿�, �޿��� ���� ���
SELECT deptno, ceil(AVG(sal)) as AVG, sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO
HAVING max(sal)>=2900 ;

SELECT deptno, ROUND(AVG(sal),-2), sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO
HAVING max(sal)>=2900 ;

-- ������ �޿��� ����� 3000�̻��� ������ ���� ������, ��� �޿�, �޿��� ���� ���
SELECT JOB, ceil(AVG(sal)) as AVG, sum(sal) as SUM
FROM  emp
GROUP BY JOB
HAVING AVG(sal)>=3000 ;

SELECT JOB, ROUND(AVG(sal),-2) as AVG, sum(sal) as SUM
FROM  emp
GROUP BY JOB
HAVING AVG(sal)>=3000 ;


-- ��ü �հ� �޿��� 5000�� �ʰ��ϴ� �� ������ ���ؼ� ������ �޿� �հ踦 ���
--��, SALESMAN�� �����ϰ� �޿� �հ谡 ���� ������ ����
SELECT JOB, sum(sal) as SUM
FROM  emp
WHERE JOB!='SALESMAN'
GROUP BY JOB
HAVING sum(sal)>5000 ;

SELECT JOB, sum(sal) as SUM
FROM  emp
GROUP BY JOB
HAVING sum(sal)>5000 AND JOB not like 'SA_%' ;

-- ������ �ְ� �޿��� �ּ� �޿��� ���̸� ���϶�
SELECT JOB, max(sal) - min(sal) AS GAP 
FROM  emp
GROUP BY JOB;

-- �μ� �ο��� 4�� ���� ���� �μ��� �μ���ȣ, �ο���, �޿��� ���� ���
SELECT deptno, COUNT(*), sum(sal) as SUM
FROM  emp
GROUP BY DEPTNO
HAVING COUNT(*)>4;


