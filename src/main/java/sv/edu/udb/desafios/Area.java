/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.udb.desafios;

/**
 *
 * @author moicartagena
 */
public class Area {
    double PI = 3.1416;
    
    // Para calcular el área de un rectángulo
    public double calcularArea(double base, double altura){
        double area = 0.0;
        area = base * altura;
        return area;
    }
    
    // Para calcular el área de un círculo
    public double calcularArea(double radio){
        double area = 0.0;
        area = PI * Math.pow(radio, 2);
        return area;
    }
    
    // Para calcular el área del trapecio
    public double calcularArea(double altura, double ladoA, double ladoB){
        double area = 0.0;
        area = altura * (ladoA + ladoB)/2;
        return area;
    }
    
}
