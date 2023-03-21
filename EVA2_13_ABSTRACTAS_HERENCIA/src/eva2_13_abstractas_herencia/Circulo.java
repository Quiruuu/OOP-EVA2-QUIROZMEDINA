package eva2_13_abstractas_herencia;
public class Circulo extends Figuras{
  private double radio;
    public Circulo(){
        this.radio = 5; 
    }
    public Circulo(double radio){
        this.radio = radio; 
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return this.radio*this.radio*Math.PI;
    }
    @Override
    public double calcularPerimetro(){
        return 2*this.radio*Math.PI;
    }
    @Override
    public String toString(){
        String cade = "Datos del circulo: \n" +
                      "Perimetro: "+ this.calcularArea() + "\n" +
                      "Area: "+ this.calcularPerimetro() + "\n";
        return cade;
    }
}
