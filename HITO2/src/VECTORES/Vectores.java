package VECTORES;

import java.util.Scanner;

public class Vectores implements Ordenacion{
    int T;
    int[] vector = new int[4];
    public Vectores(){
    }

    public void Insert_Datos(){

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int T = leer.nextInt();
        for (int i=0;i<T;i++){
            System.out.println("Inserte valor del numero "+(i+1));
            vector[i] = leer.nextInt();
        }
    }
    public void Burbuja(){
        int Aux = 0;
        for (int j = 0;j < vector.length; j++) {
            for (int i = j + 1; i < vector.length; i++) {
                if (vector[j] > vector[i]) {
                    Aux = vector[j];
                    vector[j] = vector[i];
                    vector[i] = Aux;
                }
            }
        }
        for (int i=0;i<vector.length;i++){
            System.out.println(vector[i]);
        }
    }
    public void Insercion(){
        int J, K;
        int aux;
        for (J = 1; J < vector.length; J++){
            aux = vector[J];
            K = J - 1;
            while ((K >= 0) && (aux < vector[K])){
                vector[K + 1] = vector[K];
                K--;
            }
            vector[K + 1] = aux;
        }
        for (int i = 0; i < T; i++){
            System.out.println(vector[i]);
        }
    }
}
