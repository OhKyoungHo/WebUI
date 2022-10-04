CREATE TABLE reg_tab( text varchar2(20) );

INSERT INTO reg_tab VALUES('TIGER');

INSERT INTO reg_tab VALUES('TIGGER');

INSERT INTO reg_tab VALUES('elephant');

INSERT INTO reg_tab VALUES('tiger');

INSERT INTO reg_tab VALUES('tiger2');

INSERT INTO reg_tab VALUES('tiger3');

INSERT INTO reg_tab VALUES('doggy');

INSERT INTO reg_tab VALUES('5doggy');

INSERT INTO reg_tab VALUES('DOG');

INSERT INTO reg_tab VALUES('DOG2');

INSERT INTO reg_tab VALUES('��');

INSERT INTO reg_tab VALUES('cat');

INSERT INTO reg_tab VALUES('catty');

INSERT INTO reg_tab VALUES('9catty');

INSERT INTO reg_tab VALUES('catwoman');

INSERT INTO reg_tab VALUES('�����');

INSERT INTO reg_tab VALUES('BAT');

INSERT INTO reg_tab VALUES('BATMAN');

INSERT INTO reg_tab VALUES('BATGIRL'); 

INSERT INTO reg_tab VALUES('0BATGIRL'); 

INSERT INTO reg_tab VALUES('����');

COMMIT;

--'^'�� ����, '$' �� ���� �ǹ�
-- 1.  text �÷��� ���ڿ����� 't'�� �����ϴ� ������ �˻�
SELECT*
FROM reg_tab
WHERE text LIKE 't%';

SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(text,'^t');


-- 2.  text �÷��� ���ڿ����� 't'�� ������ ������ �˻�
SELECT*
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, 't$');

SELECT*
FROM reg_tab
WHERE text LIKE '_%t';

-- 3. ù��° 't'�� �����Ͽ� 5��° 'r'�� �ִ� ������ �˻�
SELECT*
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, '^t...r');
?

-- 4. ���ڷ� ������ ������ �˻�
SELECT*
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, '[0-9]$');
?

-- 5. ���ڷ� �����ϴ� ����Ÿ �˻�
SELECT*
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, '^[0-9]');
?

-- 6. ���ڰ� �ƴ� ���ڷ� �����ϴ� ������ �˻�
SELECT*
FROM reg_tab
WHERE NOT REGEXP_LIKE(TEXT, '^[0-9]');

SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(text,'^[^0-9]');

-- 7. �빮�ڷ� �����ϴ� ������ �˻�
SELECT*
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, '^[A-Z]');

SELECT*
FROM reg_tab
WHERE TEXT BETWEEN 'A'and 'Z';
?

-- 8. �ҹ��� ���� ���ڷ� �����ϴ� ������ �˻�
SELECT*
FROM reg_tab
WHERE NOT REGEXP_LIKE(TEXT, '^[a-z]');

SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(text,'^[^a-z]');

SELECT*
FROM reg_tab
WHERE not TEXT BETWEEN 'a'and 'z';

?

-- 9. �ѱ۷� �����ϴ� ������ �˻�
SELECT*
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, '^[��-�R]');

SELECT*
FROM reg_tab
WHERE TEXT BETWEEN '��'and '�R';
?

-- 10. ������ �� 'gg'�� 'GG'�� ����ִ� ������ �˻�
SELECT*
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, 'gg')or  REGEXP_LIKE(TEXT, 'GG');

SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(text,'gg|GG');

SELECT * FROM reg_tab WHERE text LIKE '%gg%' or text  LIKE '%GG%';




