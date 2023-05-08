package sv.edu.udb.desafios;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class AlumnoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Alumno 1
        Alumno alumno01 = new Alumno();
        alumno01.carnet = "AR230000";
        alumno01.nombre = "Alberto Rosa";
        alumno01.mostrarInformacionDeAlumno();
        
        System.out.println("*****");
        
        // Alumno 2
        Alumno alumno02 = new Alumno();
        alumno02.carnet = "AC230001";
        alumno02.nombre = "Alberto Cubias";
        alumno02.mostrarInformacionDeAlumno();
    }

}
