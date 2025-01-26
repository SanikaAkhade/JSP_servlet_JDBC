package com.login.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.login.bean.LoginBean;

import com.login.database.LoginDao;

/* Servlet implementation class LoginServlet*/
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		LoginBean loginbean=new LoginBean();
		loginbean.setUsername(username);
		loginbean.setPassword(password);
		
		try {
			if(LoginDao.validate(loginbean)) {
				HttpSession session = request.getSession();
				session.setAttribute("username",username);
				response.sendRedirect("loginSuccessful.jsp");
			}else {
				HttpSession session=request.getSession();
				session.setAttribute("user",username);
				response.sendRedirect("login.jsp");
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
