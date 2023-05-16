package sv.edu.udb.ejemplos.encapsulacion.listas;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Municipio {
    private int idMuni;
    private String nombreMuni;
    // Un municipio pertenece a un departamento
    private Departamento departamento;
    
    // GETTTERS AND SETTERS
    public int getIdMuni() {
        return idMuni;
    }

    public void setIdMuni(int idMuni) {
        this.idMuni = idMuni;
    }

    public String getNombreMuni() {
        return nombreMuni;
    }

    public void setNombreMuni(String nombreMuni) {
        this.nombreMuni = nombreMuni;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    

}
