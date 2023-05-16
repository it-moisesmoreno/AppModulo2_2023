package sv.edu.udb.desafios.cuestionario;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class TestCuestionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Declaración e inicialización de variables
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        int cantidadPreguntas = 0;
        double notaFinal;
        boolean esCuestionarioExitoso;
        Cuestionario cuestionario;

        // Mostrar menú
        do {
            try {
                System.out.println("¿Cuantas preguntas desea responder en este cuestionario?");
                cantidadPreguntas = scanner.nextInt();
                if (cantidadPreguntas <= 0 || cantidadPreguntas > 9) {
                    System.out.println("El número de cantidad de preguntas es incorrecto. Por favor ingrese un número entre 1 y 9.");
                }
            } catch (InputMismatchException e) {
                System.out.println("El número de cantidad de preguntas es inválido. Por favor ingrese un número entero.");
                scanner.nextLine();
            }
        } while (cantidadPreguntas <= 0 || cantidadPreguntas > 9);

        // Procesar preguntas
        do {
            System.out.println("Cuestionario JAVA POO");
            System.out.println("*********************");
            cuestionario = new Cuestionario(cantidadPreguntas);
            cuestionario.prepararCuestionario();
            esCuestionarioExitoso = true;

            try {
                for (Pregunta pregunta : cuestionario.getLstPreguntas()) {
                    System.out.println(pregunta.getTexto());
                    boolean respuesta = scanner.nextBoolean();
                    String respuestaString = cuestionario.verificarRespuesta(respuesta, pregunta.getRespuesta());
                    System.out.println(respuestaString);
                    System.out.println("Respuestas correctas: " + cuestionario.getNota() + " de " + cantidadPreguntas);
                    System.out.println("*********************");
                }
            } catch (InputMismatchException e) {
                esCuestionarioExitoso = false;
                System.out.println("Una respuesta es inválida. El cuestionario "
                        + "se reiniciará. Por favor responda con valores de true o false.");
                scanner.nextLine();
            }
        } while (!esCuestionarioExitoso);

        // Mostrar notas
        notaFinal = ((double) cuestionario.getNota() / (double) cantidadPreguntas) * 10;
        System.out.println("Su nota final es: " + decimalFormat.format(notaFinal));

    }

}