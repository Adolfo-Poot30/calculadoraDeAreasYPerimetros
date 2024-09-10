package entidades;

public class Triangulo extends Figura{
    
    private float base = 0, altura = 0, lado1 = 0, lado2 = 0;
    
    @Override
    public float calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public float calcularPerimetro() {
        return (base+lado1+lado2);
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
}
