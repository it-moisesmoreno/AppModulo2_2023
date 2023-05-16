package sv.edu.udb.ejemplos.encapsulacion;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Guardia {
    
    // Encapsulación: Proteger el acceso a los miembros de la clase
    
    private String nombre;
    private Celda celda; // Variable del tipo Celda
    
    public void abrirCerrarCelda(int codigoSeguridad){
        if(codigoSeguridad == celda.getCodigoSeguridad()){
            if(celda.isCerrada()){
                celda.setCerrada(false);
                System.out.println("La puerta de la celda " + celda.getNombre() + " se abrió.");
            }else{
                celda.setCerrada(true);
                System.out.println("La puerta de la celda " + celda.getNombre() + " se cerró");
            }
        }else{
            System.out.println("Código incorrecto !!!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Celda getCelda() {
        return celda;
    }

    public void setCelda(Celda celda) {
        this.celda = celda;
    }
    
    
}
