package eva2_19_polimorfismo;
public class EVA2_19_POLIMORFISMO {
    public static void main(String[] args) {
        Docentes docente = new Docentes("Toledo","Piñon",77,"1254163");
        Estudiante estudiante = new Estudiante("Diego","Quiroz",19,"22550329");
        //docente.imprimirDatos();
        //estudiante.imprimirDatos();
        //OCULTAMOS PROPIEDADES
        Persona persona = docente;
        persona.imprimirDatos();
        Persona persona2 = estudiante; 
        persona2.imprimirDatos();
        Persona perso = new Persona();
    }
    
}
