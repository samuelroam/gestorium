package servlets;

import java.io.IOException;
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		/* out.println(email + password); */
		UsuarioModelo modeloUsuario = new UsuarioModelo();
		Usuario usuario = modeloUsuario.comprobarLogin(email);

		if (usuario != null && password.equals(usuario.getContrasena())) {
			
			Usuario usuarioLogueado = new Usuario();
			usuarioLogueado.setNombre(request.getParameter("email"));
			
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogueado", usuarioLogueado);
			
			response.sendRedirect("sesion/autenticado.jsp");
		} else {
			response.sendRedirect("fallo.html");
		} 

	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
