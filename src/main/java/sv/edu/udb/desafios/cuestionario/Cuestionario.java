package sv.edu.udb.desafios.cuestionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Se Crea la clase Cuestionario con los atributos: cantidadPreguntas de tipo
 * int, un objeto del tipo BancoPreguntas con el nombre bancoPreguntas, una
 * lista de objetos de la clase Pregunta llamada lstPreguntas y el atributo nota
 * de tipo int
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Cuestionario {

    // Atributos
    private int cantidadPreguntas;
    private BancoPreguntas bancoPreguntas;
    private List<Pregunta> lstPreguntas;
    private int nota;

    /**
     * Se Crea un constructor en la clase Cuestionario que reciba como único
     * parámetro un entero con el nombre cantidadPreguntas.
     *
     * @param cantidadPreguntas
     */
    public Cuestionario(int cantidadPreguntas) {
        this.cantidadPreguntas = cantidadPreguntas;
    }

    // Métodos propios 
    /**
     * Se encargará de recorrer el HashMap y agregar la cantidad de preguntas
     * que tenga la variable cantidadPregutas a la lista lstPreguntas
     */
    public void prepararCuestionario() {

        this.bancoPreguntas = new BancoPreguntas();
        this.bancoPreguntas.prepararBancoPreguntas();
        this.setLstPreguntas(new ArrayList<>());

        for (Map.Entry<String, Boolean> entry : bancoPreguntas.getBancoPreguntas().entrySet()) {
            if (lstPreguntas.size() == cantidadPreguntas) {
                break;
            }
            Pregunta pregunta = new Pregunta(entry.getKey(), entry.getValue());
            lstPreguntas.add(pregunta);
        }
    }

    /**
     * Recibe como parámetro dos Boolean, uno llamado respuestaUsuario y otro
     * llamado respuestaCorrecta. El método se encarga de comparar las dos
     * respuestas y en caso de ser iguales sumará uno a la variable nota y
     * devolverá un string “Respuesta Correcta”, en caso de que las respuestas
     * sean diferentes devolverá el mensaje “Respuesta Incorrecta”
     *
     * @param respuestaUsuario
     * @param respuestaCorrecta
     * @return
     */
    public String verificarRespuesta(boolean respuestaUsuario, boolean respuestaCorrecta) {
        if (respuestaUsuario == respuestaCorrecta) {
            this.nota++;
            return "Respuesta Correcta";
        } else {
            return "Respuesta Incorrecta";
        }
    }

    // GETTERS Y SETTERS
    public int getCantidadPreguntas() {
        return cantidadPreguntas;
    }

    public void setCantidadPreguntas(int cantidadPreguntas) {
        this.cantidadPreguntas = cantidadPreguntas;
    }

    public BancoPreguntas getBancoPreguntas() {
        return bancoPreguntas;
    }

    public void setBancoPreguntas(BancoPreguntas bancoPreguntas) {
        this.bancoPreguntas = bancoPreguntas;
    }

    public List<Pregunta> getLstPreguntas() {
        return lstPreguntas;
    }

    public void setLstPreguntas(List<Pregunta> lstPreguntas) {
        this.lstPreguntas = lstPreguntas;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
