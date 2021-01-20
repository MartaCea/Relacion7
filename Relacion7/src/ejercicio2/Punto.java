package ejercicio2;

public class Punto {
	
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public boolean equals(Punto otro) {
		boolean iguales = false;
		
		if(this.x == otro.x && this.y == otro.y) {
			iguales = true;
		}
		return iguales;
	}
}
