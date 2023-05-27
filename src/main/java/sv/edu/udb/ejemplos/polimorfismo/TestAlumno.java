package sv.edu.udb.ejemplos.polimorfismo;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class TestAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alumno = new Alumno(1, "Neftali");
        imprimirDetalles(alumno);
        //System.out.println(alumno.obtenerDetalles());
        
        AlumnoInsaforp alumnoInsaforp = new AlumnoInsaforp("Empresa XYZ", 2, "Alma Dinora");
        imprimirDetalles(alumnoInsaforp);
        //System.out.println(alumnoInsaforp.obtenerDetalles()); 
        
        AlumnoParticular alumnoParticular = new AlumnoParticular(250, 3, "Moisés");
        imprimirDetalles(alumnoParticular);
        //System.out.println(alumnoParticular.obtenerDetalles());
    }
    
    public static void imprimirDetalles(Alumno alumno){
        System.out.println(alumno.obtenerDetalles());
    }

}
