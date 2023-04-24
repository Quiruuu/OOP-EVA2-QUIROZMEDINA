package eva2_20_polimorfismo_figuras;

import java.util.Scanner;

public class EVA2_20_POLIMORFISMO_FIGURAS {
    public static void main(String[] args) {
        /*Circulo circulo = new Circulo(5);
        circulo.imprimirDatos();
        //FIGURA ES PADRE DE CIRCULO
        //PODEMOS ASIGNAR UN OBJETO CIRCULO A UNA VARIABLE FIGURA
        Figuras figu = circulo;
         System.out.println("USANDO FIGURAS:");
         System.out.println("Area: " + figu.calcularArea());
         System.out.println("Perimetro: " + figu.calcularPeri());*/
        
        /*int[] arreglo = new int[10];//arreglo que guarda 10 enteros
        //un arreglo donde inicia y donde termina?
        // primer posición: 0
        //ultima posición: N - 1, N canitdad de elemntos del arreglo
        arreglo[0] = 100;
        System.out.println(arreglo[0]);*/
        
        System.out.println("¿Cuántas figuras necesitas?:");
        Scanner input = new Scanner(System.in);
        int cant = input.nextInt();
        Figuras[] figuras = new Figuras[cant];
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Que tipo de figura necesitas: 1.circulo, 2.Triangulo");
            int tipo = input.nextInt();
            if(tipo == 1){//CIRCULO
                Circulo circu = new Circulo();
                System.out.println("Introduce el radio:");
                circu.setRadio(input.nextDouble());
                figuras[i] = circu;
            }else{//TRIANGULO
                Triangulo trian = new Triangulo();
                System.out.println("Introduce la base:");
                trian.setBase(input.nextDouble());
                System.out.println("Introduce la altura:");
                trian.setAltura(input.nextDouble());
                figuras[i] = trian;
            }
        }
        //IMPRIMIR LOS RESULTADOS
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Circulo)
            System.out.println("Circulo: " + 1);
            else
                System.out.println("Triangulo: " + 1);
            
            System.out.println("Area: " + figuras[i].calcularArea());
            System.out.println("Perimetro: " + figuras[i].calcularPeri());
        }
        
        /*Circulo[] circulos = new Circulo[cant];
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circulo();
        }
        for (int i = 0; i < circulos.length; i++) {
            circulos[i].imprimirDatos();
        }*/
 
    }
    
}
