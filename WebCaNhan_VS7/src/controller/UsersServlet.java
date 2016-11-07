package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UsersDao;
import model.Users;


@WebServlet("/UsersServlet")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UsersDao userDao = new 	UsersDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String command = request.getParameter("command");
		String url ="";
		Users users = new Users();
		HttpSession session = request.getSession();
		switch(command){
		case "login":
			users = userDao.login(request.getParameter("user_name"), request.getParameter("user_pass"));
			if(users !=null)
			{
				session.setAttribute("user_thongtin", users);
				url ="/index.jsp";
			}else{
				session.setAttribute("loi", "Nhap sai id hoac pass");
				url ="/login.jsp";
			}
			break;
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
