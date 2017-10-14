package com.neusoft.controller_address;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.Address;
import com.neusoft.services.AdderssService;

/**
 * Servlet implementation class delAddrServlet
 */
@WebServlet("/delAddr")
public class delAddrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delAddrServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=\"utf-8\"");
		request.setCharacterEncoding("utf-8");
		
	    String adid1=request.getParameter("adid");
	    System.out.println(adid1);
	    AdderssService _addr=  new AdderssService();
	    
	    //Integer dd = Integer.parseInt(delId);
	    	  Integer adid=Integer.parseInt(adid1);
	    	  System.out.println(adid);
	    	 
	    	    int a= _addr.deleteAddr(adid);
	    	   request.getRequestDispatcher("getAddrPage?pageNo=1&pageSize=5").forward(request, response);
	   
		
		//request.getRequestDispatcher("getAddrPage?pageNo=1&pageSize=5").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
