package sv.edu.udb.ejemplos.encapsulacion;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Celda {
    // variables
    // Encapsulación: Proteger el acceso a los miembros de la clase
    private String nombre;
    private int codigoSeguridad;
    private boolean cerrada;
    private Prisionero prisionero;
    
    // Constructores
    public Celda(String nombre, boolean cerrada) {
        this.nombre = nombre;
        this.cerrada = cerrada;
    }
    
    
    //Métodos propios

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    
    // Métodos set y get
    
    // get --> obtener el valor de un atributo
    public String getNombre() {
        return nombre;
    }
    
    // set --> asignar un valor a un atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Para los atributos tipos boolean en lugar de get, el método inicia con "is"
    public boolean isCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    public Prisionero getPrisionero() {
        return prisionero;
    }

    public void setPrisionero(Prisionero prisionero) {
        this.prisionero = prisionero;
    }
    
    
    
}
