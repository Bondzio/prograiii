package Evaluacion;

public class POLICIA extends PERSONA{
    String Trn;
    int NRODEST;
    String[] DEST;
    PERSONA PER = new PERSONA();
    public POLICIA(){

    }

    public String[] getDEST() {
        return this.DEST;
    }

    public void LEER() {
        PER.LEER();
        System.out.println("INGRESE TURNO DEL POLICIA:");
        Trn = LEER.next();
        System.out.println("INGRESE NRO DE DESTINOS DE POLICIA:");
        NRODEST = LEER.nextInt();
        DEST = new String[NRODEST];
        for(int i=0;i<NRODEST;i++){
            System.out.println("DESTINO "+(i + 1)+" DE POLICIA");
            DEST[i] = LEER.next();
        }

    }
    public void Mostrar() {
        PER.Mostrar();
        System.out.println("TURNO: " + Trn);
        for(int i=0;i<NRODEST;i++){
            System.out.println("DESTINO "+(i + 1)+": " +DEST[i]);
        }
    }

}
