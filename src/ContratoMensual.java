public class ContratoMensual extends Contrato{
    private double salario;
    private double horasTotales;
    private String cargo;

    public ContratoMensual(Persona persona, int mesesDuracion, String fechaInicio, boolean sellado, double salario, double horasTotales, String cargo) {
        super(persona, mesesDuracion, fechaInicio, sellado);
        this.salario = salario;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public boolean esJefe(){
        return cargo.equals("Jefe");
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(double horasTotales) {
        this.horasTotales = horasTotales;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
