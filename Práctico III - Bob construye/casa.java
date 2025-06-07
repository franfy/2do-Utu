package ej3;

public class casa extends edificio{

    private boolean tienePatio;
    private int cantidadPisos;
    private boolean tieneGaraje;
    private double tamanioTerreno; //en m²
    
    public casa(String arquitectura, String dueno, String ubicacion, String nombre, int nro_recidentes,
            boolean tienePatio, int cantidadPisos, boolean tieneGaraje, double tamanioTerreno) {
        super(arquitectura, dueno, ubicacion, nombre, nro_recidentes);
        this.tienePatio = tienePatio;
        this.cantidadPisos = cantidadPisos;
        this.tieneGaraje = tieneGaraje;
        this.tamanioTerreno = tamanioTerreno;
    }

    public boolean isTienePatio() {
        return tienePatio;
    }

    public void setTienePatio(boolean tienePatio) {
        this.tienePatio = tienePatio;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public double getTamanioTerreno() {
        return tamanioTerreno;
    }

    public void setTamanioTerreno(double tamanioTerreno) {
        this.tamanioTerreno = tamanioTerreno;
    }

    
}
