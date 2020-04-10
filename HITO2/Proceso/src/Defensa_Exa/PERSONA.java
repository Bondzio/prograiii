package Defensa_Exa;

public class PERSONA extends CIUDADANO{
    private String EtapCrec;

    public PERSONA(){
        super();
        this.EtapCrec = "";
    }

    public void LEER(){
        super.LEER();
        System.out.println("Etapa de Crecimiento: ");
        this.EtapCrec = LEER.next();
    }

    public void MOSTRAR(){
        super.MOSTRAR();
        System.out.printf("EtapaC: %s, ",this.EtapCrec);
    }
}
