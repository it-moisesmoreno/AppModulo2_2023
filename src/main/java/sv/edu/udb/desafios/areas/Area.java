/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.udb.desafios.areas;

/**
 *
 * @author moicartagena
 */
public class Area {

    double PI = 3.1416;

    /**
     * Para calcular el área de un rectángulo
     * @param base
     * @param altura
     * @return 
     */
    public double calcularArea(double base, double altura) {
        if (base <= 0 || altura <= 0){
            System.out.println("La base y la altura no pueden ser menor o igual a cero.");
            return 0;
        }else{
            return base * altura;
        }
    }

    /**
     * Para calcular el área de un círculo
     * @param radio
     * @return 
     */
    public double calcularArea(double radio) {
        if (radio <= 0){
            System.out.println("El radio no pueden ser menor o igual a cero.");
            return 0;
        }else{
            return PI * Math.pow(radio, 2);
        }
    }

    /**
     * Este método devuelve el cálculo de un trapecio
     *
     * @param altura
     * @param ladoA
     * @param ladoB
     * @return
     */
    public double calcularArea(double altura, double ladoA, double ladoB) {
        if (altura <= 0 || ladoA <= 0 || ladoB <= 0) {
            System.out.println("Los lados no pueden ser menor o igual a cero.");
            return 0;
        } else {
            return altura * (ladoA + ladoB) / 2;
        }
    }

}
