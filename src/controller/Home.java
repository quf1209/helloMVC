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
@WebServlet("/home") //url ���� => index.jsp�� �ִ� a.href�� �ִ� MVC���� url�̴�.
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
		//����ڰ�  go to login page ��  go to help page�� ������ �� �Ķ���Ͱ��� �޾ƿ´�.
		
		String action = request.getParameter("action"); // /home/action=login�̳� action=help�� ������ �޾ƿ´�.
		String page = null;//view page �̵� �۾�
		
		if(action.equals("login"))
			page="/view/loginform.jsp"; //WwbContent���� �ؿ� view������ ���� �ű⿡ error.jsp help.jsp loginform.jsp�� �����.
		else if(action.equals("help"))
			page="/view/help.jsp";
		else
			page="/view/error.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);//�ش� page�� �̵���Ų��.
			
		
	}

}
