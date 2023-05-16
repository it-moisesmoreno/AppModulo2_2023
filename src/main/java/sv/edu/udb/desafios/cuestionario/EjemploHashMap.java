package sv.edu.udb.desafios.cuestionario;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Salvador Peña
 */
public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, Boolean> mapa = new HashMap<>();
 
        mapa.put("pregunta 1", Boolean.TRUE);
        mapa.put("pregunta 2", Boolean.TRUE);
        mapa.put("pregunta 3", Boolean.TRUE);
        mapa.put("pregunta 4", Boolean.TRUE);
        mapa.put("pregunta 5", Boolean.FALSE);        
        
        System.out.println("Recorrer mediante entry");
        for (Map.Entry entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", valor: " + entry.getValue());
        }
    }
}