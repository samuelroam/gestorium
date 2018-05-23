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

import modelo.*;


@WebServlet("/ListarUsuarios")
public class ListarUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListarUsuarios() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//conseguir usaurios
		UsuarioModelo usuarioModelo = new UsuarioModelo();
	    ArrayList<Usuario> usuarios = usuarioModelo.selectAll();
	    
		Iterator<Usuario> i = usuarios.iterator();
		Usuario usuario;
		UsuarioModelo modeloUsuario = new UsuarioModelo();
		
		while(i.hasNext()){
			usuario = i.next();
		}
		
		//enviar datos
		request.setAttribute("usuarios", usuarios);
		
		//meterlos en el request
		RequestDispatcher rd = request.getRequestDispatcher("listaUsuarios.jsp");
		rd.forward(request, response);
		
		
		
		//abrir vista listaUsuarios
	response.getWriter().println("soy servlet listar usuarios");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
