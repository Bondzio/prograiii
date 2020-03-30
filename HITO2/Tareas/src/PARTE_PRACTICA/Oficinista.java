package PARTE_PRACTICA;

public class Oficinista extends Empleado{
    String CodArea;
    int SueldBasico;
    Oficinista OF = new Oficinista();
    public Oficinista(){
    }
    public void Leer(){
        Empleado.Leer();
        System.out.println("Ingrese Codigo Area de Oficinista");
        CodArea = LEER.next();
        System.out.println("Ingrese sueldo basico de Oficinista");
        SueldBasico = LEER.nextInt();
    }
    public void Mostrar(){
        Empleado.Mostrar();
        System.out.printf("CodArea: %s  SueldBasico: %d",CodArea,SueldBasico);
    }

}
