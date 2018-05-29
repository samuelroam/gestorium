package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LibroModelo extends Conector {

	public ArrayList<Libro> selectAll() {

		ArrayList<Libro> libros = new ArrayList<Libro>();
		

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros");
			while (rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setFecha(rs.getString("fecha"));
				libro.setEntregado(rs.getBoolean("prestado"));

				libros.add(libro);
			}
			return libros;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libros;
	}
	
	
	public void insertarLibro(Libro libro) {
		try {
			PreparedStatement pst = super.conexion
					.prepareStatement("INSERT INTO libros (titulo, autor, fecha, prestado) values(?,?,?,?)");
			pst.setString(1, libro.getTitulo());
			pst.setString(2, libro.getAutor());
			pst.setString(3, libro.getFecha());
			pst.setBoolean(3, libro.isEntregado());
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	public Libro select(int id) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from libros where id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				return libro;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public ArrayList<Libro> selectPorTitulo(String titulo) {
		ArrayList<Libro> libros = new ArrayList();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from libros where titulo like ?");
			pst.setString(1, "%"+ titulo + "%");
			ResultSet rs = pst.executeQuery();

			//si hemos recibido alguna fila
			while (rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setFecha(rs.getString("fecha"));
				libros.add(libro);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libros;
	}
	
	public ArrayList<Libro> selectPorAutor(String autor) {
		ArrayList<Libro> libros = new ArrayList();
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from libros where autor like ?");
			pst.setString(1, "%"+ autor + "%");
			ResultSet rs = pst.executeQuery();

			//si hemos recibido alguna fila
			while (rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setFecha(rs.getString("fecha"));
				libros.add(libro);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libros;
	}

	
	public void delete(int id) {

		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("delete from libros where id = ?");
			pst.setInt(1, id);

			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(Libro libro) {

		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("update libros set titulo=?, autor=? where id=?");
			pst.setString(1, libro.getTitulo());
			pst.setString(2, libro.getAutor());
			pst.setInt(3, libro.getId());

			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public boolean estaDisponible(Libro libro){
		
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from libros where id= ? and prestado=0");
			pst.setInt(1, libro.getId());
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				return false;
			}else{
				return true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		return false;
		
	}
	
	
	public void prestar(Libro libro) {
		PreparedStatement pst;
		try {
			pst = super.conexion.prepareStatement("UPDATE libros SET prestado=? WHERE id=?");
			pst.setBoolean(1, libro.isEntregado());
			pst.setInt(2, libro.getId());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
