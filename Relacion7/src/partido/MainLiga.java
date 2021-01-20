package partido;

import java.util.Scanner;

public class MainLiga {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) throws LigaException {
		String equipo = null, estadio = null, ciudad = null;
		Equipo equipoLocal, equipoLocal2 = null, equipoLocal3 = null;
		Equipo equipoVisit, equipoVisit2 = null, equipoVisit3 = null;
		Partido partido1, partido2 = null, partido3 = null;
		
		// Aparecera primero este porque no hemos tenido que meter ningun dato.
		// Hacemos el try-catch por si hubiese algun error que nos salte.
		try {
			
			equipoLocal = new Equipo("Real Madrid", "Santigo Bernabeu", "Madrid");
			equipoVisit = new Equipo("Betis", "Benito Villamarin", "Sevilla");
			partido1 = new Partido(10, equipoLocal, equipoVisit);
			
			partido1.ponerResultado("2-1");
			System.out.println(partido1);
		}catch (LigaException e) {
			System.out.println(e.getMessage());
		}

		// He decidido meter por teclado el nombre del equipo, estadio y ciudad.
		try {
			equiposFutbol();
			equipoLocal2 = new Equipo(equipo, estadio, ciudad);
			
			equiposFutbol();
			equipoVisit2 = new Equipo(equipo, estadio, ciudad);
			partido2 = new Partido(11, equipoLocal2, equipoVisit2);
			partido2.ponerResultado("0-0");
			
			
			equiposFutbol();
			equipoLocal3 = new Equipo(equipo, estadio, ciudad);
			
			equiposFutbol();
			equipoVisit3 = new Equipo(equipo, estadio, ciudad);
			partido3 = new Partido(12, equipoLocal3, equipoVisit3);
			partido3.ponerResultado("1-2");
			
		}catch (LigaException e) {
			System.out.println(e.getMessage());
		}
		
		// Saco por pantalla los quipos del partido 2 y del partido 3, tanto como la informacion de los partidos 2 y 3
		System.out.println("---Partido 2---");
		System.out.println(equipoLocal2);
		System.out.println(equipoVisit2);
		System.out.println(partido2);
		System.out.println("---Partido 3---");
		System.out.println(equipoLocal3);
		System.out.println(equipoVisit3);
		System.out.println(partido3);
		
	}
	public static void equiposFutbol() {
		String equipo, estadio, ciudad;
		
		System.out.println("Introduce el nombre del equipo:");
		equipo = teclado.nextLine();
		
		System.out.println("Introduce el estadio del equipo:");
		estadio = teclado.nextLine();
		
		System.out.println("Introduce la ciudad del quipo:");
		ciudad = teclado.nextLine();
	}
	
}
