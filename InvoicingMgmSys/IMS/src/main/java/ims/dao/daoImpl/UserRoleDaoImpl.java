package ims.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import ims.dao.UserRoleDao;
import ims.entity.User_role;
import ims.utils.SQLConnectionUtil;

@Configuration
public class UserRoleDaoImpl implements UserRoleDao {
	
	// tableName
	private final String tableName = "[dbo].[User_role]";

	@Autowired
	private SQLConnectionUtil  sqlConnectionUtil;

	@Override
	public List<User_role> getAllData(String userId) {
		List<User_role> userRoleList = null;
		StringBuffer sql = new StringBuffer();
		sql.append("select Role_id from " + tableName);
		sql.append(" where User_id=?");
		
		try(
				Connection conn = sqlConnectionUtil.getDataSource().getConnection();
				PreparedStatement pState = conn.prepareStatement(sql.toString());
				){
			pState.setString(0, userId);
			ResultSet rs = pState.executeQuery();
			while(rs.next()) {
				User_role userRole = new User_role();
				userRole.setUser_id(userId);
				userRole.setRole_id(rs.getString("Role_id"));
				userRoleList.add(userRole);
			}
			return userRoleList;
		} catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User_role getSpecialData(String userRoleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
