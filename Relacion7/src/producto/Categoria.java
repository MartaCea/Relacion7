package producto;

public class Categoria {
	
	private static final double IVA_MAX = 21;
	private String nombreCategoria;
	private double iva;
	
	// Constructores
	public Categoria(String nombreCategoria, int iva) throws VentaException {
		this.nombreCategoria = nombreCategoria;
		setIva(iva);
	}
	
	// get y set
	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) throws VentaException {
		if(iva < 0 || iva > IVA_MAX) {
			throw new VentaException("El IVA introducido es incorrecto");
		}
		
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "Categoria [nombreCategoria=" + nombreCategoria + ", iva=" + iva + "]";
	}
	
	
	
	
}
