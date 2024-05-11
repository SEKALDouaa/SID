package web;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			System.out.println("Execution d'un service");
			String name=req.getParameter("name");
			String email=req.getParameter("emailu");
			String pwd=req.getParameter("pwdu");
			
			
			System.out.println(name+" "+pwd+" "+ email);
			
			
			DataBase db=new DataBase(new MySQLDataSource("servlet"));
			
			RequestDispatcher dispatcher=null;
			
			HttpSession session = req.getSession();
			
			int insert=db.insertElement(new User(name,email,pwd));
			
			if(insert>0) {
				session.setAttribute("success", "You have been registered successfully!");
				dispatcher=req.getRequestDispatcher("index.jsp");
			}
			else {
				req.setAttribute("failed", "An error has occured");
				dispatcher=req.getRequestDispatcher("index.jsp");
			}

			dispatcher.forward(req, resp);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	protected void doGett(HttpServletRequest req, HttpServletResponse resp) {
		doPost(req,resp);
	}
}
