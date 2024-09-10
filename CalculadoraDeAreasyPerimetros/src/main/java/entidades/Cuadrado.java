package entidades;

public class Cuadrado extends Figura{
    private float lado = 0;
    
    @Override
    public float calcularArea() {
        return lado*lado;
    }

    @Override
    public float calcularPerimetro() {
        return lado*4;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }    
}
