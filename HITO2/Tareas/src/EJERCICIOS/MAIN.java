package EJERCICIOS;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        int OP;
        Ejercicios ejer = new Ejercicios();
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.-    EJERCICIO1 ");
            System.out.println("2.-    EJERCICIO2 ");
            System.out.println("3.-    EJERCICIO3 ");
            System.out.println("4.-    EJERCICIO4 ");
            System.out.println("     PRESS 0 TO EXIT");
            System.out.println();
            System.out.println("ESCOJA OPCION ");
            OP = scanner.nextInt();
            switch (OP){
                case 1:
                    ejer.Ejercicio1();break;
                case 2: {
                    ejer.Ingresar();
                    int OP1;
                    do {
                        System.out.println("1 ----METODO BURBUJA");
                        System.out.println("2 ----METODO SELECCION");
                        System.out.println("------PRESS 0 TO EXIT");
                        System.out.println("------ESCOJA OPCION");
                        OP1 = scanner.nextInt();
                        switch (OP1) {
                            case 1:
                                ejer.Ej2Burbuja();break;
                            case 2:
                                ejer.Ej2seleccion();break;
                            default: break;
                        }
                    } while (OP1 != 0);
                } break;
                case 3:
                    ejer.Ejercicio3();break;
                case 4:
                    ejer.Ejercicio4();break;
                default:break;
            }


        }while (OP != 0);
    }

}
