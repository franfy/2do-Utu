package ej4;

public class ObraArte {

    private String titulo;
    private String autor;
    private int anioCreacion;
    private String tecnica;
    
    public ObraArte(String titulo, String autor, int anioCreacion, String tecnica) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioCreacion = anioCreacion;
        this.tecnica = tecnica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }
    
    
}
