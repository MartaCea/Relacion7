package jarra;

import java.util.Scanner;

public class JarraMain {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) throws JarraException {
		Jarra jarraA;
		Jarra jarraB;
		int opcion, cap;
		
		try {
			System.out.println("¿Cual es la capacidad de jarra A?");
			// cap = capacidad
			cap = Integer.parseInt(teclado.nextLine());
			jarraA = new Jarra(cap); 
			
			System.out.println("¿Cual es la capacidad de jarra B?");
			cap = Integer.parseInt(teclado.nextLine());
			jarraB = new Jarra(cap); 
			
			do {
				opcion = menuJarra();
				opcionesJarra(opcion, jarraA, jarraB);
			} while (opcion != 6);
		} catch(JarraException e) {
			System.out.println(e.getMessage());
		}
		
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
		try {
		switch(opcion) {
		case 1: {
			System.out.println("¿Qué jarra desea llenar (A/B)?");
			resp = teclado.nextLine().charAt(0);
			resp = Character.toUpperCase(resp);
			if(resp == 'A') {
				jarraA.llenar();
			}else {
				jarraB.llenar();
			}
			break;
		}
			
		case 2: {
			System.out.println("¿Qué jarra desea vaciar (A/B)?");
			resp = Character.toUpperCase(resp);
			if(resp == 'A') {
				jarraA.vaciar();
			}else {
				jarraB.vaciar();
			}
			break;
		}
			
		case 3: {
			jarraA.volcar(jarraB);
			System.out.println("La cantidad de jarra A es");
			
			break;
		}
			
		case 4:{
			jarraB.volcar(jarraA);
			break;
		}
			
		case 5:{
			System.out.println(jarraA);
			System.out.println(jarraB);
			System.out.println("Se han consumido " + Jarra.getTotalAguaConsumida() + " litros");
			break;
		}
			
		case 6: {
			System.out.println("Â¿Desea salir?");
			if (salir == 's') {
				System.out.println("El total de agua para la jarra A " + jarraA.getTotalAguaConsumida() + " y jarra B " + jarraB.getTotalAguaConsumida());
			}
			break;
		}
		}
		}catch (JarraException e) {
			System.out.println(e.getMessage());
		}
		return salir;
		
	}
}
