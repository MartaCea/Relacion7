package mascota;

import java.util.Scanner;

public class MainMonroyPet {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		MonroyPet mascota1, mascota2;
		int opcion;
		
		try {
			mascota1 = crearMascota();
			mascota2 = crearMascota();
			do {
				opcion = menuMascota();
				opcionesMascota(opcion, mascota1, mascota2);
			} while (opcion != 5);
		} catch (MonroyPetException e) {
			System.out.println(e.getMessage());
		}

		

	}
	/*
	 * El programa principal debe crear dos mascotas (mascota1 y mascota2) y mostrar un menú con estas opciones
	 * 
	 * 1.Dar comida a la mascota: Se solicitará  la mascota a la que se le da comida (1-2) 
	 * y se le darácomida. Si se produce algún error se  mostrará por pantalla.
	 * 
	 * 2.Comprar comida: Se solicitará la mascota a la que se compra comida  (1-2) y cuanta comida.Si se produce algún error 
	 * se  mostrará por pantalla.
	 * 
	 * 3.Jugar: Se solicitará la mascota que quiere jugar (1-2) y cuantos minutos. Si se produce algúnerror se  mostrará por pantalla.
	 * 
	 * 4.Información de mascotas: Se mostrarán los datos de las dos mascotas.
	 * 
	 * 5.Salir.
	 */
	
	public static MonroyPet crearMascota() throws MonroyPetException {
		String nombre, tipo;
		MonroyPet mascota;
		
		System.out.println("Introduce el nombre de su mascota: ");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce su tipo (PERRO o GATO): ");
		tipo = teclado.nextLine();
		tipo = tipo.toUpperCase();
		
		mascota = new MonroyPet(nombre, tipo);
		
		return mascota;
	}
	
	public static int menuMascota() {
		int opcion;
		
		System.out.println("1. Dar comida a la mascota:");
		System.out.println("2. Comprar comida:");
		System.out.println("3. Jugar:");
		System.out.println("4. Informacion:");
		System.out.println("5. Salir");
		opcion = Integer.parseInt(teclado.nextLine());
		
		return opcion;
	}
	
	public static void opcionesMascota(int opcion, MonroyPet mascota1, MonroyPet mascota2) throws MonroyPetException {
		int opc, alimentos, minutos;
		
		switch(opcion) {
		case 1:{
			System.out.println("�A que mascota se la quieres dar? Mascota1 (1) o Mascota2 (2):");
			opc = Integer.parseInt(teclado.nextLine());
			
			if (opc == 1) {
				mascota1.darComida();
			}else {
				mascota2.darComida();
			}
			break;
		}
		
		case 2:{
			System.out.println("�A que mascota se la quieres dar? Mascota1 (1) o Mascota2 (2):");
			opc = Integer.parseInt(teclado.nextLine());
			
			System.out.println("�Cuanta comida quieres comprar?");
			alimentos = Integer.parseInt(teclado.nextLine());
			
			if (opc == 1) {
				mascota1.comprarComida(alimentos);
			}else {
				mascota2.comprarComida(alimentos);
			}
			break;
		}
		
		case 3:{
			System.out.println("�A que mascota se la quieres dar? Mascota1 (1) o Mascota2 (2):");
			opc = Integer.parseInt(teclado.nextLine());
			
			System.out.println("�Cuantos minutos quieres jugar?");
			minutos = Integer.parseInt(teclado.nextLine());
			
			if (opc == 1) {
				mascota1.jugar(minutos);
			}else {
				mascota2.jugar(minutos);
			}
			break;
		}
		
		case 4:{
			System.out.println(mascota1);
			System.out.println(mascota2);
			break;
		}
		}
	}
}
