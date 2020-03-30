package PARTE_PRACTICA;

public class Secretaria extends Oficinista{
    String NomArea;
    public Secretaria(){
    }
    public void Leer(){
        OF.Leer();
        System.out.println("Ingrese el Nombre de Area del Oficinista");
        NomArea = LEER.next();
    }
    public void Mostrar(){
        OF.Mostrar();
        System.out.println("Nombre Del Area: "+ NomArea);
    }
}
