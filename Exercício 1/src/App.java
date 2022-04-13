import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Faça um algoritmo que receba a idade de uma pessoa e mostre se ela é
        // maior de idade ou não
         
        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("\nVocê é maior de idade");
        } else {
            System.out.println("\nVocê não é maior de idade");
        }
    }
}
