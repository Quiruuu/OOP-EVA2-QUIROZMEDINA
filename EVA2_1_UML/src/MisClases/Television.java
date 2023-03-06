package MisClases;
public class Television {
    private boolean power;
    private int volumen;
    private int canal; 
    //metodos: comportamientos 
    //constructor: 
    public Television(){// constructor default 
        power = false; //apagad0
        volumen = 10; 
        canal = 2;
    }
    public void cambiarPower(){
        if(power == false){//apagado
            power = true; //encendimos la tele
            System.out.println("TELEVISION ENCENDIDA");
        }
            else{ 
            power = false;
            System.out.println("TELEVISION APAGADA");
        }
    }
    public void subirVolumen(){
        if(power == true){
            if(volumen < 100){
            volumen = volumen + 5;
            System.out.println("Volumen "+volumen);
            }
        }
    }
    public void bajarVolumen(){
        if(power == true){
            if(volumen > 0){
            volumen = volumen - 5;
            System.out.println("Volumen "+volumen);
        }
        }
    }
    public void subirCanal(){
        if(power == true){
            if(canal < 100) canal = canal + 1;
            else canal = 0;  
            System.out.println("Canal "+canal);
        }
    }
    public void bajarCanal(){
        if(power == true){
            if(canal > 0) canal = canal - 1;
            else canal = 100;
            System.out.println("Canal "+canal);
        
        }
    }
}
