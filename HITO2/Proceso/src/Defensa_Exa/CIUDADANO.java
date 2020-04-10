package Defensa_Exa;

public class CIUDADANO implements LEERINTERFACE{
    private String PNombre;
    private String PApellido;
    private int CInumber;
    private String CIexten;
    private int Edad;

    public CIUDADANO() {
        this.PNombre = "";
        this.PApellido = "";
        this.CInumber = 0;
        this.CIexten = "";
        this.Edad = 0;
    }

    public void LEER(){
        System.out.println("Nombre: ");
        this.PNombre = LEER.next();
        System.out.println("Apellido: ");
        this.PApellido = LEER.next();
        System.out.println("CI: ");
        this.CInumber = LEER.nextInt();
        System.out.println("ExtensionCI: ");
        this.CIexten = LEER.next();
        System.out.println("Edad: ");
        this.Edad = LEER.nextInt();
    }
    public void MOSTRAR(){
        System.out.printf("NOMBRE: %s, APELLIDO: %s, CI: %d, EXTENCI: %s, EDAD: %d ",this.PNombre,this.PApellido,this.CInumber,this.CIexten,this.Edad);
    }
}
