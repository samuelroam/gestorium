package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class UsuarioVista {

	public void listaDeUsuarios() {
		UsuarioModelo usuarioModelo = new UsuarioModelo();
		ArrayList<Usuario> usuarios = usuarioModelo.selectAll();
		this.mostrarUsuarios(usuarios);
	}
	
	public void mostrarUsuarios(ArrayList<Usuario> usuarios){
		Iterator<Usuario> i = usuarios.iterator();
		while(i.hasNext()){
			Usuario usuario = i.next();
			this.mostrarUsuario(usuario);
		}
	}
	
	public void mostrarUsuario(Usuario usuario){
		
		
		System.out.println(usuario.getId()+ "\t - "+
				usuario.getNombre()+ "\t - "+
				usuario.getEmail()+ "\t - "+
				usuario.getContrasena());
	}
}
