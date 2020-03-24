package Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora Calc = new Calculadora();
        Calc.IMPRIMIR("la suma es : ", Calc.suma(5,5));
        Calc.IMPRIMIR("\n la resta es : ", Calc.resta(15,5));
        Calc.IMPRIMIR("\n la multiplicacion es : ", Calc.multiplicacion(2,5));
        Calc.IMPRIMIR("\n la divicion es : ", Calc.divicion(100,10));
    }
}

