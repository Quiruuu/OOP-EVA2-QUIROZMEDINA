package Productos;
import SuperClases.Ropa;
public final class Jeans extends Ropa{
    private String estilo;
    private String material;

    public Jeans() {
        super();
        this.estilo = "";
        this.material = "";
    }

    public Jeans(String estilo, String material, String talla, String marca, String color, double precio, String nombre, String unidadVenta) {
        super(talla, marca, color, precio, nombre, unidadVenta);
        this.estilo = estilo;
        this.material = material;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    @Override
    public double precioVenta(int cant) {
        if(cant >= 10)
            return precio * cant;
        else 
            return precio*0.75 * cant;
    }
    @Override
    public String toString(){
        String cade = "Datos: \n" +
                      "Estilo: "+ this.estilo + "\n" +
                      "Material: "+ this.material + "\n"+
                      "Color: "+ this.getColor() + "\n"+
                      "Marca: "+ this.getMarca() + "\n" +
                      "Talla: "+ this.getTalla() + "\n" +
                      "Nombre: "+ this.getNombre() + "\n" +
                      "Precio: "+ this.precio + "\n" +
                      "Precio de venta: "+ this.precioVenta(6) + "\n" 
                      ;
        return cade;
    }
}
