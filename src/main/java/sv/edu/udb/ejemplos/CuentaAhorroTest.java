package sv.edu.udb.ejemplos;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class CuentaAhorroTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaAhorro ca001 = new CuentaAhorro();
        ca001.numeroCuenta = "001";
        ca001.balance = 1000;
        ca001.nombreTitular = "Juan Antonio Perez";
        ca001.depositar(19000);
        System.out.println("Información antes de retirar");
        ca001.mostrarInformacionCuenta();
        ca001.retirar(21000);
        ca001.retirar(-210);
        ca001.retirar(0);
        ca001.retirar(15000);
        System.out.println("Información después de retirar");
        ca001.mostrarInformacionCuenta();
        
        System.out.println("*****");
        
        CuentaAhorro ca002 = new CuentaAhorro();
        ca002.numeroCuenta = "002";
        ca002.balance = 2000;
        ca002.nombreTitular = "Rodrigo Ramirez";
        ca002.interes = 0.1;
        ca002.retirar(1000);
        ca002.mostrarInformacionCuenta();
        
        double pagoMensual = ca002.calcularPagoMensual(900);
        System.out.println("Pago Mensual: " + pagoMensual);
    }
    
}
