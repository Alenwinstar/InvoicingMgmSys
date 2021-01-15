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