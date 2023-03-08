package eva2_3_extends;
public class EVA2_3_EXTENDS {
    public static void main(String[] args) {
        
        Estudiante estu = new Estudiante();
        estu.setNombre("Sifu");
        estu.setApellido("Sin Morir");
        estu.setEdad(20);
        estu.setNoControl("22550353");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNoControl());
        
        Docentes doce1 = new Docentes();
        doce1.setNombre("Tony");
        doce1.setApellido("Sopranp");
        doce1.setEdad(68);
        doce1.setPlaza("ASDFGH");
        
    }
    
}
