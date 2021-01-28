package producto;

public class MainProducto {

	public static void main(String[] args) {
		try {
		Categoria categoria = new Categoria("Alimentacion", 18);
		}catch(VentaException e) {
			System.out.println(e.getMessage());
		}
	}

}
