package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class LibroVista {

	public void listaDeLibros() {
		LibroModelo libroModelo = new LibroModelo();
		ArrayList<Libro> libros = libroModelo.selectAll();
		this.mostrarLibros(libros);
	}
	
	public void mostrarLibros(ArrayList<Libro> libros){
		Iterator<Libro> i = libros.iterator();
		while(i.hasNext()){
			Libro libro = i.next();
			this.mostrarLibro(libro);
		}
	}
	
	public void mostrarLibro(Libro libro){
		
		
		System.out.println(libro.getId()+ "\t - "+
				libro.getTitulo()+ "\t - "+
				libro.getAutor()+ "\t - "+
				libro.getFecha());
	}
}
