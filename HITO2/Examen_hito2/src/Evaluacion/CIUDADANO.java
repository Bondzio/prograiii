package Evaluacion;

public class CIUDADANO implements LEERINTERFACE{
     String PNombre, PApellid, CIExten;
     int CINumero, E;

    public CIUDADANO(){

    }

//    public String getPNombre() {
//        return this.PNombre;
//    }
//
//    public String getPApellid() {
//        return this.PApellid;
//    }
//
//    public String getCIExten() {
//        return this.CIExten;
//    }
//
//    public int getCINumero() {
//        return this.CINumero;
//    }
//
//    public int getE() {
//        return this.E;
//    }

    public void LEER(){
        System.out.println("INGRESE SU NOMBRE: ");
        PNombre = LEER.nextLine();
        System.out.println("INGRESE SU APELLIDO: ");
        PApellid = LEER.nextLine();
        System.out.println("INGRESE EXTENSION DE CI: ");
        CIExten = LEER.nextLine();
        System.out.println("INGRESE SU CI: ");
        CINumero = LEER.nextInt();
        System.out.println("INGRESE SU EDAD: ");
        E = LEER.nextInt();
    }
    public void Mostrar(){
        System.out.printf("Nombre: %s  Apellido: %s  ExtCI: %s  CI:  %d", this.PNombre, this.PApellid, this.CIExten, this.CINumero, this.E);
    }
}
