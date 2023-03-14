package eva2_5_herencia;
public class EVA2_5_HERENCIA {
    public static void main(String[] args) {
        superClase obj = new subClase();
        obj.mensaje();
    }
}   
class superClase{
    public void mensaje(){
        System.out.println("Fort"); 
    }
}
class subClase extends superClase{

}