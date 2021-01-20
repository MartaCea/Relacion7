package ejercicio2;

public class Linea {
	private Punto puntoA;
	private Punto puntoB;
	
	public Linea(Punto puntoA, Punto puntoB) {
		setPuntoA(puntoA);
		setPuntoB(puntoB);
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}
	
	public String toString() {
		return "Linea de " + puntoA + " a " + puntoB;
	}
	
	public double moverDerecha(double moverDer) {
		double punto = 0;

		punto = punto + moverDer;
		
		return punto;
	}
	
	public double moverIzquierda(double moverIzq) {
		double punto = 0;
		
		punto = punto - moverIzq;
		
		return punto;
	}
	
	public double moverArriba(double moverArriba) {
		double punto = 0;

		punto = punto + moverArriba;
		
		return punto;
	}
	
	public double moverAbajo(double moverAbajo) {
		double punto = 0;
	
		punto = punto - moverAbajo;
		
		return punto;
	}
	
}
