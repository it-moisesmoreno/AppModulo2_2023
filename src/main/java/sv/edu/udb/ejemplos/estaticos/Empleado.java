package sv.edu.udb.ejemplos.estaticos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Empleado {
    private Integer idEmpleado; // Esta variable va ser calculada
    private String nombre;
    
    // Esta variable me va a permitir conocer cuantos objetos del tipo empleado se han creado
    private static int contadorEmpleado;

    public Empleado(String nombre) {
        this.nombre = nombre;
        //Utilizar el nombre de la clase para las variables estaticas para diferenciarlas de las no estaticas
        Empleado.contadorEmpleado++;
        this.idEmpleado = contadorEmpleado;
    }
    
    public static Integer mostrarCantidadObjetosCreados(){
        return Empleado.contadorEmpleado;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + '}';
    }
    
    
}
