package ims.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import ims.dao.UserDao;
import ims.entity.Program;
import ims.entity.User;
import ims.utils.SQLConnectionUtil;

@Configuration
public class UserDaoImpl implements UserDao {
	
	// tableName
	private final String tableName = "[dbo].[User]";

	@Autowired
	private SQLConnectionUtil  sqlConnectionUtil;
	

	@Override
	public User getSpecialData(String userName) {
		User user = null;
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM " + tableName);
		sql.append(" WHERE User_name='"+ userName +"'");
		try(
				Connection conn = sqlConnectionUtil.getDataSource().getConnection();
				PreparedStatement pstate = conn.prepareStatement(sql.toString());
				){
			ResultSet rs = pstate.executeQuery();
			// 得到的資料基本上只會有一筆
			while(rs.isBeforeFirst()) {
				user.setUser_id(rs.getString("User_id"));
				user.setUser_name(rs.getString("User_name"));
				user.setGender(rs.getString("Gender"));
				user.setBirthday(rs.getString("Birthday"));
				user.setEmail(rs.getString("Email"));
				user.setCellphone(rs.getString("Cellphone"));
				user.setAddress(rs.getString("Address"));
				user.setPwd(rs.getString("Pwd"));
				user.setOn_job_date(rs.getString("On_job_date"));
				user.setOff_job_date(rs.getString("Off_job_date"));
				user.setFigure(rs.getBytes("Figure"));
				user.setCrt_time(rs.getTimestamp("Crt_time"));
				user.setUpd_time(rs.getTimestamp("Upd_time"));
			}
			return user;
		} catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}


	/**
	 * 	列出該userID可使用的program
	 */
	@Override
	public List<Program> getUsefulProgram(String userId) {
		List<Program> ProgramList = new ArrayList<>();
		
		return null;
	}

}
