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

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UsuarioModelo modeloUsuario = new UsuarioModelo();
		Usuario usuario = modeloUsuario.comprobarLogin(email, password);

		if (usuario != null && password.equals(usuario.getContrasena())) {

			Usuario usuarioLogueado = new Usuario();
			String logUser = request.getParameter("email");
			usuarioLogueado.setNombre(logUser);

			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogueado", usuarioLogueado);

			RequestDispatcher rd = request.getRequestDispatcher("sesion/autenticado.jsp");
			rd.forward(request, response);
		} else {
			response.sendRedirect("fallo.html");
		}
	}

}
