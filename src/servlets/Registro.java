package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;
import modelo.UsuarioModelo;

@WebServlet("/Registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registro() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UsuarioModelo usuarioModelo = new UsuarioModelo();
		
		String nombre = request.getParameter("nombre");
		String contrasena = request.getParameter("password");
		String email = request.getParameter("email");

		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setContrasena(contrasena);
		usuario.setEmail(email);

		usuarioModelo.insertarUsuario(usuario);

		RequestDispatcher rd = request.getRequestDispatcher("sesion/autenticado.jsp");
		rd.forward(request, response);
	}

}
