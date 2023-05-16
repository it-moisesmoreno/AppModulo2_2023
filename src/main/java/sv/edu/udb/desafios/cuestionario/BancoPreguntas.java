package sv.edu.udb.desafios.cuestionario;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Salvador Peña
 */
public class BancoPreguntas {

    Map<String, Boolean> bancoPreguntas = new HashMap();

    public void prepararBancoPreguntas() {
        bancoPreguntas.put("Una clase es un modelo que permite crear objetos.", Boolean.TRUE);
        bancoPreguntas.put("Un objeto es también llamado instancia de clase.", Boolean.TRUE);
        bancoPreguntas.put("El método set me permite obtener un valor.", Boolean.FALSE);
        bancoPreguntas.put("Se puede aplicar la sobrecarga de métodos en los constructores.", Boolean.TRUE);
        bancoPreguntas.put("Un constructor me permite inicializar los atributos.", Boolean.TRUE);
        bancoPreguntas.put("El constructor se debe llamar diferente a la clase que lo contiene.", Boolean.FALSE);
        bancoPreguntas.put("Los objetos tienen atributos y comportamiento.", Boolean.TRUE);
        bancoPreguntas.put("El encapsulamiento permite proteger las características de un objeto.", Boolean.TRUE);
        bancoPreguntas.put("public define el acceso de ámbito público para un atributo o método.", Boolean.TRUE);
    }

    public Map<String, Boolean> getBancoPreguntas() {
        return bancoPreguntas;
    }

    public void setBancoPreguntas(Map<String, Boolean> bancoPreguntas) {
        this.bancoPreguntas = bancoPreguntas;
    }

}
