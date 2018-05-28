package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Libro;
import modelo.LibroModelo;
;

/**
 * Servlet implementation class BuscarPorTitulo
 */
@WebServlet("/BuscarPorTitulo")
public class BuscarPorTitulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarPorTitulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//recibir los datos
		 String titulo = request.getParameter("titulo");
		 
		//acceder al modelo para obtener los librps
		 LibroModelo modeloLibro = new LibroModelo();
		   ArrayList<Libro>  libros = modeloLibro.selectPorTitulo(titulo);
		   
		   Iterator<Libro> i = libros.iterator();
			Libro libro;
			LibroModelo libroModelo = new LibroModelo();
			
			while(i.hasNext()){
				libro = i.next();
			}
		    
		//meter el resultado en el request
			request.setAttribute("libros", libros);
		
		RequestDispatcher rd = request.getRequestDispatcher("listadoLibros.jsp");
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
