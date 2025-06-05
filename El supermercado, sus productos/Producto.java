public class Producto {

	protected String nombre;
	protected double precio;
	protected String id;
	protected int stock;
	
	public Producto(String nombre, double precio, String id, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.id = id;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}