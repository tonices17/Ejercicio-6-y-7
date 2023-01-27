import java.util.Arrays;

public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int edad,altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(Estudiante estudiante) {
        int resultado = 0;

        if(this.altura < estudiante.altura){
            resultado = 1;
        }
        else if(this.altura > estudiante.altura){
            resultado = -1;
        }
        else{
            if(this.edad < estudiante.edad){
                resultado = 1;
            }
            else if(this.edad > estudiante.edad){
                resultado = -1;
            }
        }
        return resultado;
    }

    public static void main(String[]args){

        Estudiante estudiante1 = new Estudiante("Patri",12,170);
        Estudiante estudiante2 = new Estudiante("Manuel",43,173);
        Estudiante estudiante3 = new Estudiante("Javier",72,189);
        Estudiante estudiante4 = new Estudiante("Alicia",52,168);
        Estudiante estudiante5 = new Estudiante("Alberto",35,189);

        Estudiante arrayEst[] = {estudiante1,estudiante2,estudiante3,estudiante4,estudiante5};

        System.out.println("Estudiantes sin ordenar:");
        for(int i = 0 ; i < arrayEst.length ; i++){
            System.out.println(arrayEst[i].nombre+" - "+arrayEst[i].altura+" - "+arrayEst[i].edad);
        }
        System.out.println("------------------------------");
        Arrays.sort(arrayEst);

        System.out.println("Estudiantes ordenados:");
        for(int i = 0 ; i < arrayEst.length ; i++){
            System.out.println(arrayEst[i].nombre+" - "+arrayEst[i].altura+" - "+arrayEst[i].edad);
        }
    }
}
