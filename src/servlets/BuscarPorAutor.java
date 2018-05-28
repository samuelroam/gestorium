package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;
import modelo.LibroModelo;

/**
 * Servlet implementation class BuscarPorAutor
 */
@WebServlet("/BuscarPorAutor")
public class BuscarPorAutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarPorAutor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibroModelo libroModelo = new LibroModelo();
	    ArrayList<Libro> libros = libroModelo.selectAll();
	    
	    
	    
	    String autor = request.getParameter("autor");
	    LibroModelo modeloLibro = new LibroModelo();
	    Libro libro = modeloLibro.selectPorAutor(autor);


	    Libro librop = new Libro();
	    librop.setTitulo(libro.getTitulo());
	    librop.setAutor(request.getParameter("autor"));
	    librop.setFecha(libro.getFecha());
	    libros.add(librop);


	    modeloLibro.selectPorAutor(autor);
	    
		
		
		request.setAttribute("Libro", libro);
		
		RequestDispatcher rd = request.getRequestDispatcher("searchProcess.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
