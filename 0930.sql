--------------------------------------EMP---------------------------------------------------------
-- 8000�� ������� <�����̸�>�� �޿� 10000 �� �����ϼ���

INSERT INTO emp(empno, ename, sal) VALUES(8000, 'ȫ����', 10000);

SELECT *FROM emp;

--7788 ������� <�����̸�>�� �޿� 10000 �� �����ϼ���

INSERT INTO emp(empno, ename, sal) VALUES(7788, '����ȣ', 10000);  --����� ���Ʊ� ������(Ű�� ������ ���̿��� �浹) �����߻�

INSERT INTO emp(empno, ename, sal, deptno) VALUES(8001, 'ȫ�汹', 10000, 20);

SELECT *FROM emp;

INSERT INTO emp(empno, ename, sal, deptno) VALUES(8002, 'ȫ�浿', 10000, 50);--dept(����Ű)�� 50�� �������� ���� �����߻�

---------------------------------------------info-tab----------------------------------------------

INSERT INTO info_tab(tel, name, jumin, gender, age,home) VALUES('032' , 'ȫ��', '801212', '����', 33, '����');    --info_tab�� ���� �ֱ�

SELECT *FROM info_tab;

INSERT INTO info_tab VALUES('032' , 'ȫ��', '801212', '����', 33, '����'); -- ��ü �÷��� ���� �� �տ� �־���� �÷����� �Ƚᵵ �ȴ�, �� ������� ���� �ȴ�. �׷��� �������� ����!, �׳� �پ��°� ����!

INSERT INTO info_tab(TEL,NAME) VALUES('1001','ȫ�浿' );

INSERT INTO info_tab(TEL,NAME) VALUES('1002','��浿' );

INSERT INTO info_tab(TEL,NAME) VALUES('1002','�Ѹ�' );

INSERT INTO info_tab(NAME, JUMIN) VALUES('��浿' , '901212-1234567');

INSERT INTO info_tab(GENDER, AGE) VALUES('����', 22);

SELECT *FROM info_tab;


DELETE from INFO_TAB;
COMMIT;
ALTER TABLE info_tab ADD CONSTRAINT pk_info_tel PRIMARY KEY(tel);   --��� ���� ������ DATA DICTIONARY�� �����ϴµ�, ���� ���� �̸��� �ǹ� �ְ� �ο��ϸ� �����ϱ� ���⿡ ��Ģ���� ���������̸��� �����Ѵ�.

INSERT INTO info_tab(TEL,NAME) VALUES('1001','ȫ�浿' );

INSERT INTO info_tab(TEL,NAME) VALUES('1002','��浿' );

INSERT INTO info_tab(TEL,NAME) VALUES('1002','�Ѹ�' );    --TEL�� Ű�� ��Ƽ� ���� ���� ��ġ�� ������ �Էµ��� ����

INSERT INTO info_tab(NAME, JUMIN) VALUES('��浿' , '901212-1234567');--TEL�� ��� �Է� �Ұ���

INSERT INTO info_tab(GENDER, AGE) VALUES('����', 22);--TEL�� ��� �Է� �Ұ���

SELECT *FROM info_tab;

DROP TABLE INFO_TAB;    --info_tab ��ü�� ���� �� ���� ����

-----------------------------------------------------------------------------------------------
-- ALTER TABLE info_tab ADD CONSTRAINT pk_info_tel PRIMARY KEY(tel);   --��� ���� ������ DATA DICTIONARY�� �����ϴµ�, ���� ���� �̸��� �ǹ� �ְ� �ο��ϸ� �����ϱ� ���⿡ ��Ģ���� ���������̸�(PK)�� �����Ѵ�.
-- PRIMARY KEY�� null�� ������� �ʰ� �����ϰ� �ĺ�
-- PRIMARY ���� �ݵ�� �־�� �Է°���
CREATE TABLE info_tab 
(
    name    varchar2(10) NOT NULL,  -- ������ �Է��ؾ� �Ѵ�.(�ʼ� �Է»���)
    jumin   char(15),
    tel     varchar2(20),
    gender  varchar2(10),
    age     number(3),
    home    varchar2(20),
    CONSTRAINT pk_info_tel PRIMARY KEY (tel)
);

INSERT INTO info_tab(TEL,NAME) VALUES('1001','ȫ�浿' );   --�Է°���

INSERT INTO info_tab(TEL,NAME) VALUES('1002','��浿' );   --�Է°���

INSERT INTO info_tab(TEL,NAME) VALUES('1002','�Ѹ�' );    --TEL�� PK ���� ��ġ�� ������ �Էµ��� ����

INSERT INTO info_tab(NAME, JUMIN) VALUES('��浿' , '901212-1234567');--PK(TEL)�� ��� �Է� �Ұ���

INSERT INTO info_tab(GENDER, AGE) VALUES('����', 22);     --PK(TEL)�� ��� �Է� �Ұ���,�̸��� NULL �Է� �Ұ�
INSERT INTO info_tab(TEL, GENDER, AGE) VALUES(9999,'����', 22);   --�̸��� NULL �Է� �Ұ�

DROP TABLE INFO_TAB; 

--------------------------------------------------------------------------------------
CREATE TABLE info_tab 
(
    name    varchar2(10), 
    jumin   char(15),
    tel     varchar2(20),
    gender  varchar2(10),
    age     number(3),
    home    varchar2(20),
    CONSTRAINT pk_info_tel PRIMARY KEY (tel)
);
--���� ���� ����(name�� null �Է� �Ұ�)
ALTER  TABLE   info_tab  MODIFY  ( name varchar2(10) not null  );

--���� ���� �߰�
ALTER TABLE info_tab ADD CONSTRAINT uq_info_jumin UNIQUE(jumin);

--UNIQUE�� �Է����� �ʾƵ� �ȴ�, �����ϰ� �ĺ��ϴ� ���� ��� -> �ߺ�������,  ( PRIMARY KEY�� �����ϳ� null�� ���� )
--��UNIQUE�� NULL�� �Է� ����(������ �Է��ؾ� �ϴ� �� �ƴ�)�ϰ�, ��, ���� ��ġ�� �ȵȴ�. 
INSERT INTO info_tab(TEL,NAME, JUMIN) VALUES('20001' , 'ȫ����', '990101'); 
INSERT INTO info_tab(TEL,NAME, JUMIN) VALUES('20002' , 'ȫ����', '990101'); --�ֹ� ��ȣ�� UNIQUE�� �ɾ���Ƽ� �浹�߻�, �ԷºҰ�
INSERT INTO info_tab(TEL,NAME) VALUES('20003' , 'ȫȫ��');--�ش� ��쿡�� ���ǿ� JUMIN�� ���� �ʾҰ�, JUMIN���� NULL������ �־ �Ǳ� ������ �Է� ����

--CHECK �̿��ϱ�(�������� �Է�ó��)
ALTER TABLE info_tab ADD CONSTRAINT ck_info_gender CHECK(gender in ('����', '����')); 

INSERT INTO info_tab(TEL,NAME, gender) VALUES('10001' , 'ȫ����', '����'); 
INSERT INTO info_tab(TEL,NAME, gender) VALUES('30001' , 'ȫ����', '����'); --'����'�� �� �� �ֵ��� ����
INSERT INTO info_tab(TEL,NAME, gender) VALUES('30001' , 'ȫ����', '����');

ALTER TABLE info_tab MODIFY(gender varchar2(6) default '����');

INSERT INTO info_tab(tel, name) VALUES('7777','ȫ��');

INSERT INTO info_tab( name, tel, jumin ) VALUES('������', '02-777-4444', '990909-1234567');

INSERT INTO info_tab( name, tel, jumin, gender, age, home ) VALUES('������','03-555-5555', '880808-1234567', '����', 27,'���');-- CHECK ����, ���ڷ� �����Ǿ �Է� �Ұ�

?
INSERT INTO info_tab( name, tel, jumin, gender, age, home ) VALUES('ȫ�浿','03-031-0310', '900909-1234567', '����', 27,'���'); 

?
INSERT INTO info_tab( name, jumin) VALUES('ȫ����', '550505-1234567'); --��ȭ��ȣ(PK)�� ��� �Է� �Ұ�

INSERT INTO info_tab( tel, jumin ) VALUES('031-777-7777', '700707-1234567');    --�̸� �Է� ���ؼ� �Է� �Ұ�

INSERT INTO info_tab( name, tel, jumin ) VALUES('������', '031-000-0000', '700707-1234567'); --�Է� ����

DROP TABLE INFO_TAB; 

------------------------------------------------------------------------------------------------
CREATE TABLE info_tab 
(
    name    varchar2(10) NOT NULL, 
    jumin   char(15),
    tel     varchar2(20),
    gender  varchar2(10) DEFAULT '����',  -- ���������� �ƴ�����, �Է°��� ���� �� ����Ʈ ���������� �ڵ� �Էµ�
    age     number(3),
    home    varchar2(20),
    deptno  number(2),
    CONSTRAINT pk_info_tel PRIMARY KEY (tel),   --tel�� pk����
    CONSTRAINT uq_info_jumin UNIQUE (jumin),     -- jumin�� unique�� ����
    CONSTRAINT ck_info_gender CHECK (gender IN('����', '����')),    --GENDER�� CHECK ����
    CONSTRAINT fk_info_deptno FOREIGN KEY (deptno) REFERENCES dept(deptno)  -- �ٸ� ���̺��� PK�� ����
);

INSERT INTO info_tab(tel, name, deptno) VALUES('7777', '����', 20);
INSERT INTO info_tab(tel, name, deptno) VALUES('8888', '����', 22);   --�����߻� DEPT�� 22 ���� ����, �ԷºҰ�
INSERT INTO info_tab(tel, name) VALUES('9999', '¯��');  






