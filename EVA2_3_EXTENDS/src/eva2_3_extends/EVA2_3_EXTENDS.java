package eva2_3_extends;
public class EVA2_3_EXTENDS {
    public static void main(String[] args) {
        Estudiante estu = new Estudiante();
        estu.setNombre("Diego");
        estu.setApellido("Quiroz");
        estu.setEdad(20);
        estu.setNoControl("22550329");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNoControl());
        System.out.print("\n");
        Docentes doce1 = new Docentes();
        doce1.setNombre("John");
        doce1.setApellido("Jones");
        doce1.setEdad(500);
        doce1.setPlaza("Pisos Picados");
        System.out.println(doce1.getNombre());
        System.out.println(doce1.getApellido());
        System.out.println(doce1.getEdad());
        System.out.println(doce1.getPlaza());
    }
    
}
