package Calculadora;

public class Calculadora implements Suma, Resta, Multiplicacion, Divicion {
    public int suma(int a, int b){
        return a + b;
    }
    public int resta(int a, int b){
        return a - b;
    }
    public int multiplicacion(int a, int b){
        return a * b;
    }
    public int divicion(int a, int b) {
        return a / b;
    }
    public void IMPRIMIR(String Msg, int Val){
        System.out.printf("%s %d ",Msg,Val,"\n");
    }
}
