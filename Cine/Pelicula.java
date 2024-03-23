package Cine;

public class Pelicula {
	private int year;
	
	
	
	

	public Pelicula(int year, String director, String genero, String nombre) {
		super();
		this.year = year;
		this.director = director;
		this.genero = genero;
		this.nombre = nombre;
	}
	
	public Pelicula() {
		super();
		this.year = 0;
		this.director = "";
		this.genero = "";
		this.nombre = "";
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	@Override
	public String toString() {
		return "Pelicula [year=" + year + ", director=" + director + ", genero=" + genero + ", nombre=" + nombre + "]";
	}

	
}
