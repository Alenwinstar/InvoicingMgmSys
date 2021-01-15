package ims.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ims.dao.daoImpl.UserDaoImpl;
import ims.entity.Program;
import ims.entity.User;
import ims.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Autowired
	public UserDaoImpl userDaoImpl;
	
	/**
	 * 1.驗證帳號是否存在
	 * 2.密碼是否正確
	 */
	@Override
	public User checkAccount(String userName, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 1.使用取得的userId 去取得該user可用的program
	 */
	@Override
	public List<Program> getUseProgram(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
