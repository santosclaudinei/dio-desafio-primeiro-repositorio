package one.digitalinnovationone;

public class Main {

    public static void main(String[] args) {

        /*Chamará a classe da Calculadora para que use seus
        métodos passando os números como parâmetros.*/

        Calculadora.soma(6, 5);
        Calculadora.subtracao(7, 3.5);
        Calculadora.multiplicacao(6, 8);
        Calculadora.divisao(10, 2.5);
        System.out.println();

        /* Chamará a classe Mensagem e retornará uma mensagem
        de acordo com a hora passada via parametro. */
        Mensagem.retornaMensagem(9);
        Mensagem.retornaMensagem(12);
        Mensagem.retornaMensagem(18);
        Mensagem.retornaMensagem(0);
        System.out.println();



        Emprestimo.calcular(400, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(400, Emprestimo.getTresParcelas());
        Emprestimo.calcular(400, 5);

    }

}
