package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.User;
import com.service.LoginService;
import com.service.LoginServiceInterface;

@Controller("loginController")
public class LoginController {
	
	@Autowired
	LoginServiceInterface    ls;
	
	
	@RequestMapping(value="/login1", method=RequestMethod.GET)
	public ModelAndView loginPageView() {
		ModelAndView  obj=new ModelAndView("login");
		return  obj;
	}
	
	@RequestMapping(value="/login2", method=RequestMethod.POST)
	public ModelAndView loginCheck(HttpServletRequest request) {
		
		String  userid = request.getParameter("userId");
		String  pass = request.getParameter("pass");
		
		
	//	LoginServiceInterface   ls=new LoginService();
		boolean  b=ls.checkLogin(new User(userid,pass));
		
		if(b) {
			ModelAndView  obj=new ModelAndView("success");
			return obj;
		}
		ModelAndView  fobj=new ModelAndView("failure");
		return fobj;
		
		
	}

}
