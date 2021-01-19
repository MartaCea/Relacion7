package partido;

public class MainLiga {

	public static void main(String[] args) throws LigaException {
		Equipo equipoLocal = new Equipo("Sevilla", "Sanche Pijuan", "Sevilla");
		Equipo equipoVisit = new Equipo("Real Madrid", "Santigo Bernabeu", "Madrid");
		Partido partido1 = new Partido(1, equipoLocal, equipoVisit);
		partido1.ponerResultado("1-2");
		System.out.println(partido1);
	}

}
