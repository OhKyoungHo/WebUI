-- 1. Zlotkey�� ������ �μ��� ���� ��� ����� �̸��� �Ի����� ǥ���ϴ� ���Ǹ� �ۼ��Ͻʽÿ�. 
-- Zlotkey�� �����Ͻʽÿ�.
SELECT * FROM employees WHERE DEPARTMENT_ID = 80;

SELECT FIRST_NAME ||' '|| LAST_NAME  FULL_NAME, hire_date
FROM employees
WHERE DEPARTMENT_ID in (SELECT DEPARTMENT_ID  FROM employees WHERE DEPARTMENT_ID = 80) AND LAST_NAME !='Zlotkey';

--2. �޿��� ��� �޿����� ���� ��� ����� ��� ��ȣ�� �̸��� ǥ���ϴ� ���Ǹ� �ۼ��ϰ�  ����� �޿��� ���� ������������ �����Ͻʽÿ�.
SELECT EMPLOYEE_ID, FIRST_NAME ||' '|| LAST_NAME  FULL_NAME, SALARY
FROM employees
WHERE SALARY>(SELECT AVG(SALARY)FROM employees)
ORDER BY SALARY;

--3. �̸��� u�� ���Ե� ����� ���� �μ����� ���ϴ� ��� ����� ��� ��ȣ�� �̸��� ǥ���ϴ����Ǹ� �ۼ��Ͻʽÿ�.
SELECT FIRST_NAME ||' '|| LAST_NAME  FULL_NAME FROM employees WHERE FIRST_NAME ||' '|| LAST_NAME like '%u%';

SELECT DEPARTMENT_ID, FIRST_NAME ||' '|| LAST_NAME  FULL_NAME
FROM employees
WHERE FIRST_NAME ||' '|| LAST_NAME  IN (SELECT FIRST_NAME ||' '|| LAST_NAME  FULL_NAME FROM employees WHERE FIRST_NAME ||' '|| LAST_NAME like '%u%');

--4. �μ� ��ġ ID�� 1700�� ��� ����� �̸�, �μ� ��ȣ �� ���� ID�� ǥ���Ͻʽÿ�.
SELECT e.DEPARTMENT_ID, d.LOCATION_ID FROM employees e, DEPARTMENTs d WHERE e.DEPARTMENT_ID =  d.DEPARTMENT_ID;
SELECT e.DEPARTMENT_ID, d.LOCATION_ID FROM employees e, DEPARTMENTs d WHERE d.LOCATION_ID=1700;

SELECT e.FIRST_NAME ||' '|| LAST_NAME  FULL_NAME, e.DEPARTMENT_ID, e.job_ID
FROM employees e
WHERE e.DEPARTMENT_ID in (SELECT e.DEPARTMENT_ID FROM employees e LEFT OUTER JOIN DEPARTMENTs d 
ON e.department_id = d.department_id WHERE d.LOCATION_ID=1700);


--5. King���� �����ϴ� ��� ����� �̸��� �޿��� ǥ���Ͻʽÿ�.
SELECT e.first_name||' '||e.last_name name, salary
FROM employees e
WHERE manager_id 
    IN ( select employee_id from employees WHERE last_name = 'King' );
    
SELECT employee_id  FROM employees  WHERE manager_id = 100;

SELECT FIRST_NAME ||' '|| LAST_NAME  FULL_NAME, SALARY
FROM employees
WHERE employee_id in (SELECT employee_id  FROM employees  WHERE manager_id = 100);

--6. Executive �μ��� ��� ����� ���� �μ� ��ȣ, �̸� �� ���� ID�� ǥ���Ͻʽÿ�.
SELECT e.department_id, e.first_name||' '||e.last_name name, job_id
FROM employees e
WHERE e.department_id
    IN ( select e.department_id 
         from employees e left outer join departments d
         on e.department_id = d.department_id
         WHERE d.department_name = 'Executive' );


SELECT * FROM employees WHERE DEPARTMENT_ID=90;

SELECT DEPARTMENT_ID, FIRST_NAME ||' '|| LAST_NAME  FULL_NAME, employee_id
FROM employees
WHERE department_id  =(SELECT department_id FROM departments WHERE department_name ='Executive');


--7. ��� �޿����� ���� �޿��� �ް� �̸��� u�� ���Ե� ����� ���� �μ����� �ٹ��ϴ� 
-- ��� ����� ��� ��ȣ, �̸� �� �޿��� ǥ���ϴ� ���Ǹ� �ۼ��Ͻʽÿ�.
SELECT EMPLOYEE_ID, FIRST_NAME ||' '|| LAST_NAME  FULL_NAME, SALARY
FROM employees
WHERE DEPARTMENT_ID in(SELECT  DEPARTMENT_ID FROM employees WHERE FIRST_NAME ||' '|| LAST_NAME like '%u%') 
and salary>(SELECT AVG(SALARY)FROM employees);





