package ej4;

public class fotografia extends ObraArte{

    private String tipoFotografia;
    private String resolucion;
    private boolean esColor;
    
    public fotografia(String titulo, String autor, int anioCreacion, String tecnica, String tipoFotografia,
            String resolucion, boolean esColor) {
        super(titulo, autor, anioCreacion, tecnica);
        this.tipoFotografia = tipoFotografia;
        this.resolucion = resolucion;
        this.esColor = esColor;
    }

    public String getTipoFotografia() {
        return tipoFotografia;
    }

    public void setTipoFotografia(String tipoFotografia) {
        this.tipoFotografia = tipoFotografia;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isEsColor() {
        return esColor;
    }

    public void setEsColor(boolean esColor) {
        this.esColor = esColor;
    }

    

}
