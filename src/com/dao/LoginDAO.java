package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.bean.User;


@Repository("dao")
public class LoginDAO  implements LoginDAOInterface
{
	
	
	public Connection getCon() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	
	public boolean checkLogin(User ob) {
		Statement st = null;
		ResultSet rs = null;
		//System.out.println(" inside dao uid:"+ob.getUid()+"pass:"+ob.getPwd());
		try {
			st = getCon().createStatement();
			String sql = "SELECT * FROM user_details WHERE id='" + ob.getUid()
					+ "' and pwd='" + ob.getUname() + "'";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
