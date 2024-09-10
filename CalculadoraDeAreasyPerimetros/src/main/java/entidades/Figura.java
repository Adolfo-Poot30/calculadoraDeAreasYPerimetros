package entidades;

public abstract class Figura {

    abstract float calcularArea();

    abstract float calcularPerimetro();

    public float esUnNumero(String dato) {
        float numero = 0;
        if (dato != null) {

            try {
                numero = Float.parseFloat(dato);
                return numero;
            } catch (Exception e) {
                return numero;
            }
        }
        return numero;
    }
}
