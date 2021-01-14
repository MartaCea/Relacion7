package jarra;

public class Jarra {
	
	// ATRIBUTOS
	private int capacidad;
	private int cantidad;
	// ATRIBUTO STATIC
	private static int totalAguaConsumida;
	
	// CONSTRUCTOR
	public Jarra(int cantidad) throws JarraException {
		if (cantidad < 0) {
			throw new JarraException("Lo siento las cantidades no pueden ser negativas");
		}
		if (cantidad > capacidad) {
			throw new JarraException("No podemos llenar la jarra. Se podría desbordar");
		}
		this.cantidad = cantidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public static int getTotalAguaConsumida() {
		return totalAguaConsumida;
	}
	
	public String toString() {
		return "La jarra tiene " + this.capacidad;
	}
	
	public void llenar() {
		this.cantidad = capacidad;
	}
	
	public void vaciar() {
		this.cantidad = 0;
	}
	
	public void volcar() {
		
	}
}
