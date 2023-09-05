package pe.edu.tecsup.librosapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.librosapi.entity.Libro;
import pe.edu.tecsup.librosapi.repository.LibroRepository;
import pe.edu.tecsup.librosapi.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroRepository libroRepository;

	@Override
	public List<Libro> findAllLibros() {
		return libroRepository.findAll();
	}

	@Override
	public Libro save(Libro libro) {
		return libroRepository.save(libro);
	}

	@Override
	public Libro editLibro(Libro libro) {
		return libroRepository.save(libro);
	}

	@Override
	public void eliminarLibro(Integer id) {
		libroRepository.deleteById(id);
	}

	@Override
	public Libro findByLibroId(Integer id) {
		Optional<Libro> libroOptional = libroRepository.findById(id);
		Libro libro = new Libro();
		if (libroOptional.isPresent()) {
			return libroOptional.get();
		}else {
			throw new RuntimeException("No existe un Libro con el Id " + id);
		}
	}

}
