package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioModelo extends Conector {
	public ArrayList<Usuario> selectAll() {

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "SELECT * FROM usuarios";
		try {
			Statement stt = super.conexion.createStatement();
			ResultSet rst = stt.executeQuery(sql);
			while (rst.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rst.getInt("id"));
				usuario.setNombre(rst.getString("nombre"));
				usuario.setContrasena(rst.getString("contrasena"));
				usuario.setEmail(rst.getString("email"));
				usuarios.add(usuario);
			}
			return usuarios;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}


	public Usuario comprobarLogin(String email, String contrasena) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM usuarios WHERE email = ? and contrasena = ?");
			pst.setString(1, email);
			pst.setString(2, contrasena);
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

	public void insertarUsuario(Usuario usuario) {
		try {
			PreparedStatement pst = super.conexion
					.prepareStatement("INSERT INTO usuarios (nombre, contrasena, email) values(?,?,?)");
			pst.setString(1, usuario.getNombre());
			pst.setString(2, usuario.getContrasena());
			pst.setString(3, usuario.getEmail());

			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
