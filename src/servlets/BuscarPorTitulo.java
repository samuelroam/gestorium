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
import modelo.LibroModelo;;

@WebServlet("/BuscarPorTitulo")
public class BuscarPorTitulo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BuscarPorTitulo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recibir los datos
		String titulo = request.getParameter("titulo");

		// acceder al modelo para obtener los librps
		LibroModelo modeloLibro = new LibroModelo();
		ArrayList<Libro> libros = modeloLibro.selectPorTitulo(titulo);

		Iterator<Libro> i = libros.iterator();
		Libro libro;
		LibroModelo libroModelo = new LibroModelo();

		while (i.hasNext()) {
			libro = i.next();
		}

		// meter el resultado en el request
		request.setAttribute("libros", libros);

		RequestDispatcher rd = request.getRequestDispatcher("libros/listadoLibros.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
