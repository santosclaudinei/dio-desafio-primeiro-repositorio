package one.digitalinnovationone;

public class Main {

    public static void main(String[] args) {

        double areaQuadrado = Quadrilatero.area(6);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(7, 8);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 5, 5);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }

}