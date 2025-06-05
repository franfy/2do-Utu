public class Alimentos extends Producto {
	protected Double fecha_vencimiento;
	protected String tipo_alimento;
	public Alimentos(String nombre, double precio, String id, int stock, Double fecha_vencimiento,
			String tipo_alimento) {
		super(nombre, precio, id, stock);
		this.fecha_vencimiento = fecha_vencimiento;
		this.tipo_alimento = tipo_alimento;
	}
	public Double getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(Double fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
	public String getTipo_alimento() {
		return tipo_alimento;
	}
	public void setTipo_alimento(String tipo_alimento) {
		this.tipo_alimento = tipo_alimento;
	}
	
	

}