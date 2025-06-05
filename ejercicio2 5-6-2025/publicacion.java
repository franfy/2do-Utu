public class publicacion {

    protected String fecha_estreno;
    protected String nombre;
    protected String editorial;
    protected int precio;

    public publicacion(String fecha_estreno, String nombre, String editorial, int precio){
        this.fecha_estreno=fecha_estreno;
        this.nombre=nombre;
        this.editorial=editorial;
        this.precio=precio;
    }

    public String getFecha_estreno() {
        return fecha_estreno;
    }

    public void setFecha_estreno(String fecha_estreno) {
        this.fecha_estreno = fecha_estreno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
