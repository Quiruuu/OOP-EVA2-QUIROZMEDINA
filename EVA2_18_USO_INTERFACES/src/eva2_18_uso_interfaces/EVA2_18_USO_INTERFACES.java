package eva2_18_uso_interfaces;
public class EVA2_18_USO_INTERFACES {
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.setRadio(50);
        Triangulo triang = new Triangulo(4.0,5.0);
        circ.imprimirDatos();
        triang.imprimirDatos();
    }
}
