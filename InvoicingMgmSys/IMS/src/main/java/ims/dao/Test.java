package ims.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.utils.SQLConnectionUtil;

@Service
public class Test {

	@Autowired
	private SQLConnectionUtil sqlConnectionUtil;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Integer insert() {
		Integer result = 0;
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO [dbo].[User] (User_id, User_name, Gender, Birthday, Email, Cellphone, Address, Pwd, On_job_date, Crt_time, Upd_time) ");
		sql.append(" values ('123', 'dan', '1', '20200111', 'd@d.com', '0952361685', 'specila特殊地址asdf', '123456', '20200111', getdate(), getdate())");
		try(
				Connection conn = sqlConnectionUtil.getDataSource().getConnection();
				PreparedStatement pstate = conn.prepareStatement(sql.toString());				
				){
			pstate.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		}
		
		
		return result;
	}

}
