package MisClases;
public class Television {
    private boolean power;
    private int volumen;
    private int canal; 
    //metodos: comportamientos 
    //constructor: 
    public Television(boolean poder, int volume, int channel){// constructor default 
        power = poder; //apagad0
        volumen = volume; 
        canal = channel;
    }
    public boolean getPower(){
        return power; 
    }
    public void setPower(Boolean poWer){
        power = poWer;
    }
    public int getVolumen(){
        return volumen; 
    }
    public void setVolumen(int voluMen){
        volumen = voluMen;
    }
    public int getCanal(){
        return canal; 
    }
    public void setCanal(int caNal){
        canal = caNal;
    }
    public void imprimirDato(){
        System.out.println("Power: "+power);
        System.out.println("Volumen: "+volumen);
        System.out.println("Canal: "+canal);
    }
}
