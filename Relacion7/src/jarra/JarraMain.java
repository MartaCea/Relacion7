package jarra;

import java.util.Scanner;

public class JarraMain {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) throws JarraException {
		Jarra jarraA;
		Jarra jarraB;
		int opcion, cap;
		
		System.out.println("¿Cual es la capacidad de jarra A?");
		// cap = capacidad
		cap = Integer.parseInt(teclado.nextLine());
		jarraA = new Jarra(cap); 
		
		System.out.println("¿Cual es la capacidad de jarra B?");
		cap = Integer.parseInt(teclado.nextLine());
		jarraB = new Jarra(cap); 
		do {
			opcion = menuJarra();
		} while (opcion != 6);
		
	}
	// METODOS
	public static int menuJarra() {
		int opcion;
		System.out.println("1. Llenar jarra: ");
		System.out.println("2. Vaciar jarra: ");
		System.out.println("3. Volcar jarra A en B: ");
		System.out.println("4. Volcar jarra B en A: ");
		System.out.println("5. Ver estado de las jarras: ");
		System.out.println("6. Salir: ");
		opcion = Integer.parseInt(teclado.nextLine());
		return opcion;
	}
	
	public static char opcionesJarra(int opcion, Jarra jarraA, Jarra jarraB) {
		char resp = 0;
		char salir = 'n';
		switch(opcion) {
		case 1: {
			System.out.println("¿Que jarra desea llenar (A/B)?");
			resp = teclado.nextLine().charAt(0);
			resp = Character.toUpperCase(resp);
			if(resp == 'A') {
				jarraA.llenar();
			}else {
				if(resp == 'B') {
					jarraB.llenar();
				}
			}
			break;
		}
			
		case 2: {
			System.out.println("¿Qué jarra desea vaciar (A/B)?");
			resp = Character.toUpperCase(resp);
			if(resp == 'A') {
				jarraA.vaciar();
			}else {
				if(resp == 'B') {
					jarraB.vaciar();
				}
			}
			break;
		}
			
		case 3: {
			break;
		}
			
		case 4:{
			break;
		}
			
		case 5:{
			System.out.println(jarraA);
			System.out.println(jarraB);
			break;
		}
			
		case 6: {
			System.out.println("¿Desea salir?");
			if (salir == 's') {
				System.out.println("Gracias, hasta la proxima!!");
			}
			break;
		}
		}
		return salir;
		
	}
}
