package eva2_16_interfaces;
public class Persona implements MostrarDatos{
    private String nombre;
    private int edad; 

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.print("\n");
    }
    
}
