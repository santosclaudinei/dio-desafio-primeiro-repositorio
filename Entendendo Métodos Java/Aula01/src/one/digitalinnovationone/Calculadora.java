package one.digitalinnovationone;

public class Calculadora {

    public static void soma(double numero1, double numero2){

        double resultado = numero1 + numero2;

        System.out.println("O resultado da soma entre " + numero1 + " e " + numero2 + " é " + resultado);

    }

    public static void subtracao(double numero1, double numero2){

        double resultado = numero1 - numero2;

        System.out.println("O resultado da subtração entre " + numero1 + " e " + numero2 + " é " + resultado);

    }

    public static void multiplicacao(double numero1, double numero2){

        double resultado = numero1 * numero2;

        System.out.println("O resultado da multiplicação entre " + numero1 + " e " + numero2 + " é " + resultado);

    }

    public static void divisao(double numero1, double numero2){

        double resultado = numero1 / numero2;

        System.out.println("O resultado da divisão entre " + numero1 + " e " + numero2 + " é " + resultado);

    }

}
