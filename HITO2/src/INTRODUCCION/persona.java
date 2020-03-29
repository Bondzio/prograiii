package INTRODUCCION;

import java.util.Scanner;

public class persona {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //para leer cadenas
        /*System.out.println("Ingrese su Nombre");
        String miNombre = leer.nextLine();
        System.out.println("Ingrese su Apellido");
        String miApellido = leer.nextLine();

        System.out.printf("su nombre completo es: %s %s", miNombre, miApellido);
        System.out.println();

        System.out.println("inngrese su edad");
        int  miEdad = leer.nextInt();
        System.out.printf("su edad es: %d", miEdad);*/

        //Sumar las primeras 5 edades
        int SEdades = 0;
        System.out.println("ingrese su edad");
        while (leer.hasNextInt()){
            int miEdad2 =leer.nextInt();
            SEdades = SEdades +  miEdad2;
            System.out.println("ingrese su edad");
        }
        System.out.println("La suma total de edades es: " + SEdades);
    }
}
