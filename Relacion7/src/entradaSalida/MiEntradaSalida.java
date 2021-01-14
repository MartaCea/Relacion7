package entradaSalida;
import java.util.Scanner;

public class MiEntradaSalida {
	
	private static final String SI = "S";
	private static final String NO = "N";
	
	private static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Método que solicita un número entero por teclado.
	 * Si el dato no es entero vuelve a solicitarse
	 * @param mensaje String con el mensaje que se muestra 
	 * antes de pedir el entero
	 * @return El entero introducido por teclado
	 */
	public static int solicitarEntero (String mensaje) {
		int numero = 0;
		boolean error;
		
		do {
			try {
				System.out.println(mensaje);
				numero = Integer.parseInt(teclado.nextLine());
				error = false;
			} catch (NumberFormatException e) {
				error = true;
			}
			
		} while (error==true);
		
		return numero;
	}
	
	/**
	 * Método que solicita un entero mayor o igual a 0.
	 * Si es dato no es positivo o cero vuelve a solicitarse
	 * @param mensaje String con el mensaje que se muestra 
	 * antes de pedir el entero positivo
	 * @return El entero introducido por teclado
	 */
	public static int solicitarEnteroPositivo (String mensaje) {
		int numero = 0;
		boolean error = true;
		
		do {
			try {
				System.out.println(mensaje);
				numero = Integer.parseInt(teclado.nextLine());
				if (numero < 0) {
					System.out.println("El dato debe ser positivo");
					error=true;
				}
				else{
					error = false;
				}
			} catch (NumberFormatException e) {
				error = true;
			}
			
		} while (error );
		
		return numero;
	}
	
	/**
	 * Método que solicita un entero en el rango que queramos.
	 * Si no está en el rango vuelve a solicitarse
	 * @param mensaje String con el mensaje que se muestra antes de pedir
	 * el número entero.
	 * @param limiteInf int con el límite inferior
	 * @param limiteSup int con el límite superior
	 * @return int introducido por teclado, dentro del límite deseado
	 */
	public static int solcitarEnteroEnRango (String mensaje, int limiteInf, int limiteSup) {
		int numero = 0;
		int aux;
		boolean error = true;
		
		if (limiteInf > limiteSup) {
			aux = limiteSup;
			limiteSup = limiteInf;
			limiteInf = aux;
		}
		
		do {
			try {
				System.out.println(mensaje +"["+limiteInf+"-"+limiteSup+"]");
				numero = Integer.parseInt(teclado.nextLine());
				if (numero < limiteInf || numero > limiteSup) {
					System.out.println("Número fuera de rango");
					error = true;
				} else {
					error = false;
				}
				
			} catch (NumberFormatException e) {
				error = true;
			}
			
		} while (error);
		
		return numero;
	}
	
	/**
	 * Método que solicita un carácter por teclado.
	 * Si el dato introducido no es un carácter vuelve a solicitarse
	 * @param mensaje String con el mensaje que se muestra antes de pedir el carácter
	 * @return char con el carácter introducido
	 */
	public static char solicitarCaracter (String mensaje) {
		char c = 0;
		String cadena;
		boolean error = true;
		
		do {

			System.out.println(mensaje);
			cadena = teclado.nextLine();
			error = false;

			if (cadena.length() != 1) {
				error = true;
				System.out.println("Error de formato");
			} else {
				c = cadena.charAt(0);
			}
			
		} while (error);
		
		return c;
	}
	
	/**
	 * Método que solicita un carácter S o N, y lo vuelve
	 * a pedir si este no es ni S ni N lo vuelve a pedir
	 * @param mensaje String con el mensaje que se muestra antes de
	 * pedir el carácter
	 * @return El carácter introducido por teclado
	 */
	public static char solicitarCaracterSN (String mensaje) {
		char c = 0;
		String cadena;
		boolean error = false;
		
		do {

			System.out.println(mensaje);
			cadena = teclado.nextLine();


			if (!(cadena.equalsIgnoreCase(SI) || cadena.equalsIgnoreCase(NO))) {
				error = true;
				System.out.println("Error de formato");
			} else {
				
				c = cadena.charAt(0);
				error = false;
			}
			
		} while (error);
		
		return c;
	}
	
	/**
	 * Método que solicita un String y comprueba que este no esté vacio.
	 * @param mensaje String con el mensaje que se muestra por 
	 * pantalla antes de solicitar la cadena
	 * @return String el cual hemos introducido por teclado
	 */
	public static String solicitarCadena (String mensaje) {
		String cadena;
		
		do {
			System.out.println(mensaje);
			cadena = teclado.nextLine();
		} while (cadena.length() == 0);
		return cadena;
	}

}
