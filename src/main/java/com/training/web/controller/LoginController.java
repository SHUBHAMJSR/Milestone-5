package com.training.web.controller;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.model.exceptions.UserNotFoundException;
import com.training.model.persistance.User;
import com.training.model.service.UserService;
import com.training.model.service.UserServiceImpl;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private UserService userService= new UserServiceImpl();
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Optional<User>optUser= userService.getUser(username, password);
		User user=null;
		try{
			user= optUser.orElseThrow(()-> new UserNotFoundException("user not found"));
			System.out.println(user);
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("user", user);
			response.sendRedirect("traineeController.do?action=showAll");
		}catch(UserNotFoundException ex) {
			System.out.println("----------");
			response.sendRedirect("login.jsp?status=login failed");
			System.out.println("----------");
		}
	}

	

}