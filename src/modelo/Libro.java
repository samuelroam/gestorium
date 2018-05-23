package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private String fecha;
	private ArrayList<Prestamo> prestamos;
	
	private Usuario usuario;
	private Date fechaPrestamo;
	private Date fechaLimite;
	private boolean entregado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public boolean estaPrestado(){
		Iterator<Prestamo> i = this.prestamos.iterator();
		Prestamo prestamo;
		
		while(i.hasNext()){
			prestamo = i.next();
			if(!prestamo.isEntregado()){
				return true;
			}
		}
		return false;
	}
	
	public boolean estaDisponible(){
		Iterator<Prestamo> i = this.prestamos.iterator();
		Prestamo prestamo;
		
		while(i.hasNext()){
			prestamo = i.next();
			if(!prestamo.isEntregado()){
				
				return false;
			}
		}
		//todos los prestamos estan entregados
		return true;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + "]";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
