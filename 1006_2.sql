create table stat_salary ( 

stat_date date not null, -- ��¥

dept_no number, -- �μ�

emp_count number, -- �����

tot_salary number, -- �޿��Ѿ�

avg_salary number ); -- �޿����

desc stat_salary;

select sysdate, deptno FROM emp GROUP BY deptno;

INSERT INTO stat_salary(stat_date, dept_no)
SELECT sysdate, deptno FROM emp GROUP BY deptno;

SELECT* FROM stat_salary;

--����� 
SELECT COUNT(*), SUM(sal), round(AVG(sal),1)
FROM emp
GROUP BY deptno;

UPDATE stat_salary ss
SET(emp_count, tot_salary, avg_salary)
= (SELECT COUNT(*), SUM(sal), round(AVG(sal),1)
FROM emp e
WHERE e.deptno = ss.dept_no 
GROUP BY deptno   );

CREATE TABLE emp_cp as select*from emp;
SELECT*FROM emp_cp;

--�μ����� 'SALES'�� ����� ���� ����(EMP_CP)
DELETE FROM emp_cp e WHERE e.deptno=(SELECT d.deptno FROM dept d WHERE d.dname ='SALES');   

--������̺� �����ϴ� ����̸� ����� �޿��� 10% �λ��ϰ�, �������� �ʴ� ����̸� ������̺� ������ �Է��Ѵ�
merge into emp_cp ec
using emp e
on (ec.ename = e.ename)
when matched then
update set ec.sal = nvl(ec.sal*1.1,0)
when not matched then
insert(ec.empno, ec.deptno,ec.sal)values(e.empno, e.deptno, e.sal);
