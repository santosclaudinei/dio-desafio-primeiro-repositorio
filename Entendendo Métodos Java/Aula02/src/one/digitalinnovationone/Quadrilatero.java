package one.digitalinnovationone;

public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);

    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);

    }

    public static void area(double baseMenor, double baseMaior, double altura) {

        System.out.println("Área do trapézio: " + ((baseMenor + baseMaior) * altura) / 2);

    }

}
