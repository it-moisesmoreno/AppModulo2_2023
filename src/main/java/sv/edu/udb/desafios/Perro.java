package sv.edu.udb.desafios;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Perro {
    int tamanio;
    String nombre;
    
    public Perro(int tamanio, String nombre){
        this.nombre = nombre;
        this.tamanio = tamanio;
        
        this.ladrar();
    }
    
    public void ladrar(){
        if(this.tamanio>60){
            System.out.println("Ladrar: Woof Woof");
        } else if(this.tamanio <=60  && this.tamanio>14){
            System.out.println("Ladrar: Ruff!! Ruff!!");
        }else{
            System.out.println("Ladrar: Yip! Yip!");
        }
    }
}
