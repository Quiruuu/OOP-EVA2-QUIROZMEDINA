package eva2_6_herencia_constructores;
public class EVA2_6_HERENCIA_CONSTRUCTORES {
    public static void main(String[] args) {       
        System.out.println("CLASE ANIMAL");
        System.out.print("\n");      
        Animal animal1 = new Animal();
        animal1.comer();
        animal1.respirar();
        System.out.print("\n");
        System.out.println("CLASE MAMIFERO");
        System.out.print("\n");
        Mamifero mamifero1 = new Mamifero();
        mamifero1.respirar();
        mamifero1.respirar();
        mamifero1.tenerPelo();
    }
    
}
