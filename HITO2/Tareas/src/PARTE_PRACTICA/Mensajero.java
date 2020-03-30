package PARTE_PRACTICA;

public class Mensajero extends Oficinista{
    String TURN;
    public Mensajero(){
    }
    public void Leer(){
            OF.Leer();
        System.out.println("Ingrese el turno en el que trabaja el Oficinista");
        TURN = LEER.next();
    }
    public void Mostrar(){
        OF.Mostrar();
        System.out.println("Turno: "+ TURN);
    }
}
