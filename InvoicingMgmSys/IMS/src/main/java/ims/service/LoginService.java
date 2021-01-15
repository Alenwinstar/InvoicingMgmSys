/**
 * 	登入帳號時需要的業務邏輯
 * @author dan
 * @date 20210115
 * @version 1.0
 */
package ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import ims.dao.daoImpl.UserDaoImpl;
import ims.entity.Program;
import ims.entity.User;

@Configuration
public interface LoginService {
	
	/**
	 * 1.驗證帳號是否存在
	 * 2.密碼是否正確
	 */
	public User checkAccount(String userName, String pwd);
	
	/**
	 * 1.使用取得的userId 去取得該user可用的program
	 */
	public List<Program> getUseProgram(String userId);
	
}
