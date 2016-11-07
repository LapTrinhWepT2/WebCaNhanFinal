package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

import dao.UsersDAO;
import model.Users;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/UsersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UsersDAO usersDAO = new UsersDAO();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String command = request.getParameter("command");
		String url="";
		Users users = new Users();
		HttpSession session = request.getSession();
		switch(command){
			case"login":
				users = usersDAO.login(request.getParameter("user_name"), request.getParameter("pass"));
				if(users !=null){
					session.setAttribute("user", users);
					url="/SV_HomePage.jsp";
				}else {
					request.setAttribute("error", "Error username or password");
					url="/login.jsp";
				}
				break;
		}
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
