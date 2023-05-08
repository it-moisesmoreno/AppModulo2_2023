package sv.edu.udb.ejemplos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class CuentaAhorro {

    //Atributos (Variables) de la clase
    public String numeroCuenta;
    public double balance;
    public String nombreTitular;
    public double interes = 0.01;

    // Método de la clase   
    // void --> no me va a retornar nada el métodos
    public void mostrarInformacionCuenta() {
        System.out.println("Cliente: " + nombreTitular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("El balance del cliente es: " + balance);
    }

    // Escriba un método que reciba un double con el monto a depositar 
    // en el balance del cliente. Este depósito incrementará dicho balance
    public void depositar(double montoADepositar) {
        balance = balance + montoADepositar;
        //balance += montoADepositar;
    }

    // Escriba una función para retirar
    public void retirar(double montoARetirar) {

        if (montoARetirar > balance) {
            System.out.println("No se puede retirar. El monto a retirar es mayor al balance.");
            return;
        }

        if (montoARetirar <= 0) {
            System.out.println("No se puede retirar. Indique un monto válido.");
            return;
        }

        balance -= montoARetirar;
    }

    public double calcularPagoMensual(double montoPrestamo) {
        // double pagoMensual = montoPrestamo * interes / 12;        
        // return pagoMensual; 
        return montoPrestamo * interes / 12;
    }
}
