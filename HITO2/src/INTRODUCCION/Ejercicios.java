package INTRODUCCION;

import java.util.Scanner;

public class Ejercicios {
    public Scanner leer;
    public  Ejercicios(){
        leer = new Scanner(System.in);
    }

    public void serieNaturales(int n){
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    public void compara2Cadenas(String C1, String C2){
        if (C1.equals(C2)){
            System.out.println("Cadenas Iguales");
        }else {
            System.out.println("Cadenas Distintas");
        }
    }
}
