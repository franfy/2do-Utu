package ej3;

public class edificio {
    
    private String arquitectura;
    private String dueno;
    private String ubicacion;
    private String nombre;
    private int nro_recidentes;

    public edificio(String arquitectura, String dueno, String ubicacion, String nombre, int nro_recidentes) {
        this.arquitectura = arquitectura;
        this.dueno = dueno;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.nro_recidentes = nro_recidentes;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro_recidentes() {
        return nro_recidentes;
    }

    public void setNro_recidentes(int nro_recidentes) {
        this.nro_recidentes = nro_recidentes;
    }

    
}
