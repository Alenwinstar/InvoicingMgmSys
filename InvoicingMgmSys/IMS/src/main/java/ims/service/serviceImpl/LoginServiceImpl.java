package ims.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ims.dao.daoImpl.UserDaoImpl;
import ims.dao.daoImpl.UserRoleDaoImpl;
import ims.entity.Program;
import ims.entity.User;
import ims.entity.User_role;
import ims.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Autowired
	public UserDaoImpl userDaoImpl;
	
	@Autowired
	public UserRoleDaoImpl userRoleDaoImpl;
	
	/**
	 * 1.驗證帳號是否存在
	 * 2.密碼是否正確
	 * return null: 代表1. 帳號錯誤找不到資料
	 * 					2. 密碼錯誤
	 */
	@Override
	public User checkAccount(String userName, String pwd) {
		// 透過USER取得該帳號資料
		User userdata = userDaoImpl.getSpecialData(userName);
		// 判斷是否有該資料
		if(userdata != null) {
			//　判斷密碼是否正確
			if(userdata.getPwd().equals(pwd)) {
				return userdata;
			}
			else 
				return null;
		}
		return null;
	}

	/**
	 * 1.使用取得的userId 去取得該user可用的program
	 */
	@Override
	public List<Program> getUseProgram(String userId) {
		List<Program> programList = null;
		List<User_role> roleList = null;
		List<String> programId = null;
		
		// 用userId去找多筆roleId
		roleList = userRoleDaoImpl.getAllData(userId);
		
		// 用roleId去找多筆的Program
		for(User_role value: roleList) {
			String roleId = value.getRole_id();// 取得角色id
			// 每個角色id取得各個programId(多個)FIXME:
			
		}
		
		return null;
	}

}
