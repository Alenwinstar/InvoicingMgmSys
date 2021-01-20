  /**
  用於判斷是否登入者存在
  **/
  SELECT * from [dbo].[User] 
    /**
	使用userId，去找對應roleId(多筆)
	**/
  select * from [dbo].[User_role] 

  select * from [dbo].[Role]
    /**
	使用roleId，去找對應programId(多筆)
	**/
  select * from [dbo].[Role_program]
    /**
	使用programId，去找對應program_name
	**/
  select * from [dbo].[Program]




select distinct A.* from [dbo].[Program] as A
join 
(select B.* from [dbo].[Role_program] as B
left join [dbo].[Role] as C
on B.role_id = C.Role_id where B.Role_id='1111' or B.Role_id='1234') as D
on D.Program_id = A.Program_id