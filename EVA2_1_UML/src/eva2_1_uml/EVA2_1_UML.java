package eva2_1_uml;
import MisClases.Persona;
import MisClases.Television;
import MisClases.Automovil;
public class EVA2_1_UML {
 public static void main(String[] args) { 
     System.out.println("------------------------------------------");
        Persona perso1 = new Persona();
        System.out.print(perso1 + "\n" );
        perso1.setNombre("Diego");
        perso1.setApellidos("Quiroz");
        perso1.setEdad(19);
        perso1.setGenero('H');
        perso1.imprimierDatos();
        ///////////////////////
        System.out.println("------------------------------------------");
        Television tv1 = new Television(); 
        tv1.cambiarPower();
        tv1.bajarCanal();
        tv1.bajarCanal();
        tv1.bajarCanal();
        tv1.bajarCanal();
        /////////////////////////
        System.out.println("------------------------------------------");
        Automovil auto1 = new Automovil("Battle", "Royale", "656614", 2004, "Diego Quiroz");
        
        System.out.println("Datos del auto:");
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Placas: " + auto1.getPlacas());
        System.out.println("Año: " + auto1.getAño());
        System.out.println("Dueño: " + auto1.getDueño());
        System.out.println("Adeudo: " + auto1.getAdeudo());
 
    }
    
}
