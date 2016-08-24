package com.duitang.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.duitang.algorithm.NumUtils;


public class NumHandle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		NumUtils nu = new NumUtils();
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter writer=null;
		try{
			writer=response.getWriter();
			writer.println(nu.handle(request.getParameter("num")));//将得到的结果输出到页面上
		}catch(IOException e){
			e.printStackTrace();
		}




		
	}

}
