package ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.entity.Program;
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
		List<Program> programList = null;
		// 1. 帳號密碼去DB查詢是否存在
		// 2. 若為錯誤的密碼也會回null
		if((userData = loginServiceImpl.checkAccount(userName, pwd)) != null) {
			
			String userId = userData.getUser_id();
			// 2. 用取得的userData裡的userId去找對應roleId(多筆)
			// 3. 使用roleId，去找對應programId(多筆)
			// 4. 使用programId， 去找對應program_name
			programList = loginServiceImpl.getUseProgram(userId);
			model.addAttribute("List", programList);
			
		}
		else {
			model.addAttribute("error", "error");
		}
	}
}
