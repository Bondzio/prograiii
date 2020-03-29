package VECTORES;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Vectores vector = new Vectores();
        vector.Insert_Datos();
        vector.Burbuja();
    }
}
