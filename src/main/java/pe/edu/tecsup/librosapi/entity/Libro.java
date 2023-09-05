package pe.edu.tecsup.librosapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		private String nombre;
		
		private String editorial;
		
		private Integer paginas;
		
		private String autor;
		
		private String genero;
		
		private Double precio;

		public Libro() {
			super();
		}

		public Libro(String nombre, String editorial, Integer paginas, String autor, String genero, Double precio) {
			super();
			this.nombre = nombre;
			this.editorial = editorial;
			this.paginas = paginas;
			this.autor = autor;
			this.genero = genero;
			this.precio = precio;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getEditorial() {
			return editorial;
		}

		public void setEditorial(String editorial) {
			this.editorial = editorial;
		}

		public Integer getPaginas() {
			return paginas;
		}

		public void setPaginas(Integer paginas) {
			this.paginas = paginas;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public Double getPrecio() {
			return precio;
		}

		public void setPrecio(Double precio) {
			this.precio = precio;
		}

		
		
}
