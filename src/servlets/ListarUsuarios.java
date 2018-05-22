package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.*;
/**
 * Servlet implementation class ListarUsuarios
 */
@WebServlet("/ListarUsuarios")
public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//conseguir usaurios
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Jon");
		usuarios.add(usuario);
		usuario = new Usuario();
		usuario.setNombre("Imanol");
		usuarios.add(usuario);
//		usuario = new Usuario();
//		usuario.setNombre(nombreUsuario);
//		usuarios.add(usuario);
		
		
		//enviar datos
		request.setAttribute("usuarios", usuarios);
		
		RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
		rd.forward(request, response);
		
		//meterlos en el request
		
		
		//abrir vista listaUsuarios
	response.getWriter().println("soy servlet listar usuarios");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
