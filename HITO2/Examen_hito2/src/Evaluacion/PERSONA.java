package Evaluacion;

public class PERSONA extends CIUDADANO{
    String EtapDeCrec;

    CIUDADANO C = new CIUDADANO();
    public PERSONA(){
    }
    public void LEER(){
        C.LEER();
        System.out.println("INGRESE EATAPA DE PERSONA");
        EtapDeCrec = LEER.nextLine();
    }
    public void Mostrar(){
        System.out.println("Etapa: "+EtapDeCrec);
    }
}
