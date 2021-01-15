package ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.entity.User;
import ims.service.serviceImpl.LoginServiceImpl;

@Controller
@RequestMapping("login")
public class LoginEntrance {
	
	@Autowired
	public LoginServiceImpl loginServiceImpl;

	@RequestMapping(value="byName", method=RequestMethod.POST)
	public void loginCheck(Model model, String userName, String pwd) {
		User userData = null;
		
		// 1. 帳號密碼去DB查詢是否存在
		if((userData = loginServiceImpl.checkAccount(userName, pwd)) != null) {
			
			String userId = userData.getUser_id();
			// 2. 用取得的userData裡的userId去找對應roleId(多筆)
			// 3. 使用roleId，去找對應programId(多筆)
			// 4. 使用programId， 去找對應program_name
			
		}
		else {
			model.addAttribute("error", "error");
		}
	}
}
