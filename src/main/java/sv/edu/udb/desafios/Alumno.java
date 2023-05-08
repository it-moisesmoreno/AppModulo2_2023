package sv.edu.udb.desafios;

import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Alumno {

    // Atributos
    String carnet;
    String nombre;
    LocalDateTime fechaIngreso = LocalDateTime.now();

    // Métodos
    // Muestra información del alumno
    public void mostrarInformacionDeAlumno() {
        System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = fechaIngreso.format(myFormatObj);
        System.out.println("Fecha de ingreso: " + formattedDate);
    }
}
