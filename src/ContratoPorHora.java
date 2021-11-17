public class ContratoPorHora extends Contrato implements Comparable{

    private double horasContratadas;
    private double valorHora;

    public ContratoPorHora(Persona persona, int mesesDuracion, String fechaInicio, boolean sellado, double horasContratadas, double valorHora) {
        super(persona, mesesDuracion, fechaInicio, sellado);
        this.horasContratadas=horasContratadas;
        this.valorHora=valorHora;

    }

    public double getHorasContratadas() {
        return horasContratadas;
    }

    public void setHorasContratadas(double horasContratadas) {
        this.horasContratadas = horasContratadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object o) {
       ContratoPorHora contratoAComparar = (ContratoPorHora)o;
       int respuesta=0;
       if (horasContratadas>contratoAComparar.horasContratadas){
           respuesta=1;
       }if (horasContratadas<contratoAComparar.horasContratadas){
           respuesta=-1;
        }
       return  respuesta;
    }
}
