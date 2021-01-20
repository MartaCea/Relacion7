package ejercicio2;

import java.util.Scanner;

public class LineaMain {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		double x, y;
		char answ = 0;
		Punto puntoA, puntoB;
		Linea lin;
		
		// PUNTO A
		System.out.println("Introduzca la X del punto A: ");
		x = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduzca la Y del punto A: ");
		y = Double.parseDouble(teclado.nextLine());
		puntoA = new Punto(x, y);
		// PUNTO B
		System.out.println("Introduzca la X del punto B: ");
		x = Double.parseDouble(teclado.nextLine());
		System.out.println("Introduzca la Y del punto B: ");
		y = Double.parseDouble(teclado.nextLine());
		puntoB = new Punto(x, y);
		
		// HACER LA LINEA
		lin = new Linea(puntoA,puntoB);
		
		answ = menuLinea();
		answ = Character.toUpperCase(answ);
		opcionesMenuLinea(answ, lin);
		
	}
	
	public static char menuLinea() {
		char opcion = 0;
		
		System.out.println("1. Mover linea");
		if(opcion == 1) {
			System.out.println("A(arriba), B(abajo), I(izquierda), D(derecha)");
			opcion = teclado.nextLine().charAt(0);
		}
		// toString para mostrar linea
		System.out.println("2. Mostrar línea");
		System.out.println("3. Salir");
		opcion = teclado.nextLine().charAt(0);
		
		return opcion;
	}
	
	public static boolean opcionesMenuLinea(char answ, Linea lin) {
		double mover;
		char resp;
		boolean terminar = false;
		
		do {
			switch(answ) {
			case 1: {
				if(answ == 'A') {
					System.out.println("Cuanto la quieres mover?");
					mover = Double.parseDouble(teclado.nextLine());
					lin.moverArriba(mover);
				}else {
					if(answ == 'B') {
						System.out.println("Cuanto la quieres mover?");
						mover = Double.parseDouble(teclado.nextLine());
						lin.moverAbajo(mover);
					}else {
						if(answ == 'I') {
							System.out.println("Cuanto la quieres mover?");
							mover = Double.parseDouble(teclado.nextLine());
							lin.moverIzquierda(mover);
						}else {
							if(answ == 'D') {
								System.out.println("Cuanto la quieres mover?");
								mover = Double.parseDouble(teclado.nextLine());
								lin.moverDerecha(mover);
							}
						}
					}
				}
				break;
			}
			case 2:{
				lin.toString();
				break;
			}
			case 3:{
				System.out.println("Desea salir?");
				resp = teclado.nextLine().charAt(0);
				if(resp == 'S') {
					terminar = true;
				}
			}
			
			}	
		}while(terminar == false);
		
		return terminar;
	}
}
