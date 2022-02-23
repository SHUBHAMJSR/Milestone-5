package com.training.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.exceptions.DataAccessException;
import com.training.model.persistance.TraineeMgmt;
import com.training.model.service.TraineeService;
import com.training.model.service.TraineeServiceImpl;

@WebServlet("/traineeController.do")
public class TraineeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	   
	private TraineeService traineeService=new TraineeServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action= request.getParameter("action");
		if(action.equals("showAll")) {
			List<TraineeMgmt> trainees=null;
			try {
				trainees = traineeService.getAll();
			} catch (DataAccessException e) {
				e.printStackTrace();
			}
			request.setAttribute("trainees", trainees);
			request.getRequestDispatcher("showAll.jsp").forward(request, response);
		}
		else if(action.equals("add"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("addTrainee.jsp");
			rd.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id=Integer.parseInt(request.getParameter("trainee_id"));
		String tname=request.getParameter("trainee_name");
		String tbranch =request.getParameter("tbranch");
		double per=Double.parseDouble(request.getParameter("per"));
		
		TraineeMgmt training=new TraineeMgmt(id, tname, tbranch, per);
		traineeService.addTrainee(training);
		
		response.sendRedirect("traineeController.do?action=showAll");
}
}
