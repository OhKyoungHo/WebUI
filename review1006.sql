--1. ����� ��L���ڰ� �ִ� ����� ���� �̸�, ����, �μ���, ��ġ�� ���
--�Ϲݹ���
SELECT e.ename ename, e.job job, d.dname danme, d.loc loc
FROM emp e, dept d
WHERE e.deptno = d.deptno and e.ename LIKE '%L%';
--GROUP BY
--HAVING 
--ORDER BY
--ǥ��ȭ����
?SELECT e.ename ename, e.job job, d.dname danme, d.loc loc
FROM emp e INNER JOIN dept d
ON e.deptno = d.deptno
WHERE e.ename LIKE '%L%';

?
--2. �����ں��� ���� �Ի��� ����� ���� �̸�, �Ի���, ������ �̸�, ������ �Ի����� ���
--�Ϲݹ���
SELECT e1.ename, e1.hiredate, e2.ename , e2.hiredate
FROM emp e1,emp e2
WHERE e1.mgr = e2.empno and e1.hiredate< e2.hiredate;
--ǥ��ȭ
SELECT e1.ename, e1.hiredate, e2.ename , e2.hiredate
FROM emp e1 INNER JOIN  emp e2
ON e1.mgr = e2.empno and e1.hiredate< e2.hiredate;
??

--3. �Ʒ��� ����� ��� ( �����ڰ� ���� KING�� �����Ͽ� ��� ����� ��� )
--�Ϲ�
SELECT e1.empno, e1.ename , e1.mgr , e2.empno , e2.ename 
FROM emp e1,emp e2
WHERE e1.mgr = e2.empno(+) ;
--ǥ��ȭ
SELECT e1.empno empno, e1.ename ename, e1.mgr mgr, e2.empno empno , e2.ename ename
FROM emp e1 LEFT OUTER JOIN emp e2
ON e1.mgr = e2.empno;








?