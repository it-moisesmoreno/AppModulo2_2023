package sv.edu.udb.ejemplos.encapsulacion.listas;

import java.util.List;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Departamento {
    private int idDepto;
    private String nombreDepto;
    // Un departamento posee una lista de municipios
    private List<Municipio> lstMunicipios;

    // GETTERS AND SETTERS
    public int getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(int idDepto) {
        this.idDepto = idDepto;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public void setNombreDepto(String nobreDepto) {
        this.nombreDepto = nobreDepto;
    }

    public List<Municipio> getLstMunicipios() {
        return lstMunicipios;
    }

    public void setLstMunicipios(List<Municipio> lstMunicipios) {
        this.lstMunicipios = lstMunicipios;
    }
    
    

}
