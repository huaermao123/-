package com.neusoft.controller_cons;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.services.getConsByPageService;
import com.neusoft.services.getProByPageService;

/**
 * Servlet implementation class getConsPageNoPageSize
 */
@WebServlet("/getConsPage")
public class getConsPageNoPageSize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getConsPageNoPageSize() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		//��ҳ��ѯ
		
		response.setContentType("text/html;charset=\"utf-8\"");
		request.setCharacterEncoding("utf-8");
		getConsByPageService ff=new getConsByPageService();
		
		ff.getConsLogic(request, response);
		
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
