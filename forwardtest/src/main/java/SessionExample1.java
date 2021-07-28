

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SessionExample1")
public class SessionExample1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String season = request.getParameter("season");
		String fruit = request.getParameter("fruit");
		request.setAttribute("season", season);
		request.setAttribute("fruit", fruit);
		request.setAttribute("sessionId", request.getSession().getId());
		request.setAttribute("intervalTime", request.getSession().getMaxInactiveInterval());
		request.getRequestDispatcher("sessionexmaple/session1_1.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
