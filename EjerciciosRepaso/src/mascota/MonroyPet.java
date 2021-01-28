package mascota;

public class MonroyPet {

	private static final int COMIDA_INICIAL = 2;
	private static int COMIDA_ALMACEN = 100;
	private static final int PUNTOS_INCIALES = 0;
	
	private String nombre;
	private String tipo;
	private int puntos;
	private int comida;
	
	private static int totalJugadoEntreTodasMascotas=0;

	public MonroyPet(String nombre, String tipo) throws MonroyPetException {
		
		if ( !(tipo.equals("PERRO")|| tipo.equals("GATO"))) {
			throw new MonroyPetException("Tipo de mascota incorrecto");
		}
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.puntos= PUNTOS_INCIALES;
		this.comida=COMIDA_INICIAL;
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public int getPuntos() {
		return puntos;
	}

	public int getComida() {
		return comida;
	}

	public static int getTotalJugadoEntreTodasMascotas() {
		return totalJugadoEntreTodasMascotas;
	}
	
	public boolean equals(MonroyPet otro) {
		boolean esIgual = false;
		
		if(this.nombre.equals(otro.nombre) && this.tipo.equals(otro.tipo)) {
			esIgual = true;
		}
		
		return esIgual;
		
	}
	
	public String toString() {
		String info;
		if(this.tipo.equals("PERRO")) {
			info = "La mascota se llama " + nombre + ", su tipo es " + tipo + ". Su comida es huesos y tiene "  + puntos + " puntos";
		}else {
			info = "La mascota se llama " + nombre + ", su tipo es " + tipo + ". Su comida es pescado y tiene "  + puntos + " puntos";
		}
		return info;
	}
	
	public void darComida() {
		COMIDA_ALMACEN--;
	}
	
	public void comprarComida(int alimentos) throws MonroyPetException {
		int resultado;
		
		if(alimentos < 0) {
			throw new MonroyPetException("El numero de alimentos no puede ser negativo");
		}
		
		resultado = alimentos * 30;
		this.puntos = this.getPuntos() - resultado;
	}
	
	public void jugar(int minutos) throws MonroyPetException {
		if(minutos < 0 || minutos >= 20) {
			throw new MonroyPetException("No puedes seguir jugando hasta mañana");
		}
		
		this.puntos = minutos * 3;
		
	}
	
}
