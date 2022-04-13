import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Ler um número inteiro e apresentar uma mensagem informando se o
        // número é par ou ímpar. (usar o operador %)
        
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("\nEste número é par");
        } else {
            System.out.println("\nEste número ímpar");
        }
    }
}
