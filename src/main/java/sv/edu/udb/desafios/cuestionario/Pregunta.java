package sv.edu.udb.desafios.cuestionario;

/**
 * La clase Pregunta tiene dos atributos: texto de tipo String y respuesta de
 * tipo Boolean.
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Pregunta {

    // Atributos
    private String texto;
    private Boolean respuesta;
    
    /**
     * Se agrega el constructor de la clase Pregunta con ambos atributos.
     * @param texto
     * @param respuesta 
     */
    public Pregunta(String texto, Boolean respuesta) {
        this.texto = texto;
        this.respuesta = respuesta;
    }
    
    // GETTERS Y SETTERS
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Boolean respuesta) {
        this.respuesta = respuesta;
    }

}
