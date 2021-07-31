package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.LoginDAO;
import com.dao.LoginDAOInterface;


@Service("service")
public class LoginService implements LoginServiceInterface {
	
	@Autowired
	LoginDAOInterface  ld;
	
	public boolean checkLogin(User ob) {
		
		//LoginDAOInterface    ld=new LoginDAO();
		boolean b=ld.checkLogin(ob);
		
		return b;
	}

}
