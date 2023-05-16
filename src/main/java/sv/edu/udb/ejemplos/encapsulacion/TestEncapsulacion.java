package sv.edu.udb.ejemplos.encapsulacion;


/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class TestEncapsulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prisionero prisionero = new Prisionero();
        Celda celda1 = new Celda("Celda1", true);
        Guardia guardia = new Guardia();
        celda1.setCodigoSeguridad(7788);
        celda1.setPrisionero(prisionero);
        
        prisionero.setNombre("Bubba");
        
        guardia.setNombre("Juan");
        guardia.setCelda(celda1);
        guardia.abrirCerrarCelda(7788);
        
        System.out.println(guardia.getNombre());
        
        /*prisionero.nombre = "Bubba";
        celda.nombre = "Celda1";
        guardia.nombre = "Juan";*/
    }

}
