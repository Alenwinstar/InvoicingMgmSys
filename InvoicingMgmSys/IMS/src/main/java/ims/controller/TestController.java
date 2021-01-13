package ims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.dao.Test;


@Controller
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private Test test;
	
	@RequestMapping(value="doTest", method=RequestMethod.GET)
	public void dotest(Model model) {
		test.insert();
	}
	
}
