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