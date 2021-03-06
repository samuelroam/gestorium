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


@WebServlet("/BuscarPorAutor")
public class BuscarPorAutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BuscarPorAutor() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String autor = request.getParameter("autor");
		 
		 LibroModelo modeloLibro = new LibroModelo();
		   ArrayList<Libro>  libros = modeloLibro.selectPorAutor(autor);
		   
		   Iterator<Libro> i = libros.iterator();
			Libro libro;
			LibroModelo libroModelo = new LibroModelo();
			
			while(i.hasNext()){
				libro = i.next();
			}
		    
		//meter el resultado en el request
			request.setAttribute("libros", libros);
			
			RequestDispatcher rd = request.getRequestDispatcher("libros/listadoLibros.jsp");
			rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
