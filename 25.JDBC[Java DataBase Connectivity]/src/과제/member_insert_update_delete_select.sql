--member table  CRUD sql

--insert
insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate)
                values('aaaa','aaaa','����','�λ�� ������',37,'F',sysdate);
insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate)
                values('bbbb','bbbb','����','����� ������',23,'F',sysdate);
insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate)
                values('cccc','cccc','����','�����  ������',47,'T',sysdate);
                
--update pk
update member set 
    m_password='0000',
    m_name='�躯��',
    m_address='���ֵ���',
    m_age=20,
    m_married='T',
    m_regdate=sysdate
where m_id='aaaa';

--delete pk
delete from member where m_id='aaaa';

--select pk
select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member where m_id='bbbb';

--select All
select m_id,m_password,m_name,m_address,m_age,m_married,m_regdate from member;
desc member;