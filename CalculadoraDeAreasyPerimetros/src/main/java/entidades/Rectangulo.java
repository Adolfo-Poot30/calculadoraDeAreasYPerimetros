package entidades;

public class Rectangulo extends Figura{
    private float base = 0, altura = 0;

    @Override
    public float calcularArea() {
        return base*altura;
    }

    @Override
    public float calcularPerimetro() {
        return (base*2)+(altura*2);
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
