package partido;

public class Partido {

	private int jornada;
	private Equipo equipoLocal;
	private Equipo equipoVisit;
	private int golesLocal;
	private int golesVisit;
	private char resultadoQuiniela;
	private boolean jugado;
	
	
	// CONSTRUCTOR
	public Partido(int jornada, Equipo equipoLocal, Equipo equipoVisit) throws LigaException{
		if (jornada > 38 || jornada < 1) {
			throw new LigaException("Esa jornada no existe " + jornada + ". Solo hay jornadas del 1 al 38");
		}
		setJornada(jornada);
		setEquipoLocal(equipoLocal);
		setEquipoVisit(equipoVisit);
		jugado = false;
	}
	
	// get y set
	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	
	public Equipo getEquipoLocal() {
		return equipoLocal;
	}
	
	public Equipo setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
		return equipoLocal;
	}
	
	public Equipo getEquipoVisit() {
		return equipoVisit;
	}
	
	public Equipo setEquipoVisit(Equipo equipoVisit) {
		this.equipoVisit = equipoVisit;
		return equipoVisit;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) throws LigaException {
		if(golesLocal < 0) {
			throw new LigaException("Los goles no pueden ser negativos");
		}
		this.golesLocal = golesLocal;
	}

	public int getGolesVisit() {
		return golesVisit;
	}

	public void setGolesVisit(int golesVisit) throws LigaException {
		if(golesVisit < 0) {
			throw new LigaException("Los goles no pueden ser negativos");
		}
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
			info = "Partido entre equipo local " + this.equipoLocal.getNombreEquipo() + " y equipo visitante " + this.equipoVisit.getNombreEquipo() + " jugado en el estadio " + this.equipoLocal.getNombreEstadio() + 
					" de la ciudad " + this.equipoLocal.getCiudad() + " ha finalizado con " + this.golesLocal + " goles del equipo local y " + this.golesVisit + 
					" goles del equipo visitante. Resultado quiniela = " + this.resultadoQuiniela;
		}else {
			info = "Partido entre equipo local " + equipoLocal + " y equipo visitante " + equipoVisit + " todavía no se ha jugado";
		}
		
		return info;
	}
	
	public void ponerResultado(String resultado) throws LigaException{
		
		String [] parts = resultado.split("-");
		// Este sería los goles del equipo local. Ej: 1-2. Sacaría el numero 1.
		String part1 = parts[0]; 
		golesLocal = Integer.parseInt(part1);
		// Este sería los goles del equipo visitante.Ej: 1-2. Sacaría el numero 2.
		String part2 = parts[1];
		golesVisit = Integer.parseInt(part2);
		if(golesLocal > golesVisit) {
			resultadoQuiniela = '1';
		}else {
			if (golesLocal < golesVisit) {
				resultadoQuiniela = '2';
			}else {
				if (golesLocal == golesVisit) {
					resultadoQuiniela = 'X';
				}
			}
		}
		jugado = true;
	}

	
}
