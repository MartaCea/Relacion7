package partido;

public class Partido {

	private int jornada;
	private Equipo equipoLocal;
	private Equipo equipoVisit;
	private Equipo estadio;
	private Equipo ciudad;
	private int golesLocal;
	private int golesVisit;
	private char resultadoQuiniela;
	private boolean jugado;
	
	
	// CONSTRUCTOR
	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisit) throws LigaException{
		if (jornada > 38 || jornada < 1) {
			throw new LigaException("Esa jornada no existe " + jornada + ". Solo hay jornadas del 1 al 38");
		}
		this.jornada = jornada;
		this.equipoLocal = equipoLocal;
		this.equipoVisit = equipoVisit;
		jugado = false;
	}
	
	// get y set
	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisit() {
		return golesVisit;
	}

	public void setGolesVisit(int golesVisit) {
		this.golesVisit = golesVisit;
	}

	public char getResultadoQuiniela() {
		return resultadoQuiniela;
	}

	public void setResultadoQuiniela(char resultadoQuiniela) {
		this.resultadoQuiniela = resultadoQuiniela;
	}
	
	// toString
	public String toString() {
		String info;
		
		if (jugado == true) {
			info = "Partido entre equipo local " + equipoLocal + " y equipo visitante " + equipoVisit + " jugado en el estadio " + estadio + 
					" de la ciudad " + ciudad + " ha finalizado con " + golesLocal + " goles del equipo local y " + golesVisit + 
					" goles del equipo visitante. Resultado quiniela = " + resultadoQuiniela;
		}else {
			info = "Partido entre equipo local " + equipoLocal + " y equipo visitante " + equipoVisit + " todavía no se ha jugado";
		}
		
		return info;
	}
	
	public void ponerResultado(String resultado) throws LigaException{
		int result1,result2;
		String [] parts = resultado.split("-");
		// Este sería los goles del equipo local. Ej: 1-2. Sacaría el numero 1.
		String part1 = parts[0]; 
		result1 = Integer.parseInt(part1);
		// Este sería los goles del equipo visitante.Ej: 1-2. Sacaría el numero 2.
		String part2 = parts[1];
		result2 = Integer.parseInt(part2);
		if(result1 > result2) {
			resultadoQuiniela = '1';
		}else {
			if (result1 < result2) {
				resultadoQuiniela = '2';
			}else {
				if (result1 == result2) {
					resultadoQuiniela = 'X';
				}
			}
		}
		// EXCEPTION
		if (result1 < 0 || result2 < 0) {
			throw new LigaException("Los goles no pueden ser negativos");
		}
		jugado = true;
	}

	
}
