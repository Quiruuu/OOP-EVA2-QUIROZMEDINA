package eva2_4_formato_apa;
public class EVA2_4_FORMATO_APA {
  public static void main(String[] args) {
    Documento docu = new Documento();
    docu.setTitulo("Documento");
    System.out.println(docu.getTitulo());
    System.out.print("\n");

    Libro libro1 = new Libro();
    libro1.setTitulo("Libro");
    System.out.println(libro1.getTitulo());
    libro1.setEditorial("Sanborns");
    System.out.println(libro1.getEditorial());
    libro1.setTraductor("Fortinaiti");
    System.out.println(libro1.getTraductor());
    
    System.out.print("\n");

    Articulo artic = new Articulo();
    artic.setTitulo("Articulo");
    System.out.println(artic.getTitulo());
    artic.setPaginas("25-65");
    System.out.println(artic.getPaginas());
    artic.setEditor("ElAmigos");
    System.out.println(artic.getEditor());

    System.out.println("\n");

    Informe info = new Informe();
    info.setTitulo("Informe");
    System.out.println(info.getTitulo());
    info.setTipo_de_informe("Pase de batalla");
    System.out.println(info.getTipo_de_informe());
    info.setDepartamento("Juegos Epicos");
    System.out.println(info.getDepartamento());

    System.out.print("\n");

    Sitio_Web sweb = new Sitio_Web();
    sweb.setTitulo("Sitio Web");
    System.out.println(sweb.getTitulo());
    sweb.setURL("https://www.youtube.com/watch?v=j0NkdwRYQO8&list=LL&index=10");
    System.out.println(sweb.getURL());
    sweb.setSoporte("Youtube");
    System.out.println(sweb.getSoporte());

  }
  
}
