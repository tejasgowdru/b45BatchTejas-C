package com.webapplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InsertData() {
        super();
        // TODO Auto-generated consuctor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		// TODO Auto-generated method stub
	{
		  String param = request.getParameter("page");
		  if(param != null && param.equals("insertdata")) {
		   getServletContext().getRequestDispatcher("/insertdata.jsp").forward(request, response);
		  }
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Connection con= DBConnect.initializeDatabase();
			PreparedStatement st= con.prepareStatement("insert into trail(?,?)");
			st.setInt(1 ,Integer.valueOf(request.getParameter("id")));
			st.setString(2 ,request.getParameter("string"));
			st.executeUpdate();
			st.close();
			con.close();
			
			PrintWriter out = response.getWriter();
			out.println("<html><body><b><Successfully Inserted"+"</b></body></html>");
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
