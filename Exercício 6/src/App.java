import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Faça um algoritmo para realizar as operações matemáticas de soma, 
        // subtração, divisão, multiplicação e resto. O algoritmo deve ler dois 
        // operandos e o sinal correspondente à operação desejada, no final deve ser 
        // impresso o resultado.

        double numero_1, numero_2;
        double adicao, subtracao, multiplicacao, divisao;
        char operacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número 1:");
        numero_1 = entrada.nextDouble();
        System.out.println("\nDigite a opçao de operaçao:");
        System.out.println("Adiçao: + | subtraçao: - | multiplicaçao: * | divisao: /");
        operacao = entrada.next().charAt(0);
        System.out.println("\nDigite o número 2:");
        numero_2 = entrada.nextDouble();

        if (operacao == '+') {
            adicao = numero_1 + numero_2;
            System.out.println("\n" + numero_1 + " " + operacao + " " + numero_2 + " = " + adicao + "\n");
        } else if (operacao == '-') {
            subtracao = numero_1 - numero_2;
            System.out.println("\n" + numero_1 + " " + operacao + " " + numero_2 + " = " + subtracao + "\n");
        } else if (operacao == '*') {
            multiplicacao = numero_1 * numero_2;
            System.out.println("\n" + numero_1 + " " + operacao + " " + numero_2 + " = " + multiplicacao + "\n");
        } else if (operacao == '/') {
            divisao = numero_1 / numero_2;
            System.out.println("\n" + numero_1 + " " + operacao + " " + numero_2 + " = " + divisao + "\n");
        } else {
            System.out.println("\nOpcao de operacao inválida!");
            System.out.println("Execute o programa novamente e escolha a opcao da forma correta\n");
        }


    }
}