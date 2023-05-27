package sv.edu.udb.ejemplos.polimorfismo;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class AlumnoInsaforp extends Alumno {
    private String nombreEmpresa;

    public AlumnoInsaforp(String nombreEmpresa, int codigo, String nombre) {
        super(codigo, nombre);
        this.nombreEmpresa = nombreEmpresa;
    }
    
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " Nombre de la empresa: " + this.nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
}
