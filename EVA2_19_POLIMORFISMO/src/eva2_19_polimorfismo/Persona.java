package eva2_19_polimorfismo;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad; 

    public Persona() {
        this.nombre = "--------";
        this.apellido = "--------";
        this.edad = -1;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimirDatos(){
        System.out.println("DATOS");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("Edad: "+this.edad);
    }
}
