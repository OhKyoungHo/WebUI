--SQL-����-1) �Ʒ� ��Ű���� ���� ������ 3.0 �̻��� �л����� �̸��� �����ִ� SQL�ۼ��Ͻÿ�
--
SELECT s.�й�, MIN(�̸�)                --���ĺ������� �ϱ� ���ؼ�
FROM  student s, enroll e
WHERE s.�й� = e.�й�
GROUP BY s.�й�
HAVING AVG(e.����)>=3.0;

SELECT e.deptno deptno, e.dname dname, d.deptno deptno, d.dname dname
FROM emp e FULL OUTER JOIN dept d
ON  e.deptno = d.deptno;