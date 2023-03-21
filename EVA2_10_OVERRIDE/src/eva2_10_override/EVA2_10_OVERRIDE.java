package eva2_10_override;//SOBRE ESCRITURA
public class EVA2_10_OVERRIDE {
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        Persona perso2 = new Persona("Quiru", 19); 
        System.out.println(perso);
        System.out.print("\n");
        System.out.println(perso2);
    }
    
}

class Persona{
    private String nombre;
    private int edad;
    
    public Persona() {
        this.nombre = "-------";
        this.edad = -1;
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
    public String toString(){
        String cade = "Datos: \n" +
                      "Nombre: "+ this.nombre + "\n" +
                      "Edad: "+this.edad;
        return cade;
    }
}