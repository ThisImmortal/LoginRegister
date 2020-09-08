package com.userloginregister.testDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//set up connection variables
		String userName = "springstudent";
		String password = "springstudent";
		
		
		String jdbcURL = "jdbc:mysql://localhost:3306/user_login_register?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String driver = "com.mysql.jdbc.Driver";
		
		
		//get connection to database
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connection to database " + jdbcURL);
			
			Class.forName(driver);
			
			Connection myConn = DriverManager.getConnection(jdbcURL, userName, password);
			
			out.println("Success!");
			
			myConn.close();
			
			
			
			
		}  catch (Exception exc) {
			
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
