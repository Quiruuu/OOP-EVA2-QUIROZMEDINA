package eva2_11_figuras;
public class EVA2_11_FIGURAS {
    public static void main(String[] args) {
        
        Circulo circu1 = new Circulo();
        Circulo circu2 = new Circulo(8.0);
        Triangulo trian1 = new Triangulo();
        Triangulo trian2 = new Triangulo(8.0, 6.0);
        System.out.println(circu1);
        System.out.println(circu2);
        System.out.println(trian1);
        System.out.println(trian2);
    }
    
}
