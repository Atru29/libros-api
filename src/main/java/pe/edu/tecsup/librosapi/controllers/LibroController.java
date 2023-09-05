package pe.edu.tecsup.librosapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.tecsup.librosapi.entity.Libro;
import pe.edu.tecsup.librosapi.service.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {

	@Autowired
	private LibroService libroService;

	@GetMapping("/listarLibros")
	public List<Libro> listarRegistrosProductos() {
		return libroService.findAllLibros();
	}
	@PostMapping("/guardarLibro")
    public Libro saveLibro(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @PutMapping("/editLibro")
    public Libro editLibro(@RequestBody Libro libro) {
        return libroService.editLibro(libro);
    }

    @DeleteMapping("/elminarLibro/{id}")
    public void deleteLibro(@PathVariable("id") Integer id) {
        libroService.eliminarLibro(id);
    }

    @GetMapping("/buscarLibroId/{id}")
    public Libro libroPorId(@PathVariable("id") Integer id) {
        return libroService.findByLibroId(id);
    }
}
