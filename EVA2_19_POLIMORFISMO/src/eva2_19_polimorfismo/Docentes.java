package eva2_19_polimorfismo;
            //CLASE DERIVADA extends CLASE BASE
            //CLASE HIJO extends CLASE PADRE
            //SUBCLASE extends SUPERCLASE
public class Docentes extends Persona{
  private String plaza;

    public Docentes() {
        super();
        this.plaza = "-------";
    }

    public Docentes(String plaza) {
        this.plaza = plaza;
    }

    public Docentes(String nombre, String apellido, int edad, String plaza) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    

  public String getPlaza() {
    return plaza;
  }

  public void setPlaza(String plaza) {
    this.plaza = plaza;
    
  }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Plaza: "+this.plaza);
    }
  
  
}
