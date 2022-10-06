-- ��ü ����� �� ��� �޿����� ���� �޿��� �޴� ����� ����� ��ȸ
--��� �޿� ���ϱ�
select round(avg(sal)) from emp;

--�� ��� �޿����� ���� ��� ���� ��ȸ
select ename, sal from emp 
where sal < (select round(avg(sal)) from emp );
--���������� ()�� �����ִ°� ����
--���������� �����ʿ� ���ִ°� ����.
--���������� ���� ���� ��츸 �񱳿����� ����
--�������� ��� IN, NOT IN, ANY, ALL, EXISTS

-- ������ ���� ���� ����� ���� ��ȸ
select MAX(sal) from emp;

select * 
from emp 
where SAL >=(select MAX(sal) from emp);

-- ��� �޿����� ���� �ִ� �޿����� ���� ������ �޴� ����� ������ ��ȸ
select * 
from emp 
where SAL >(select round(avg(sal)) from emp ) and SAL <(select MAX(sal) from emp);
--from�� �������̺��� �־ join�ϴ� ������ (from�� �������� �ִ� ���)
select e.*
from emp e, (select round(avg(sal)) avg, MAX(sal) max from emp) ext
where e.sal>ext.avg and e.sal <ext.max;

-- ���޼����� ���� 10���� ����� ���
SELECT*
FROM(SELECT ename, sal FROM emp ORDER BY sal desc) e
WHERE rownum<11;

select * 
from (select ename, sal from emp WHERE SAL !=0 ORDER BY SAL DESC) ext
WHERE rownum<11;

select * 
from  (select nvl(sal,0) from emp WHERE NVL(SAL,0)!=0 ORDER BY SAL DESC) ext
WHERE rownum<11;

select rownum, e.* 
from emp e
WHERE rownum<11 and SAL !=0
ORDER BY SAL DESC;

?

--1. SCOTT�� �޿����� ���� ����� ������ �����ȣ, �̸�, ������, �޿��� ���
SELECT   empno , ename , job , sal 
FROM    emp
WHERE   sal > (select sal from emp where ename = 'SCOTT');

SELECT empno, ename, job, sal
FROM emp
WHERE SAL >3000;
?
--?2. 30�� �μ��� �ּ� �޿����� ���μ��� �ּ� �޿��� ���� �μ��� ���
SELECT deptno, min(sal)
FROM emp
GROUP BY deptno
HAVING min(sal) >(SELECT min(sal) FROM emp WHERE deptno=30);

--3.�������� ��� �޿� �߿��� ���� ���� �޿��� ���� ������ ���
SELECT job, avg(sal)
FROM emp
GROUP BY job
HAVING avg(sal) = (SELECT min(avg(sal)) FROM emp GROUP BY job);

SELECT s.job, round(min(s.avg),2) min
FROM ( SELECT job, avg(sal) avg FROM emp GROUP BY job ORDER BY avg(sal) ) s 
WHERE ROWNUM = 1
GROUP BY s.job;

SELECT  e.JOB, s.MIN(s.avg)
FROM emp e, (SELECT avg(sal) avg FROM emp GROUP BY JOB )s;

-- 4. �����ȣ�� 7521�� ������ ���� ��� 7934�� �������� �޿��� ���� �޴� ����� ������ ���
SELECT e.*
FROM emp e, ( SELECT job FROM emp WHERE empno = 7521 ) e1, ( SELECT sal FROM emp WHERE empno = 7934 ) e2
WHERE e.job = e1.job AND e.sal > e2.sal;


--?5. 'WARD'�� �μ��� ������ ���� ��� ��� ���
SELECT e.*
FROM emp e, 
    ( SELECT * FROM emp WHERE ename ='WARD' ) s1
WHERE e.deptno = s1.deptno AND e.job= s1.job;

-- �������� �ּ� �޿��� �޴� ����� ������ �����ȣ, �̸�, ������, �޿��� ���
SELECT empno, ename, job, sal
FROM emp e
WHERE  (job,sal) in( SELECT job,min(sal) FROM emp GROUP BY JOB ) ;

INSERT INTO emp(empno, ename, job, sal) VALUES(9999,'�׽�Ʈ', 'CLERK', 1250);
    
-- 10�� �μ� ������� ������ ������ ������ �˻�
SELECT job FROM emp WHERE deptno=10;
SELECT ename, job
FROM emp
WHERE job in (SELECT job FROM emp WHERE deptno=10);

SELECT job FROM emp WHERE deptno=10;
SELECT ename, job
FROM emp
WHERE job = any(SELECT job FROM emp WHERE deptno=10);

-- ��� �Ѹ��� ������κ��� ���� ���� �� �ִ� ����� ������ �����ȣ, �̸�, ������ ���
SELECT e1.ename ,e1.mgr, e2.ename, e2.empno FROM emp e1, emp e2 WHERE e1.mgr = e2.empno;

SELECT empno, ename, job
FROM emp e1
WHERE exists (SELECT * FROM emp e2 WHERE e1.empno = e2.mgr);
--ford/blake/king/jones/scott/clark
SELECT e3.empno, e3.ename, e3.job
FROM emp e3
WHERE e3.empno in (SELECT e2.empno FROM emp e1,emp e2 WHERE e1.mgr = e2.empno);

SELECT e3.empno, e3.ename, e3.job
FROM emp e3
WHERE e3.empno in (SELECT e1.empno FROM emp e1,emp e2 WHERE e2.mgr = e1.empno);
--�񱳴� 1��1 ����
--������������ �ΰ��� �̾Ƴ��� �񱳴���� �������� TOO MANY VALUES ���� �߻� 

--�Ϲ� ����� ���
SELECT empno, ename, job
FROM emp e1
WHERE not exists (SELECT * FROM emp e2 WHERE e1.empno = e2.mgr);

SELECT e3.empno, e3.ename, e3.job
FROM emp e3
WHERE e3.empno not in (SELECT e1.empno FROM emp e1,emp e2 WHERE e2.mgr = e1.empno);



