package producto;

public class Categoria {
	
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
		if(iva < 0) {
			throw new VentaException("El IVA no puede ser negativo");
		}
		this.iva = iva;
	}

	@Override
	public String toString() {
		return "Categoria [nombreCategoria=" + nombreCategoria + ", iva=" + iva + "]";
	}
	
	
	
	
}
