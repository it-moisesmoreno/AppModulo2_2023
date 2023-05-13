/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sv.edu.udb.desafios.areas;

import java.util.Scanner;

/**
 *
 * @author moicartagena
 */
public class TestArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de variables
        String continuar;
        int opcionMenu;
        Scanner scanner = new Scanner(System.in);
        Area area = new Area();
        String respuesta = "El área del ";

        do {
            
            // Menu
            System.out.println("Seleccione una opción:");
            System.out.println("1. Área de un rectángulo");
            System.out.println("2. Área de un círculo");
            System.out.println("3. Área de un trapecio");
            opcionMenu = scanner.nextInt();
            
            // Ingreso y procesamiento de datos
            switch(opcionMenu){
                case 1: // Calculo de área para rectángulo
                    double base, altura;
                    System.out.println("Digite la base:");
                    base = scanner.nextDouble();
                    System.out.println("Digite la altura:");
                    altura = scanner.nextDouble();
                    double areaRectangulo = area.calcularArea(base, altura);
                    System.out.println(respuesta + "rectángulo es: " + areaRectangulo);
                    break;
                case 2: // Calculo de área para círculo
                    double radio;
                    System.out.println("Digite el radio:");
                    radio = scanner.nextDouble();
                    double areaCirculo = area.calcularArea(radio);
                    System.out.println(respuesta + "cículo es: " + areaCirculo);
                    break;
                case 3: // Calculo de área para trapecio
                    double alturaTrapecio, ladoA, ladoB;
                    System.out.println("Digite la Altura:");
                    alturaTrapecio = scanner.nextDouble();
                    System.out.println("Digite el lado A:");
                    ladoA = scanner.nextDouble();
                    System.out.println("Digite el lado B:");
                    ladoB = scanner.nextDouble();
                    double areaTrapecio = area.calcularArea(alturaTrapecio, ladoA, ladoB);
                    System.out.println(respuesta + "trapecio es: " + areaTrapecio);
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            
            // Continuar o salir
            System.out.println("¿Desea continuar? (SI/NO)");
            continuar = scanner.next();
            continuar = continuar.toLowerCase();
            
        } while (continuar.equals("si"));
    }

}
