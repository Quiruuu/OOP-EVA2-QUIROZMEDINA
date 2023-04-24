package eva2_16_interfaces;
public class EVA2_16_INTERFACES {
    public static void main(String[] args) {
        // TODO code application logic here
        //MostrarDatos obj = new MostrarDatos(); no se puede instanciar un 
        Persona perso = new Persona("John Jones", 589);
        perso.imprimirDatos();
        Computadora compu = new Computadora("ASUS","Intel i5", 2500,"TUF ASUS");
        compu.imprimirDatos();
    }
    
}
