package eva2_1_uml;

import MisClases.Automovil;
import MisClases.Persona;
import MisClases.Television;
public class EVA2_1_UML {
    public static void main(String[] args) {
        Persona perso1 = new Persona(22550329,"Diego Quiroz", 19);
        perso1.imprimirDato(); 
        System.out.print("\n");
        Television Tele1 = new Television(false, 50, 75);
        Tele1.imprimirDato();
        System.out.print("\n");
        
        Automovil Auto1 = new Automovil("Jonesy", "Ramirez", 2004);
        Auto1.imprimirDato();
    }          
}
