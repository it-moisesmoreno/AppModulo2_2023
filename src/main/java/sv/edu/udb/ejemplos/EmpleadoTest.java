package sv.edu.udb.ejemplos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class EmpleadoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Carlos", "juancarlos@gmail.com", true);
        
        empleado.activo = false;
        empleado.edadEmpleado = 30;
        
        Empleado empleado2 = new Empleado();
        empleado2.activo = true;
        
        Empleado empleado3 = new Empleado("Ana Maria", "ana@gmail.com");
    }

}
