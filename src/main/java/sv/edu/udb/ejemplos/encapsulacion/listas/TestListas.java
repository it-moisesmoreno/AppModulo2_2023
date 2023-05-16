package sv.edu.udb.ejemplos.encapsulacion.listas;

import java.util.ArrayList;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class TestListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos un objeto departamento
        Departamento sanSalvador = new Departamento();
        sanSalvador.setIdDepto(1);
        sanSalvador.setNombreDepto("San Salvador");
        
        // Creamos un objetos municipios
        Municipio mejicanos = new Municipio();
        mejicanos.setIdMuni(1);
        mejicanos.setNombreMuni("Mejicanos");
        mejicanos.setDepartamento(sanSalvador);
        
        Municipio zacamil = new Municipio();
        zacamil.setIdMuni(2);
        zacamil.setNombreMuni("Zacamil");
        zacamil.setDepartamento(sanSalvador);
        
        Municipio soyapango = new Municipio();
        soyapango.setIdMuni(3);
        soyapango.setNombreMuni("Soyapango");
        soyapango.setDepartamento(sanSalvador);
        
        // Inicializamos la lista de municipios de SS
        sanSalvador.setLstMunicipios(new ArrayList<>());
        sanSalvador.getLstMunicipios().add(mejicanos);
        sanSalvador.getLstMunicipios().add(zacamil);
        sanSalvador.getLstMunicipios().add(soyapango);
        
        System.out.println("Municipios de San Salvador");
        for(Municipio municipio: sanSalvador.getLstMunicipios()){
            System.out.println("Código: " + municipio.getIdMuni() + " Nombre: " + municipio.getNombreMuni());
        }
        
        System.out.println("Departamento al que pertenece Mejicanos: " + mejicanos.getDepartamento().getNombreDepto());
    }

}
