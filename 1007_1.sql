--VIEW
CREATE OR REPLACE VIEW v_emp  AS select empno, ename, deptno from emp;

SELECT * FROM v_emp;
DESC v_emp;

INSERT INTO v_emp VALUES(1000,'ȫ�浿',20); 
SELECT * FROM v_emp;
SELECT * FROM emp;
--�������̺� ������ �Է��ص� ���� ���̺� ������ ����.

INSERT INTO v_emp VALUES(1000,'ȫȫ��',20); --������ PK ���ǿ� �ɷ��� �Է� �Ұ�
INSERT INTO v_emp VALUES(1000,'ȫȫ��',90); --������ FK ���ǿ� �ɷ��� �Է� �Ұ�

--VIEW

CREATE OR REPLACE VIEW v_emp  AS 
select empno, ename, deptno from emp
WITH READ ONLY;

INSERT INTO v_emp VALUES(1000,'ȫȫ��',30); --READ ONLY(�б�����)�� �Ǿ �Է� �Ұ�


--[ ���� ] EMP ���̺��� 30�� �μ��� EMPNO�� EMP_NO�� ENAME�� NAME�� SAL�� SALARY�� �ٲ㼭 EMP_30 �並 �����Ͻÿ�

CREATE OR REPLACE VIEW emp_30  AS 
select empno EMP_NO, ename NAME, SAL SALARY
from emp WHERE deptno=30
WITH READ ONLY;

SELECT * FROM emp_30;

Create or replace view v_emp_info as
select e.empno empno, e.ename ename, d.dname dname 
from emp e, dept d
where e.deptno=d.deptno;

SELECT * FROM v_emp_info;

INSERT INTO v_emp_info(empno, ename, dname) VALUES(3333,'�Ͳ���',30);  
--v_emp_info�� �� ���̺��� �������� ���� ���̶� �ϳ��� �信�� �ΰ��� ���̺� ���� �� �� ����

INSERT INTO v_emp_info(empno, ename) VALUES(3333,'�Ͳ���');  
DELETE FROM v_emp_info WHERE empno=7788;
--view���� ������ ������ ��� ���� ���̺����� ������
-- view�� �б� �������� ����°� ����!

--[ ���� ] �μ����� �μ���, �ּұ޿�, �ִ� �޿�, �μ��� ��� �޿��� �����ϴ� V_DEPT_SUM �並 �����Ͽ���.
Create or replace view V_DEPT_SUM as
select  d.dname �μ���, min(e.sal) �ּұ޿�, max(e.sal) �ִ�޿�, round(avg(e.sal)) �μ���_��ձ޿�
from emp e, dept d
where e.deptno=d.deptno
GROUP BY d.dname
WITH READ ONLY;

SELECT * FROM V_DEPT_SUM;

INSERT INTO emp(empno,ename,sal,deptno) VALUES(4444,'ȣ��', 9900,20); 
--VIEW�� ������ ���̺��� �����ϴ� ���̶�� ���� �� �� �ִ�.

CREATE  SEQUENCE   seq_temp;
SELECT seq_temp.NEXTVAL FROM DUAL;  --������ ������ ��
SELECT seq_temp.CURRVAL FROM DUAL;  --������ ������ ��

--5000������ 10�� �����ϴ� �ڵ�������(������)
CREATE  SEQUENCE   seq_temp2
start with 5000 
increment by 10;

INSERT INTO emp(empno, ename) VALUES(seq_temp2.NEXTVAL,'�ھ�');

SELECT seq_temp2.CURRVAL FROM DUAL;

--INDEX
DESC EMP;
select empno, ename, job, rowid from emp;

CREATE TABLE emp_copy2 as select*from emp;


