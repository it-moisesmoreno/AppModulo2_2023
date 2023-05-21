package sv.edu.udb.ejemplos.herencia;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Persona {
    private String codigo; // Dato calculado
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.codigo = nombre.substring(0, 2) + apellidos.substring(0, 2);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
