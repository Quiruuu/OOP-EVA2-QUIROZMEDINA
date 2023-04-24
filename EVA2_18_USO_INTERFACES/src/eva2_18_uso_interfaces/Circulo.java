package eva2_18_uso_interfaces;
public class Circulo implements Figuras, MostrarDatos{
    private double radio;

    public Circulo() {
        this.radio = 2.0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio*radio*Math.PI;
    }

    @Override
    public double calcularPerimetro() {
        return 2*radio*Math.PI;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Datos del circulo: ");
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.print("\n");
    }
    
}
