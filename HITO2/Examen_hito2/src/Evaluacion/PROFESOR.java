package Evaluacion;

public class PROFESOR extends PERSONA{
    int CARGHORAR;
    String CIUDAD;
    int NROMATERIAS;
    String[] MATERIAS;
    PERSONA PER1 = new PERSONA();

    public PROFESOR(){

    }

    public String getCIUDAD() {
        return this.CIUDAD;
    }

    public String[] getMATERIAS() {
        return this.MATERIAS;
    }

    public int getNROMATERIAS() {
        return this.NROMATERIAS;
    }

    public void LEER(){
        PER1.LEER();
        System.out.println("INGRESE CARGA HORARIA DE PROFESOR:");
        CARGHORAR = LEER.nextInt();
        System.out.println("INGRESE CIUDAD DE PROFESOR: ");
        CIUDAD = LEER.nextLine();
        MATERIAS = new String[NROMATERIAS];
        for(int i=0;i<NROMATERIAS;i++){
            System.out.println("CIUDAD "+(i+1)+" DE PROFESOR");
            MATERIAS[i] = LEER.next();
        }
    }

    public void Mostrar() {
        PER1.Mostrar();
        System.out.println("CARGA HORARIA: " + CARGHORAR);
        for(int i=0;i<NROMATERIAS;i++){
            System.out.println("MATERIAS "+(i+1)+": " +MATERIAS[i]);
        }
    }

}
