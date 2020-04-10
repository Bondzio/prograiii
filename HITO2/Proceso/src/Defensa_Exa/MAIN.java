package Defensa_Exa;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        int OP;
        do {
            Scanner L = new Scanner(System.in);
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("1-----------INSTANCIAR 2 OBJETOS DE POLICIA Y PROFESOR ");
            System.out.println("2----INSTANCIAR 2 PROFESORES Y VERIFICAR SI TIENEN LA MISMA MATERIA");
            System.out.println("3-VERIFICAR SI LA CIUDAD DE UN PROFESOR PERTENECE AL DESTINO DE UN POLICIA");
            System.out.println("PRESS 0 TO EXIT");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("ESCOJA OPCION ");
            OP = L.nextInt();
            switch (OP){
                case 1:
                    POLICIA P1 = new POLICIA();
                    POLICIA P2 = new POLICIA();
                    P1.LEER();
                    P1.MOSTRAR();
                    P2.LEER();
                    P2.MOSTRAR();

                    PROFESOR PR1 = new PROFESOR();
                    PROFESOR PR2 = new PROFESOR();
                    PR1.LEER();
                    PR1.MOSTRAR();
                    PR2.LEER();
                    PR2.MOSTRAR();
                    System.out.println();
                     break;
                case 2:
                    PROFESOR PRF1 = new PROFESOR();
                    PROFESOR PRF2 = new PROFESOR();
                    PRF1.LEER();
                    PRF1.MOSTRAR();
                    PRF2.LEER();
                    PRF2.MOSTRAR();

                    if (PRF1.MATERIAS.equals(PRF2.MATERIAS)){
                             System.out.println("TIENEN LAS MISMAS MATERIAS");
                    }else {
                        System.out.println(" NO!!!!! TIENEN MATERIAS IGUALES");
                    }
                    System.out.println();
                    break;
                case 3:
                    PROFESOR Prf1 = new PROFESOR();
                    POLICIA PL1 = new POLICIA();
                    Prf1.LEER();
                    Prf1.MOSTRAR();
                    PL1.LEER();
                    PL1.MOSTRAR();
                    System.out.println(Prf1.Ciudad.equals(PL1.Dest));
//                    if (Prf1.Ciudad.equals(PL1.Dest)){
//                        System.out.println("LA CIUDAD SI PERTENECE AL DSTINO DEL POLICIA");
//                    }else {
//                        System.out.println("LA CIUDAD DEL PROFESOR NO PERTENECE AL DESTINO DEL POLICIA");
//                    }
//                    System.out.println();

                    break;
            }

        }while (OP !=0);
    }
}
