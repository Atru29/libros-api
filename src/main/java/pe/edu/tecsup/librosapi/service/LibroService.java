package pe.edu.tecsup.librosapi.service;

import java.util.List;

import pe.edu.tecsup.librosapi.entity.Libro;

public interface LibroService {
	
	public List<Libro> findAllLibros();
	
	public Libro save(Libro libro);
	
	public Libro editLibro(Libro libro);
	
	void eliminarLibro(Integer id);
	
	public Libro findByLibroId(Integer id);
	
}
