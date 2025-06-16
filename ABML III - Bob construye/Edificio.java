public class Edificio {

    private String arquitectura;
    private String dueno;
    private String ubicacion;
    private int nro_recidentes;
    private String id;

    public Edificio(String arquitectura, String dueno, String ubicacion, int nro_recidentes, String id) {
        this.arquitectura = arquitectura;
        this.dueno = dueno;
        this.ubicacion = ubicacion;
        this.nro_recidentes = nro_recidentes;
        this.id = id;
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
    public int getNro_recidentes() {
        return nro_recidentes;
    }
    public void setNro_recidentes(int nro_recidentes) {
        this.nro_recidentes = nro_recidentes;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    
}
