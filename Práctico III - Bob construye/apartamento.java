package ej3;

public class apartamento extends edificio{

    private int piso;
    private double cuotaMantenimiento;
    private boolean tieneBalcon;
    private boolean accesoAscensor;

    public apartamento(String arquitectura, String dueno, String ubicacion, String nombre, int nro_recidentes, int piso,
            double cuotaMantenimiento, boolean tieneBalcon, boolean accesoAscensor) {
        super(arquitectura, dueno, ubicacion, nombre, nro_recidentes);
        this.piso = piso;
        this.cuotaMantenimiento = cuotaMantenimiento;
        this.tieneBalcon = tieneBalcon;
        this.accesoAscensor = accesoAscensor;
    }

    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }
    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }
    public boolean isTieneBalcon() {
        return tieneBalcon;
    }
    public void setTieneBalcon(boolean tieneBalcon) {
        this.tieneBalcon = tieneBalcon;
    }
    public boolean isAccesoAscensor() {
        return accesoAscensor;
    }
    public void setAccesoAscensor(boolean accesoAscensor) {
        this.accesoAscensor = accesoAscensor;
    }
        
}
