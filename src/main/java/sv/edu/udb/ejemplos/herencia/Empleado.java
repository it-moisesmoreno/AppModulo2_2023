package sv.edu.udb.ejemplos.herencia;

/**
 *
 * @author Moisés Moreno <Moisés.Moreno at linkedin.com/in/it-moisesmoreno>
 */
public class Empleado extends Persona {
    private double pagoHora;
    private int horas;
    private String puesto;
    private double isss;
    private double afp;
    private double renta;
    private double salarioBruto;
    private double salarioNeto;

    public Empleado(double pagoHora, int horas, String puesto, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.pagoHora = pagoHora;
        this.horas = horas;
        this.puesto = puesto;
    }
    
    public void calcularPlanilla(){
        calcularSalarioBruto();
        calcularIsss();
        calcularAfp();
        calcularRenta();
        calcularSalarioNeto();
    }
    
    private void calcularSalarioBruto(){
        this.salarioBruto = (this.horas * this.pagoHora);
    }
    
    private void calcularIsss(){
        this.isss = this.salarioBruto * 0.03;
    }
    
    private void calcularAfp(){
        this.afp = this.salarioBruto * 0.0725;
    }

    private void calcularRenta(){
        this.renta = ((this.salarioBruto - this.isss - this.afp) * 0.10);
    }
    
    private void calcularSalarioNeto(){
        this.salarioNeto = (this.salarioBruto - this.isss - this.afp - this.renta);
    }
    
     public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getIsss() {
        return isss;
    }

    public void setIsss(double isss) {
        this.isss = isss;
    }

    public double getAfp() {
        return afp;
    }

    public void setAfp(double afp) {
        this.afp = afp;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

}
