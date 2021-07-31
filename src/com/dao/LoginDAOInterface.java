package com.dao;

import java.sql.Connection;

import com.bean.User;

public interface LoginDAOInterface {
	
	public Connection getCon();
	public boolean checkLogin(User ob);

}
