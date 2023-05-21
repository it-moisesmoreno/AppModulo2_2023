package sv.edu.udb.ejemplos.herencia;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class TestEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creació de variables 
        Scanner in = new Scanner(System.in);
        String nombre, apellidos, puesto;
        int horas;
        double pagoHora;
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.US);
        List<Empleado> lstEmpleado = new ArrayList<>();
        String continuar = "SI";

        System.out.println("***** PLANILLA DE EMPLEADOS *****");

        while (continuar.equalsIgnoreCase("SI")) {
            // Captura de datos
            System.out.println("Digite el nombre del empleado: ");
            nombre = in.next();
            System.out.println("Digite los apellidos del empleado:");
            apellidos = in.next();
            System.out.println("Digite el puesto del empleado:");
            puesto = in.next();
            System.out.println("Digite la cantidad de horas laboradas:");
            horas = in.nextInt();
            System.out.println("Digite el pago por hora:");
            pagoHora = in.nextDouble();

            Empleado empleado = new Empleado(pagoHora, horas, puesto, nombre, apellidos);
            empleado.calcularPlanilla();
            lstEmpleado.add(empleado);
            System.out.println("¿Deses continuar? SI/NO");
            continuar = in.next();
            System.out.println("");
        }

        for (Empleado empleado : lstEmpleado) {
            System.out.print("Código: " + empleado.getCodigo());
            System.out.print("| Nombre: " + empleado.getNombre());
            System.out.print("| Apellido: " + empleado.getApellidos());
            System.out.print("| Puesto: " + empleado.getPuesto());
            System.out.print("| Salario Bruto: " + formatoMoneda.format(empleado.getSalarioBruto()));
            System.out.print("| ISSS: " + formatoMoneda.format(empleado.getIsss()));
            System.out.print("| AFP: " + formatoMoneda.format(empleado.getAfp()));
            System.out.print("| Renta: " + formatoMoneda.format(empleado.getRenta()));
            System.out.print("| Salario Neto: " + formatoMoneda.format(empleado.getSalarioNeto()));
            System.out.println("");
        }

    }

}
