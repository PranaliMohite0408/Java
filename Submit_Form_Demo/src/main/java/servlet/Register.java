package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = req.getParameter("user_name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String course = req.getParameter("course");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Name :" + name + "</h1>");
		out.print("<h1>Email :" + email + "</h1>");
		out.print("<h1>Password :" + password + "</h1>");
		out.print("<h1>Course: " + course + "</h1>");
		
	}

}
