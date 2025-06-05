public class Ropa  extends Producto{
	
	protected String marca;
	protected String material;
	protected String talle;
	
	

	public Ropa(String nombre, double precio, String id, int stock, String marca, String material, String talle) {
		super(nombre, precio, id, stock);
		
		this.marca = marca;
		this.material = material;
		this.talle = material;
				
		
	}


	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	public String getTalle() {
		return talle;
	}



	public void setTalle(String talle) {
		this.talle = talle;
	}

	
	
}