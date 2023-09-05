package pe.edu.tecsup.librosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.tecsup.librosapi.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
