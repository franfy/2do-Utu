package ej4;

public class escultura extends ObraArte{

    private String material;
    private double altura;
    private double peso;

    public escultura(String titulo, String autor, int anioCreacion, String tecnica, String material, double altura,
            double peso) {
        super(titulo, autor, anioCreacion, tecnica);
        this.material = material;
        this.altura = altura;
        this.peso = peso;
    }
    
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    

}
