import java.util.Arrays;
import java.util.Scanner;

public abstract class Forma2 {
    protected int numLados;

    public Forma2(int numLados) {
        this.numLados = numLados;
    }
    public int getNumLados() {
        return numLados;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public static class Rectangulo extends Forma2 implements Redimensionable,Comparable<Rectangulo>{
        private double ancho;
        private double alto;

        public Rectangulo(int numLados, double ancho, double alto) {
            super(numLados);
            this.ancho = ancho;
            this.alto = alto;
        }
        @Override
        public double getArea() {
            return ancho*alto;
        }
        @Override
        public double getPerimeter() {
            return (2*ancho)+(2*alto);
        }

        @Override
        public void redimensionar(int x) {
            ancho = ancho * x;
            alto = alto * x;
        }

        @Override
        public int compareTo(Rectangulo rect) {
            int resultado = 0;

            if(this.getArea() < rect.getArea()){
                resultado = -1;
            }
            else if(this.getArea() > rect.getArea()){
                resultado = 1;
            }
            else{
                return 0;
            }
            return resultado;
        }
    }

    public static class Triangulo extends Forma2 {
        private double ancho;
        private double alto;

        public Triangulo(int numLados, double ancho, double alto) {
            super(numLados);
            this.ancho = ancho;
            this.alto = alto;
        }
        @Override
        public double getArea() {
            return (ancho*alto)/2;
        }
        @Override
        public double getPerimeter() {
            return 3*ancho;
        }
    }

    public static class Main {
        public static void main(String[] args) {

            Rectangulo rect1 = new Rectangulo(4,10,11);
            Rectangulo rect2 = new Rectangulo(4,2,3);
            Rectangulo rect3 = new Rectangulo(4,9,10);
            Rectangulo rect4 = new Rectangulo(4,4,5);
            Rectangulo rect5 = new Rectangulo(4,8,9);
            Rectangulo rect6 = new Rectangulo(4,6,7);
            Rectangulo rect7 = new Rectangulo(4,7,8);
            Rectangulo rect8 = new Rectangulo(4,3,4);
            Rectangulo rect9 = new Rectangulo(4,5,6);
            Rectangulo rect10 = new Rectangulo(4,1,2);

            Rectangulo arrayrect[] = {rect1,rect2,rect3,rect4,rect5,rect6,rect7,rect8,rect9,rect10};

            System.out.println("Estas son las áreas de los elementos del array sin ordenar.");
            for(Rectangulo rect : arrayrect){
                System.out.println(rect.getArea() + " ");
            }

            Arrays.sort(arrayrect);
            System.out.println("-------------------------");

            System.out.println("Estas son las áreas de los elementos del array ordenados.");
            for(Rectangulo rect : arrayrect){
                System.out.println(rect.getArea() + " ");
            }
        }
    }
}
