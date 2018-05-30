package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Libro;
import modelo.LibroModelo;


@WebServlet("/BuscarLibro")
public class BuscarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BuscarLibro() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		LibroModelo libroModelo = new LibroModelo();
		Libro libro = libroModelo.select(id);
		
		request.setAttribute("Libro", libro);
		
		RequestDispatcher rd = request.getRequestDispatcher("libros/verLibro.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
