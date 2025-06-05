public class articulo extends publicacion{

    protected String tema;

    public articulo(String fecha_estreno, String nombre, String escritor, int precio, String tema) {
        super(fecha_estreno, nombre, escritor, precio);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
}
