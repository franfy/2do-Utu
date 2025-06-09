package ej4;

public class pintura extends ObraArte{

    private String tipoPintura;
    private String estilo;
    
    public pintura(String titulo, String autor, int anioCreacion, String tecnica, String tipoPintura, String estilo) {
        super(titulo, autor, anioCreacion, tecnica);
        this.tipoPintura = tipoPintura;
        this.estilo = estilo;
    }

    public String getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    

}
