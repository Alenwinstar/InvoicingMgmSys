  /**
  �Ω�P�_�O�_�n�J�̦s�b
  **/
  SELECT * from [dbo].[User] 
    /**
	�ϥ�userId�A�h�����roleId(�h��)
	**/
  select * from [dbo].[User_role] 

  select * from [dbo].[Role]
    /**
	�ϥ�roleId�A�h�����programId(�h��)
	**/
  select * from [dbo].[Role_program]
    /**
	�ϥ�programId�A�h�����program_name
	**/
  select * from [dbo].[Program]




select distinct A.* from [dbo].[Program] as A
join 
(select B.* from [dbo].[Role_program] as B
left join [dbo].[Role] as C
on B.role_id = C.Role_id where B.Role_id='1111' or B.Role_id='1234') as D
on D.Program_id = A.Program_id