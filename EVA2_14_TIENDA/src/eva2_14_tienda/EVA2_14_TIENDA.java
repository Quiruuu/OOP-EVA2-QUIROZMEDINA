package eva2_14_tienda;
import Productos.Computadora;
import Productos.Jeans;

public class EVA2_14_TIENDA {
    public static void main(String[] args) {
        Computadora compu = new Computadora();
        Computadora compu2 = new Computadora(8, 500, 18, "INTEL", "HP", "666", 12, 12000, "JUDE", "Pieza");
        System.out.println(compu);
        System.out.println(compu2);
        Jeans jean = new Jeans();
        System.out.println(jean);
    }
    
}
