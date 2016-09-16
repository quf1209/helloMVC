package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home") //url 매핑 => index.jsp에 있는 a.href에 있는 MVC다음 url이다.
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//사용자가  go to login page 나  go to help page를 눌렀을 때 파라미터값을 받아온다.
		
		String action = request.getParameter("action"); // /home/action=login이나 action=help의 정보를 받아온다.
		String page = null;//view page 이동 작업
		
		if(action.equals("login"))
			page="/view/loginform.jsp"; //WwbContent폴더 밑에 view폴더를 만들어서 거기에 error.jsp help.jsp loginform.jsp를 만든다.
		else if(action.equals("help"))
			page="/view/help.jsp";
		else
			page="/view/error.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);//해당 page로 이동시킨다.
			
		
	}

}
