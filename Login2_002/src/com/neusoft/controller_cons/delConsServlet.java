package com.neusoft.controller_cons;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.ConsumerService;
import com.neusoft.services.ProductService;

/**
 * Servlet implementation class delConsServlet
 */
@WebServlet("/delCons")
public class delConsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delConsServlet() {
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
	  
		
		//ɾ���Ľڵ�
		

	   String bid0 = request.getParameter("bid1");
		System.out.println(bid0);
		ConsumerService del_Id=new ConsumerService();
			Integer bid1 = Integer.parseInt(bid0);
			System.out.println(bid1);
			int c2= del_Id.deleteConsumer(bid1);
			request.getRequestDispatcher("getConsPage?pageNo=1&pageSize=5").forward(request, response);
		   
		
		

	
	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
