--1. 2003�⿡ �Ի��� ������� ���, �̸�, �Ի����� ���
SELECT  employee_id,FIRST_NAME ||' '|| LAST_NAME   AS FULL_NAME, hire_date
FROM employees
WHERE TO_CHAR(hire_date, 'YYYY') = 2003;
?
--2. ������ FI_ACCOUNT / FI_MGR / SA_MAN / SA_REP �� ������� ������ ���
SELECT *
FROM  employees
WHERE JOB_ID IN ('FI_ACCOUNT' , 'FI_MGR' , 'SA_MAN' , 'SA_REP' );

select      *   
from        employees
where       job_id = 'FI_ACCOUNT' or job_id = 'FI_MGR' or job_id = 'SA_MAN' or job_id = 'SA_REP'

SELECT *
FROM employees
WHERE lower(job_id) = 'fi_account' or lower(job_id) = 'ft_mgr' 
    or lower(job_id) = 'sa_man' or lower(job_id) = 'sa_rep';
?

--3. Ŀ�̼��� �޴� ������� ����� ���
SELECT *
FROM  employees
WHERE COMMISSION_PCT!=0 ;

SELECT *
FROM employees
WHERE commission_pct is not null;

?
--4.������ SA_MAN �Ǵ� SA_REP�̸� "�Ǹźμ�"�� �� �ܴ� "�� �� �μ�"��� ���
SELECT  JOB_ID, decode( JOB_ID, 'SA_MAN', '�Ǹźμ�', 'SA_REP' ,'�Ǹźμ�', '�� �� �μ�') AS NEWDEPT
FROM employees;

SELECT job_id,
CASE job_id
    WHEN 'SA_MAN' THEN '�Ǹźμ�'
    WHEN 'SA_REP' THEN '�Ǹźμ�'
    ELSE '�Ǹźμ�'
    END as job
FROM employees;

--5. �������� �Ի��ڵ��� �ּұ޿�, �ִ� �޿�, �޿��� ���� �׸��� ��� �޿��� ���Ͻÿ�
SELECT to_char(hire_date, 'YYYY') year, min(SALARY) as MIN, max(SALARY)as MAX,  sum(SALARY) as SUM, ceil(AVG(SALARY)) as AVG
FROM  employees
GROUP BY TO_CHAR(HIRE_DATE,'YYYY')
ORDER BY TO_CHAR(HIRE_DATE,'YYYY') ASC;


--6. �μ��� ��� �޿��� $10,000 �̻��� �μ��� ���Ͻÿ�. ( ��ձ޿��� ���� ������ )
SELECT DEPARTMENT_ID, ceil(AVG(SALARY)) as AVG
FROM  employees
GROUP BY DEPARTMENT_ID
HAVING AVG(SALARY)>=10000
ORDER BY AVG(SALARY) DESC;
?
--7. �μ��� �ִ� �޿��� ���Ͻÿ�
SELECT DEPARTMENT_ID, max(SALARY)as MAX
FROM  employees
GROUP BY DEPARTMENT_ID;



