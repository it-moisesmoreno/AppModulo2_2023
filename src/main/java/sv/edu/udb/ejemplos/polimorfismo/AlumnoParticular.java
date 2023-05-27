package sv.edu.udb.ejemplos.polimorfismo;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class AlumnoParticular extends Alumno {
    private double costoModulo;

    public AlumnoParticular(double costoModulo, int codigo, String nombre) {
        super(codigo, nombre);
        this.costoModulo = costoModulo;
    }
    
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + " Costo por módolu: " + this.costoModulo;
    }

    public double getCostoModulo() {
        return costoModulo;
    }

    public void setCostoModulo(double costoModulo) {
        this.costoModulo = costoModulo;
    }
    
}
