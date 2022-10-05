--1. �̸��� ���� 'King' ����� ����� �μ����� ��� ( employees, departments )
SELECT  e.EMPLOYEE_ID , d.DEPARTMENT_NAME 
FROM employees e right outer join departments d
ON e.DEPARTMENT_ID = d.DEPARTMENT_ID
WHERE e.LAST_name ='King';


--2. �̸��� ���� 'King' ����� ����� �μ��� �׸��� �������� ��� ( employees, departments, jobs )
select e.EMPLOYEE_ID,d.DEPARTMENT_NAME, e.JOB_ID
from employees e right outer join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
where e.last_name = 'King';
?

--3. 2007�� ��ݱ⿡ �Ի��� ������� ����� �̸�, �Ի��� �׸��� �μ����� ���
--(*) Grant�� ���� �μ��� �������� ���� ���������� Grant�� ��µǷ���
select e.EMPLOYEE_ID,e.FIRST_NAME ||' '|| LAST_NAME  FULL_NAME, e.hire_date,d.DEPARTMENT_NAME
from employees e LEFT outer join departments d
on e.DEPARTMENT_ID = d.DEPARTMENT_ID
where to_char(hire_date,'YYYY/MM')<'2007/07' AND to_char(hire_date,'YYYY/MM')>'2007/01';
?
--4. 'Executive' �μ����� ����� �ش� ����� �Ŵ���(���) �̸��� ���
--(*) �Ŵ���(���)�� ���� ����� 'King'�� ��µǷ���
SELECT  e1.EMPLOYEE_ID,e1.LAST_NAME , e1.MANAGER_ID, e2. LAST_NAME 
FROM employees e1 right outer join employees e2
ON e1.MANAGER_ID = e2.EMPLOYEE_ID;


