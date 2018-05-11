package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioModelo extends Conector {



	public Usuario comprobarLogin(String email) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM usuarios WHERE email = ?");
			pst.setString(1, email);
			ResultSet rst = pst.executeQuery();

			if (rst.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rst.getInt("id"));
				usuario.setNombre(rst.getString("nombre"));
				usuario.setContrasena(rst.getString("contrasena"));
				usuario.setEmail(rst.getString("email"));

				return usuario;
			}
		} catch (SQLException e) {

			e.printStackTrace();

		}
		return null;

	}

	public Usuario select(int id) {
		return null;

	}

	public void delete(int id) {

	}

	public void update(Usuario usuario) {

	}

	public void insert(Usuario usuario) {

	}

	public ArrayList<Usuario> selectPorNombre(String nombre) {
		return null;

	}

	public ArrayList<Usuario> selectMenorDeEdad() {
		return null;

	}

	public ArrayList<Usuario> selectContieneEnApellido(String cadena) {
		return null;

	}

	public Usuario selectPorDni(String dni) {

		return null;

	}

	// devuelve un usuario que tenga ese dni y contrasena
	// si no devuelve null
	// se utiliza principalmente para loguearse

}
