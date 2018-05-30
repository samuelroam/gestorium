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


@WebServlet("/DevolverLibro")
public class DevolverLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DevolverLibro() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int idLibro = Integer.parseInt(request.getParameter("id"));
		
		LibroModelo libroModelo = new LibroModelo();
		Libro libro = libroModelo.select(idLibro);
		
		libro.setEntregado(false);
		
	    libroModelo.devolver(libro);

	    request.setAttribute("libro", libro);
	    
	    RequestDispatcher rd = request.getRequestDispatcher("libros/prestamoCorrecto.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
