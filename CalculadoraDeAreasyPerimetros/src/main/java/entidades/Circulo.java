package entidades;

public class Circulo extends Figura {
    private float radio = 0;
    
    @Override
    public float calcularArea(){
        return (float) (Math.PI * radio * radio);
    }

    @Override
    public float calcularPerimetro() {
        return (float) (Math.PI * radio * 2);
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
