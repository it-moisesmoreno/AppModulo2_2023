package sv.edu.udb.ejemplos.estaticos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class TestEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Mayra");
        Empleado empleado2 = new Empleado("Juan");
        Empleado empleado3 = new Empleado("Carlos");
        
        // Para invocar a un método dentro de un contexto estático, dicho método debe tener un contexto estático
        imprimir(empleado1);
        imprimir(empleado2);
        imprimir(empleado3);
        
        System.out.println("La cantidad de objetos creados es: " + Empleado.mostrarCantidadObjetosCreados());
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("Empleado " + empleado);
    }

}
