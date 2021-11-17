public abstract class Contrato {
    private Persona persona;
    private int mesesDuracion;
    private String fechaInicio;
    private boolean sellado;

    public boolean estaSellado(){
        return sellado;
    }

    public Contrato(Persona persona, int mesesDuracion, String fechaInicio, boolean sellado) {
        this.persona = persona;
        this.mesesDuracion = mesesDuracion;
        this.fechaInicio = fechaInicio;
        this.sellado = sellado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getMesesDuracion() {
        return mesesDuracion;
    }

    public void setMesesDuracion(int mesesDuracion) {
        this.mesesDuracion = mesesDuracion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public boolean isSellado() {
        return sellado;
    }

    public void setSellado(boolean sellado) {
        this.sellado = sellado;
    }
}
