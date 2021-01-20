package ims.dao.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import ims.dao.RoleDao;
import ims.entity.Role;
import ims.utils.SQLConnectionUtil;

@Configuration
public class RoleDaoImpl implements RoleDao {

	// tableName
	private final String tableName = "[dbo].[Role]";
	
	@Autowired
	private SQLConnectionUtil  sqlConnectionUtil;
	
	@Override
	public List<Role> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getSpecialData(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
