package producto;

public class Producto {
	
	private int codigo;
	private double precioSinIva;
	private String descripcion;
	private Categoria categoria;
	
	private static int siguienteCodigo = 1;

	// Constructores
	public Producto(double precioSinIva, String descripcion, Categoria categoria) throws VentaException {
		
		this.codigo = siguienteCodigo;
		siguienteCodigo++;
		
		setPrecioSinIva(precioSinIva);
		this.descripcion = descripcion;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}

	public void setPrecioSinIva(double precioSinIva) throws VentaException{
		if(precioSinIva < 0) {
			throw new VentaException("El precio no puede ser negativo");
		}
		this.precioSinIva = precioSinIva;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", precioSinIva=" + precioSinIva + ", descripcion=" + descripcion
				+ ", categoria=" + categoria + "]";
	}
	
	public double precioConIva() {
		double precioIva;

		precioIva = (categoria.getIva() / 100) * precioSinIva;

		return precioIva;
	}
	
	
}
