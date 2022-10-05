-----JOIN-----
--������̺�(EMP)�� ������ �μ����̺�(DEPT)�� �� ����� �μ����� ���
SELECT ename, dname
FROM  emp, dept;

SELECT emp.ename, dept.dname, dept.deptno
FROM emp,dept;

--JOIN : ������� ���� �ͳ��� ���
SELECT emp.ename, dept.dname, dept.deptno
FROM emp,dept
WHERE emp.deptno = dept.deptno;
--��Ī���� �ᵵ ��������
SELECT e.ename, d.dname, d.deptno
FROM emp e,dept d
WHERE e.deptno = d.deptno;

--�������� : ������ ������ �������� ���ڵ� �Ǵ� ��(������)
--�������
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e,dept d
WHERE e.deptno = d.deptno;
--ǥ��ȭ ���
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno;
--WHERE(������ ���� ���)

--�ܺ����� (������) : ���� �����͸� �����Ͽ� ����
--���� ���
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e,dept d
WHERE e.deptno = d.deptno(+);

SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e,dept d
WHERE e.deptno(+) = d.deptno;

--���ʴ� +�� ���� ��� ���� �߻�
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e,dept d
WHERE e.deptno(+) = d.deptno(+);

--ǥ��ȭ ���
--'+'�� �����ʿ� ������
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e LEFT OUTER JOIN dept d
ON  e.deptno = d.deptno;

--'+'�� ���ʿ� ������
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e RIGHT OUTER JOIN dept d
ON  e.deptno = d.deptno;

--���ʴ� +�� ���� ��쵵 ����
SELECT e.ename ename, d.dname dname, d.deptno deptno
FROM emp e FULL OUTER JOIN dept d
ON  e.deptno = d.deptno;

-- ������̺�(emp)�� �� ����� �Ŵ����� ��ȸ
-- EMP ���̺��� �ΰ� �ִٰ� �����ؼ� �غ���
--  ���̺� �ΰ��� �����ؼ� ���

--��������(MGR ���� ����� ���Ե��� ����)
SELECT e1.empno, e1.ename, e1.mgr,e2.empno, e2.ename
FROM emp e1, emp e2
WHERE e1.mgr=e2.empno;

SELECT e1.empno empno, e1.ename ename, e1.mgr mgr,e2.empno empno, e2.ename ename
FROM emp e1 INNER JOIN emp e2
ON e1.mgr=e2.empno;

--�ܺ�����(MGR ���� ������� ����)
SELECT e1.empno, e1.ename , e1.mgr ,e2.empno , e2.ename
FROM emp e1 , emp e2
WHERE e1.mgr=e2.empno(+);

SELECT e1.empno empno, e1.ename ename, e1.mgr mgr,e2.empno empno, e2.ename ename
FROM emp e1 LEFT OUTER JOIN emp e2
ON e1.mgr=e2.empno;

-----����------
--������
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK' --SMITH, ADAMS, JAMES, MILLER
    UNION
SELECT empno, ename, job, deptno FROM emp WHERE deptno=10; --CLARK, KING, MILLER
--�����տ� �ߺ��Ǵ� ������ �ι� ���
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK' --SMITH, ADAMS, JAMES, MILLER
    UNION ALL
SELECT empno, ename, job, deptno FROM emp WHERE deptno=10; --CLARK, KING, MILLER
--������
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK' --SMITH, ADAMS, JAMES, MILLER
   INTERSECT
SELECT empno, ename, job, deptno FROM emp WHERE deptno=10; --CLARK, KING, MILLER
--������
SELECT empno, ename, job, deptno FROM emp WHERE job='CLERK' --SMITH, ADAMS, JAMES, MILLER
    MINUS
SELECT empno, ename, job, deptno FROM emp WHERE deptno=10; --CLARK, KING, MILLER



--1. EMP ���̺��� �����ȣ, �̸�, ����, �μ���ȣ�� DEPT ���̺��� �μ���, �ٹ����� ���
SELECT e.empno empno, e.ename ename, e.job job, e.deptno deptno, d.dname dname, d.loc loc
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.empno empno, e.ename ename, e.job job, e.deptno deptno, d.dname dname, d.loc loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.empno empno, e.ename ename, e.job job, e.deptno deptno, d.dname dname, d.loc loc
FROM emp e RIGHT OUTER JOIN dept d
ON e.deptno = d.deptno;

SELECT e.empno , e.ename e, e.job , e.deptno , d.dname , d.loc 
FROM emp e , dept d
WHERE e.deptno(+) = d.deptno;

SELECT e.empno , e.ename e, e.job , e.deptno , d.dname , d.loc 
FROM emp e , dept d
WHERE e.deptno = d.deptno(+);


--2. SALESMAN ����� �����ȣ, �̸�, �޿�, �μ���, �ٹ����� ���
SELECT e.empno empno, e.ename ename, e.sal sal, e.job job,  d.dname dname, d.loc loc
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE JOB ='SALESMAN';

SELECT e.empno empno, e.ename ename, e.sal sal, e.job job,  d.dname dname, d.loc loc
FROM emp e LEFT OUTER JOIN dept d
ON e.deptno = d.deptno
WHERE JOB ='SALESMAN';

SELECT e.empno, e.ename , e.sal , e.job,  d.dname , d.loc 
FROM emp e ,dept d
WHERE e.deptno = d.deptno AND JOB ='SALESMAN';

SELECT e.empno, e.ename , e.sal , e.job,  d.dname , d.loc 
FROM emp e ,dept d
WHERE e.deptno(+) = d.deptno AND JOB ='SALESMAN';

SELECT e.empno, e.ename , e.sal , e.job,  d.dname , d.loc 
FROM emp e ,dept d
WHERE e.deptno= d.deptno(+)  AND JOB ='SALESMAN';


--3. ���ʽ�(comm)�� �޴� ����� ���� �̸�, �μ���, ��ġ�� ���
SELECT  e.ename ename, d.dname dname, d.loc loc
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE COMM !=0;

SELECT  e.ename , d.dname , d.loc 
FROM emp e , dept d
WHERE e.deptno = d.deptno AND COMM !=0;

--4. �μ��� �μ���� �޿� �հ踦 ���
SELECT   d.dname dname, sum(sal) as sum
FROM emp e, dept d
WHERE e.deptno = d.deptno
GROUP BY d.dname;

-- 5. ������ ��MANAGER���� ����� ������ �̸�, ����, �μ���, �ٹ����� ��� 
SELECT  e.ename ename,e.JOB JOB, d.dname dname, d.loc loc 
FROM emp e, dept d
WHERE job ='MANAGER';



