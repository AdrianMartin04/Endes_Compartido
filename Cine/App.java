package Cine;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	

	public App() {
		this.peliculas = new ArrayList<Pelicula>();
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public void cargarPeliculas(String fichero) throws FileNotFoundException {
		Scanner entrada = new Scanner(new File(fichero));
		// ArrayList<Pelicula>peliculas=new ArrayList<Pelicula>();
		String linea[];
		String cadena;
		entrada.nextLine();
		while (entrada.hasNext()) {
			cadena = entrada.nextLine();
			linea = cadena.split(";");
			this.getPeliculas().add(new Pelicula(Integer.parseInt(linea[0]), linea[1], linea[2], linea[3]));
		}

	}

	public void menu() {
		System.out.println("1) Añadir pelicula");
		System.out.println("2) Borrar pelicula");
		System.out.println("3) Mostrar peliculas");
		System.out.println("4) Buscar por genero");
		System.out.println("5) Salir");
		System.out.println("Elige una opcion");
	}

	public void menuDel() {
		System.out.println("Por que valor quieres borrar?");
		System.out.println("1) Año");
		System.out.println("2) Director");
		System.out.println("3) Genero");
		System.out.println("4) Nombre");
		System.out.println("5) Me he arrepentido");
	}

	public void borrarPelicula(int o, String s, int y) {

		switch (o) {
			case 1:
				for (int i = 0; i < peliculas.size(); i++) {
					if (this.getPeliculas().get(i).getYear() == y) {
						this.getPeliculas().remove(i);
					}
				}
				break;
			case 2:
				for (int i = 0; i < peliculas.size(); i++) {
					if (this.getPeliculas().get(i).getDirector().equalsIgnoreCase(s)) {
						this.getPeliculas().remove(i);
					}
				}
				break;
			case 3:
				for (int i = 0; i < peliculas.size(); i++) {
					if (this.getPeliculas().get(i).getDirector().equalsIgnoreCase(s)) {
						this.getPeliculas().remove(i);
					}
				}
				break;
			case 4:
				for (int i = 0; i < peliculas.size(); i++) {
					if (this.getPeliculas().get(i).getDirector().equalsIgnoreCase(s)) {
						this.getPeliculas().remove(i);
					}
				}
				break;
		}

	}

	public void addPelicula(int year, String d, String g, String n) {
		this.getPeliculas().add(new Pelicula(year, d, g, n));
	}

	public void buscarGenero(String ge) {
		for (Pelicula p : this.getPeliculas()) {
			if (p.getGenero().equalsIgnoreCase(ge)) {
				System.out.println(p);
			}

		}
	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sn = new Scanner(System.in);

		App app = new App();
		app.cargarPeliculas("cine.csv");
		// for (Pelicula pe : app.getPeliculas()) {
		// System.out.println(pe);
		// }

		int opcion = 0;
		do {
			app.menu();
			opcion = sn.nextInt();
			switch (opcion) {
				case 1:
					int year;
					String d;
					String g;
					String n;
					System.out.println("Dime el año de la pelicula");
					year = sn.nextInt();
					System.out.println("Dime el nombre del director");
					sn.nextLine();
					d = sn.nextLine();
					System.out.println("Dime el genero de la pelicula");
					g = sn.nextLine();
					System.out.println("Dime el nombre de la pelicula");
					n = sn.nextLine();
					app.addPelicula(year, d, g, n);
					break;
				case 2:
					int o = 0;
					// int
					do {

					} while (o != 5);
					// app.borrarPelicula(year, d, year);
					break;
				case 3:
					app.mostrarPeliculas();
					break;
				case 4:
					String ge;
					System.out.println("Dime el genero que quieres jugar");
					sn.nextLine();
					ge = sn.nextLine();
					app.buscarGenero(ge);
					break;
			}
		} while (opcion != 5);

	}

}
