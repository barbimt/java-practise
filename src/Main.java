public class Main {
    public static void main(String[] args) {
        Persona barbi = new Persona("Barbi", "Torres", 37832268, 27);
        Persona marcio = new Persona("Marcio", "Alico", 37832269, 26);

        Contrato cm1 = new ContratoMensual(barbi,6,"14/10/2021",true,30000,6,"Jefe");
        Contrato cm2 = new ContratoMensual(marcio,2,"20/10/2021",false,10000,4,"Empleado");

        Contrato cxh1 = new ContratoPorHora(barbi, 3,"20/10/2021", true, 4, 10);
        Contrato cxh2 = new ContratoPorHora(marcio, 2,"20/10/2021", false, 2, 5);

        ContratoMensual contratoMensual= (ContratoMensual) cm1;
        ContratoMensual contratoMensual2= (ContratoMensual) cm2;
        System.out.println(contratoMensual.getPersona().getNombre() + ". Se puede incorporar al trabajo?: " + contratoMensual.estaSellado());
        System.out.println(contratoMensual2.getPersona().getNombre() +". Se puede incorporar al trabajo?: " + contratoMensual2.estaSellado());

        ContratoPorHora contratoPorHora1= (ContratoPorHora) cxh1;
        ContratoPorHora contratoPorHora2= (ContratoPorHora) cxh2;

        if (contratoPorHora1.compareTo(contratoPorHora2) > 0){
            System.out.println("El contrato1 tiene mayor cantidad de horas que el contrato2");
        } else if (contratoPorHora1.compareTo(contratoPorHora2) < 0){
            System.out.println("El contrato2 tiene mayor cantidad de horas que el contrato1");
        } else{
            System.out.println("Los dos contratos tienen la misma cantidad de horas");
        }

        System.out.println(contratoMensual.getPersona().getNombre() + ". Es Jefe? " + contratoMensual.esJefe());
        System.out.println(contratoMensual2.getPersona().getNombre() +". Es Jefe? " + contratoMensual2.esJefe());

    }
}
