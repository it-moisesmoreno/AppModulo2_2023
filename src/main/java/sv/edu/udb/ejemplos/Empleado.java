package sv.edu.udb.ejemplos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Empleado {

    public String nombres;
    public String correo;
    public boolean activo;
    public int edadEmpleado;
    
    // Característica del constructor:
    // 1- Es un método que tiene el mismo nombre que la clase
    // 2- Crear constructores
    // 3- Constructor por defecto
    // 4- Una clase puede tener varios constructores
    // Sobrecarga de métodos --> Varios métodos con el mismo nombre pero diferente firma
    public Empleado(String nombres, String correo, boolean activo){
        //this --> esta clase
        this.nombres = nombres;
        this.correo = correo;
        this.activo = activo;
        //El objeto ya tiene sus datos dentros
    }
    
     public Empleado() {
    }

    public Empleado(String nombres, String correo) {
        this.nombres = nombres;
        this.correo = correo;
    }
}
