/*
    SELECT �˻��� �׸�
    FROM  ���̺��
    WHERE ���� ;
*/

--��� ����� ������ �޿�, �޿��� ���ʽ��� ���� �հ� ���
--�����ڳ� �߰��Լ��� �����쿡�� ��Ī�� �����ֵ���!
SELECT     ename, sal, sal+nvl(comm,0) AS total_sal    --as�� �Ἥ ��Ī�̶� �򰥸��� �ʵ��� ������!
FROM       emp;
--WHERE   (��� ����̶� ����)    

SELECT ename ||' '||job AS staff
FROM emp;
--WHERE

SELECT distinct JOB FROM emp;       --job�� ���� ���·� ���

--1- 20�� �μ����� �ٹ��ϴ� ����� �����ȣ, �̸�, �μ���ȣ ���

SELECT empno, ename, deptno
FROM    emp
WHERE   deptno=20;

-- 2- �Ի����� 81/01/01���� 81/06/09�� ����� �����ȣ, �̸�, �Ի����� ���
--BETWEEN ���(��� BETWEEN A AND B)
SELECT empno, ename, hiredate
FROM    emp
WHERE  hiredate BETWEEN '81/01/01' and '81/06/09' ;

SELECT empno, ename, hiredate
FROM    emp
WHERE   hiredate >='81/01/01' and hiredate <='81/06/09' ;

-- 3- �������� salesman, clerk�� ������� �̸��� ������ ���

--IN �����ڷ� ǥ��(3���̻��϶����� ����)
SELECT ENAME, JOB
FROM    emp
WHERE   JOB IN ('SALESMAN' ,'CLERK') ;

--�ҹ��ڸ� �빮�ڷ� �ٲ��ֱ�
SELECT ENAME, JOB
FROM    emp
WHERE   JOB  = UPPER('salesman')  OR JOB  = UPPER('clerk') ;

--������ �빮���̱� ������ �빮�ڷ� �Է��ϴ� ���̴�!
SELECT ENAME, JOB
FROM    emp
WHERE   JOB  = 'SALESMAN'  OR JOB = 'CLERK' ;

-- 4- ������ president�̰� �޿��� 1500�̻��̰ų� ������ salesman�� ����� ������ ���

SELECT *
FROM    emp
WHERE   (JOB ='PRESIDENT' AND SAL>=1500)        --�ش��쿡�� �򰥸��� �ʰ� ()���ֱ�
         OR JOB ='SALESMAN';
        
-- 5- ������ president �Ǵ� salesman�̰� �޿��� 1500�̻��� ����� ������ ���
SELECT *
FROM    emp
WHERE   (JOB ='PRESIDENT' OR JOB ='SALESMAN')   --�ش��쿡�� �򰥸��� �ʰ� ()���ֱ� AND�� ��������� ���Ƽ� ���� �߻��� ���� ����    
        AND SAL>=1500 ;
        
-- 6- Ŀ�̼�(comm)�� ���� ����� �̸�, �޿�, Ŀ�̼��� ���
SELECT ename, sal, comm
FROM    emp
WHERE   comm is NULL OR COMM =0;

--  7- �����, �޿�, Ŀ�̼�, �ѱ޿�( �޿� + Ŀ�̼�)�� ���
SELECT ename, sal, comm , sal+nvl(comm,0) AS total_sal
FROM    emp;

-- 8- �̸� A�� �����ϴ� ����� ���
SELECT ename
FROM    emp
WHERE  ENAME LIKE 'A%';
--'%'(���ϵ�ī��) : ���̿� �������(���ھ��� ��쵵 ����) ��� ���� �����͸� �ǹ� 
--               : Ư������ �Ǵ� ���ڿ��� ��ü�аų� ���ڿ� �������� ������ ǥ���ϴ� Ư������ 

-- 9- �̸��� �ι�° ���ڰ� L�� ����� ���
SELECT ename
FROM    emp
WHERE  ENAME LIKE '_L%';
-- '-' : � ���̵� ������� �Ѱ��� ���� �����͸� �ǹ�

-- 10- �̸��� L�� �� �� �̻� ���Ե� ����� ���
SELECT ename
FROM    emp
WHERE  ENAME LIKE '%L%L%';
--%LL%�� ��� 'LL'(LL�� ��������)�� �� ����� ���´�.
-- 11- Ŀ�̼�(COMM)�� NULL�� �ƴ� ����� ��� ������ ���
SELECT *
FROM    emp
WHERE  COMM IS NULL OR COMM=0;

-- 12- ���ʽ��� �޿����� 10%�̻� ���� ��� ����� ���� �̸�, �޿�, ���ʽ��� ���
SELECT ENAME, SAL, COMM
FROM    emp
WHERE  COMM >=SAL*1.1;

-- 13- ������ clerk�̰ų� analyst�̰� �޿��� 1000, 3000, 5000�� �ƴ� ��� ����� ������ ���
SELECT *
FROM    emp
WHERE  (JOB ='CLERK' OR JOB ='ANALYST')
        AND SAL NOT IN(1000,3000,5000);

SELECT *
FROM    emp
WHERE  (JOB ='CLERK' OR JOB ='ANALYST')
        AND SAL !=1000 AND SAL != 3000 AND SAL !=5000;        

-- 14- �μ��� 30�̰ų� �Ǵ� �����ڰ� 7782�� ����� ��� ������ ���
SELECT *
FROM    emp
WHERE  DEPTNO =30 OR MGR =7782;

