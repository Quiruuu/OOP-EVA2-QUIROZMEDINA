package MisClases;
public class Automovil {
    private String marca;
    private String modelo;
    private int año;

    public Automovil(String marCa, String modeLo, int añO){
        marca = marCa;
        modelo = modeLo;
        año = añO; 
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor; 
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valorr){
        modelo = valorr;
    }
    public int getAño(){
        return año;
    }
    public void setAño(int year){
        año = year; 
    }

    public void imprimirDato(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
}
