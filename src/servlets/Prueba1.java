package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import modelo.*;

/**
 * Servlet implementation class Prueba1
 */
public class Prueba1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prueba1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Parámetros del servlet desde un formulario HTML</h1>");
	    out.println("<br> Nombre:"+request.getParameter("nombre") );
	    out.println("<br> Email:"+request.getParameter("email") );
	    out.println("<br> Contrasena:"+request.getParameter("contrasena") );
	    out.println("</body>");
	    out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
