package Defensa_Exa;

public class POLICIA extends PERSONA{
    private String Turn;
    private int NroDest;
    public String[] Dest;

    public POLICIA(){
        super();
        this.Turn = "";
        this.NroDest = 0;
        //this.Dest = "";
    }

    public void LEER(){
        super.LEER();
        System.out.println("TURNO: ");
        this.Turn = LEER.next();
        System.out.println("NRODESTINOS: ");
        this.NroDest = LEER.nextInt();
        this.Dest = new String[this.NroDest];
        for (int i = 0; i < this.NroDest; i++){
            System.out.println("INGRESE EL DESTINO: ");
            this.Dest[i] = LEER.next();
        }
    }

    public void MOSTRAR(){
        super.MOSTRAR();
        System.out.printf("TURNO: %s, NRODESTINOS: %d \n",this.Turn, this.NroDest);
        for (int J = 0; J < this.NroDest; J++){
            System.out.printf("DESTINO: %d = %s \n",(J + 1),this.Dest[J]);
        }
    }
}
