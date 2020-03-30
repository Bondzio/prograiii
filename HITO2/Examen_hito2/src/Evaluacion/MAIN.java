package Evaluacion;

public class MAIN {
    public static void main(String[] args) {
//        POLICIA P1 = new POLICIA();
//        P1.LEER();
//        P1.Mostrar();
//
//        PROFESOR PR1 = new PROFESOR();
//        PR1.LEER();
//        PR1.Mostrar();
//        PROFESOR PR2 = new PROFESOR();
//        PR2.LEER();
//        PR2.Mostrar();

        POLICIA P1 = new POLICIA();
        POLICIA P2 = new POLICIA();
        PROFESOR PR1 = new PROFESOR();
        PROFESOR PR2 = new PROFESOR();
        P1.LEER();
        P1.Mostrar();
        P2.LEER();
        P2.Mostrar();
        PR1.LEER();
        PR1.Mostrar();
        PR2.LEER();
        PR2.Mostrar();
        int C =0;
        for(int i = 0; i < PR1.getNROMATERIAS(); i++){
            for(int j = 0; j < PR1.getNROMATERIAS(); j++){
                if(PR1.getMATERIAS()[i] == PR2.getMATERIAS()[j]){
                    C++;
                }
            }
        }
        boolean verdad = false;
        System.out.println("CANTIDAD DE MATERIAS REPETIDAS: "+ C);
        for(int j = 0; j < P1.getDEST().length; j++){
            if(PR1.getCIUDAD() == P1.getDEST()[j]){
                System.out.println("LA CIUDAD DEL PROFESOR 1 TIENE MISMO DESTINO QUE POLICIA 1 ");
                j = P1.getDEST().length;
            }
            if(PR2.getCIUDAD() == P1.getDEST()[j]){
                System.out.println("lLA CIUDAD DEL PROF 2 TIENE EL MISMO DEST QUE EL POLICIA 1 ");
                j = P1.getDEST().length;
            }
        }
        for(int j = 0; j < P2.getDEST().length; j++){
            if(PR1.getCIUDAD() == P2.getDEST()[j]){
                System.out.println("LA CIUDAD DEL PROFESOR 1 TIENE EL MISMO DESTINO QUE POLICIA 2 ");
                j = P1.getDEST().length;
            }
            if(PR2.getCIUDAD() == P2.getDEST()[j]){
                System.out.println("LA CIUDAD DEL PROFESOR 2 TIENE EL MISMO DESTINO QUE POLICIA 2 ");
                j = P1.getDEST().length;
            }
        }

    }
}
