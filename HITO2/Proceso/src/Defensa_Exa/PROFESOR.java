package Defensa_Exa;

public class PROFESOR extends PERSONA{
    private int CarHoraria;
    public String Ciudad;
    private int NROMATERIAS;
    public String[] MATERIAS;

    public PROFESOR(){
        super();
        this.CarHoraria = 0;
        this.Ciudad = "";
        this.NROMATERIAS = 0;
    }

    public void LEER(){
        super.LEER();
        System.out.println("CARGA HORARIA: ");
        this.CarHoraria = LEER.nextInt();
        System.out.println("CIUDAD :");
        this.Ciudad = LEER.next();
        System.out.println("NRO MATERIAS: ");
        this.NROMATERIAS = LEER.nextInt();
        this.MATERIAS = new String[this.NROMATERIAS];
        for (int i = 0; i < this.NROMATERIAS; i++){
            System.out.println("INGRESE MATERIA: ");
            this.MATERIAS[i] = LEER.next();
        }
    }

    public void MOSTRAR(){
        super.MOSTRAR();
        System.out.printf("CARGHORARIA: %d, CIUDAD: %s, NROMATERIAS: %d \n", this.CarHoraria, this.Ciudad, this.NROMATERIAS);
        for (int J = 0; J < this.NROMATERIAS; J++){
            System.out.printf("MATERIA: %d = %s \n",(J + 1),this.MATERIAS[J]);
        }
    }

    public void MATERIAS_IG(){
    }
//    public String CiuDestino(String[] D){
//        String R = "";
//        for (int i = 0; i < D.length; i++){
//            if (this.Ciudad.equals(D[i])){
//                R = "LA CIUDAD SI PERTENECE AL DESTINO";
//            }
//            else {
//                R = "LA CIUDAD NO PERTENECE AL DESTINO";
//            }
//        }
//    return R;
//    }
}
