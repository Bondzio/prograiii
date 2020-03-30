package EJERCICIOS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicios {
    int[] Vec;
    int T;

    public Ejercicios(){

    }
    public void Ejercicio1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad N de valores que desee mostrar de la serie FIBONACCI");
        int n = scanner.nextInt();
        int S=0,b=1,R=0;
        for(int i = 0;i<n;i++) {
            System.out.printf("%d, ", S);
            R = S;
            S = S + b;
            b = R;
        }
        System.out.println();
    }
    public void Ingresar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        T = sc.nextInt();
        Vec = new int[T];
        for (int i=0; i< T;i++){
            System.out.println("Ingrese valor en la pocicion " + (i + 1)+" del vector");
            Vec[i]= sc.nextInt();
        }
        System.out.println();
    }
    public void Ej2Burbuja(){

        int aux=0;
        for(int i=0;i<=T;i++){
            for(int j=0;j<T-1;j++){
                if(Vec[j]>Vec[j+1]){
                    aux=Vec[j];
                    Vec[j]=Vec[j+1];
                    Vec[j+1]=aux;
                }
            }
        }
        for(int i=0;i<T;i++){
            System.out.printf("%d",Vec[i]);
        }
        System.out.println();
    }
    public void Ej2seleccion(){
        int Min = 0, Au = 0;
        for(int i = 0; i < T; i++){
            Min = i;
            for(int j = i + 1; j < T; j++){
                if(Vec[Min] > Vec[j]) {
                    Au = Vec[Min];
                    Vec[i] = Vec[j];
                    Vec[j] = Au;
                }
            }
        }

        for(int i = 0; i < T; i++){
            System.out.printf("%d",Vec[i]);
        }
        System.out.println();
    }
    public void Ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los N elementos de la cadena");
        int tam = sc.nextInt();
        String[] cadena = new  String[tam];
        ArrayList<String> al = new ArrayList<String>();
        for (int i=0; i<tam;i++){
            al.add(sc.next());
        }
        Iterator<String> it = al.iterator();
        while(it.hasNext() )
            System.out.println(it.next());
    }
    public void Ejercicio4(){
        int[] vector = new int[10];
        int cont=0;
        for(int i = 0; i < 10; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el valor en la pocicion " + (i + 1)+" del vector");
            vector[i] = sc.nextInt();
            if ((vector[i]%2 == 0)){
                cont++;
            }
        }
        System.out.println("la cantidad de numeros pares del arrays es " + (cont));
    }
}
