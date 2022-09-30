--1��
CREATE TABLE sawon
(
    sabun    number(6),
    sawon_name   varchar2(15),
    ubmu     varchar2(30),
    weolgub  number(10,2),
    buseo     number(3)
);
--2��  ���� ���̺��� sabun�� �⺻Ű�� ����
ALTER TABLE sawon ADD CONSTRAINT pk_sawon_sabun PRIMARY KEY(sabun);

--3�� �ִ� �ѱ� 10�ڸ��� jiyeok �÷��� �߰��ϵ� NULL ���� �Էµ��� �ʵ��� ����
ALTER TABLE sawon  ADD( jiyeok varchar2(30) not null);

SELECT *FROM sawon;

--4�� weolgub �÷��� ������ 7�ڸ��� ����
ALTER  TABLE  sawon  MODIFY  (  weolgub  number(7) );

--5�� ubmu�÷��� �����ߡ�, ������������, �������� �� ������ ������ �Էµǵ��� ����
ALTER TABLE sawon ADD CONSTRAINT ck_sawon_ubmu CHECK(ubmu in ('����', '��������', '����')); 

SELECT *FROM sawon;

--6�� ubmu�÷��� �����Ͱ� �Է��� �ȵ� ��� �����尪���� �����ߡ��� ����
ALTER  TABLE   sawon  MODIFY  ( ubmu  varchar2(30) default '����'  );

--7�� buseo ���̺��� �����ϼ���(buseo_no�� ���� 3�ڷ� �̷���� ��ȣ�� �⺻Ű,buseo_name�� �ִ� �ѱ� 10�ڸ�)
CREATE TABLE buseo 
(
buseo_no number(3),
buseo_name varchar2(30),
CONSTRAINT pk_buseo_no PRIMARY KEY (buseo_no)
);

--8�� sawon ���̺��� buseo �÷��� buseo ���̺��� buseo_no�� �����ϴ� �ܷ�Ű�� ����
ALTER TABLE sawon ADD CONSTRAINT fk_sawon_buseo FOREIGN KEY (buseo) REFERENCES buseo(buseo_no);

--9�� buseo ���̺� ������ �Է�
INSERT INTO buseo(buseo_no, buseo_name) VALUES(101,'����Ʈ��������������');
INSERT INTO buseo(buseo_no, buseo_name) VALUES(202,'������'); 
INSERT INTO buseo(buseo_no, buseo_name) VALUES(303,'�����ڿ���'); 

--10�� sawon ���̺� ������ �Է�
INSERT INTO sawon(sabun, sawon_name, weolgub, buseo, jiyeok) VALUES(8001, 'ȫ�浿�̱�', 100000,101, '�λ�'); 
INSERT INTO sawon(sabun, sawon_name, ubmu, weolgub, buseo, jiyeok) VALUES(8002, 'ȫ����', '�繫', 200000, 202, '��õ'); --'�繫'�� ������ ���� ����
INSERT INTO sawon(sabun, sawon_name, ubmu,  buseo, jiyeok) VALUES(8003, 'ȫ���', '����', 111, '����'); --�μ��� ������ ��� �Ұ�
INSERT INTO sawon(sabun, sawon_name,  weolgub,  jiyeok) VALUES(8004, 'ȫ�漮', 12345678,  '����'); --���ڰ� 8�ڸ��� �Ұ� 
INSERT INTO sawon(sabun, sawon_name, ubmu,  buseo, jiyeok) VALUES(8005, 'ȫ��ö', '��������', 303, '�Ǳ�'); 

--11�� sawon ���̺��� jiyeok �÷��� ����
ALTER TABLE sawon  DROP(jiyeok );

--12�� buseo ���̺��� buseo ���� �������ڿ��Ρ��� ���� ����
--�ٸ� �ڷᵵ buseo�� �����ϰ� �ֱ⶧���� ������ �� ����.��
DELETE FROM sawon WHERE buseo ='�����ڿ���';

--13�� sawon ���̺��� ��� ������ �����ϰ� ��������� ����
TRUNCATE TABLE sawon; 

--14�� 1~8 �ܰ������ ������ ���̺��� ���� �ϳ��� CREATE ������ �ۼ�
CREATE TABLE sawon
(
    sabun    number(6) ,
    sawon_name   varchar2(15),
    ubmu     varchar2(30) default '����',
    weolgub  number(7),
    buseo     number(3),
    jiyeok varchar2(30) not null,
    CONSTRAINT pk_sawon_sabun PRIMARY KEY(sabun),
    CONSTRAINT ck_sawon_ubmu CHECK(ubmu in ('����', '��������', '����')),
    CONSTRAINT fk_sawon_buseo FOREIGN KEY (buseo) REFERENCES buseo(buseo_no) --������ �ϱ����ؼ��� �ش� Ű�� �⺻Ű(PK)�� ���� �Ǿ� �־�� �Ѵ�.
);

CREATE TABLE buseo 
(
buseo_no number(3),
buseo_name varchar2(30),
CONSTRAINT pk_buseo_no PRIMARY KEY (buseo_no)
);
-------------------
DROP TABLE sawon;
DROP TABLE buseo;


