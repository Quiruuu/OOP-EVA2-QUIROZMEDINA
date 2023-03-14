package eva2_4_formato_apa;
public class Libro extends Documento{
    private String editorial;
    private String traductor;

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setTraductor(String traductor) {
        this.traductor = traductor;
    }
    public String getTraductor() {
        return traductor;
    }
}
