package PARTE_PRACTICA;

public class Oficinista extends Empleado{
    String codArea;
    int SueldoBasico;
    Oficinista OF = new Oficinista();
    public Oficinista(){
    }
    public void Leer(){
        Empleado.Leer();
        System.out.println("Ingrese el Codigo de Area del Oficinista");
        codArea = LEER.next();
        System.out.println("Ingrese el sueldo basico del Oficinista");
        SueldoBasico = LEER.nextInt();
    }
    public void Mostrar(){
        Empleado.Mostrar();
        System.out.println("Cod. de Area: "+ codArea);
        System.out.println("Sueldo Basico: "+ SueldoBasico);
    }

}
