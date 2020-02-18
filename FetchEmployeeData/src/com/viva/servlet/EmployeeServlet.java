package com.viva.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viva.beans.Employee;


public class EmployeeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		List<Employee> employees = new ArrayList<>();
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Vikrant");
		e1.setAge(23);

		Employee e2=new Employee();
		e2.setId(102);
		e2.setName("Kalan");
		e2.setAge(25);


		employees.add(e1);
		employees.add(e2);

		request.setAttribute("employees",employees);
		request.getRequestDispatcher("Employee.jsp").forward(request, response);
	}



}
