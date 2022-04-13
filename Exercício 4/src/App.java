import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Entrar com a idade de uma pessoa e informar:
        // Se é maior de idade
        // Se é menor de idade
        // Se é maior de 65 anos
        // Caso a idade digitada for menor ou igual a Zero informar mensagem: 
        // "Idade Invalida!"

        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();

        if (idade >= 18 && idade <= 65){
            System.out.println("\nVocê é maior de idade!");
        } else if (idade < 0 && idade <  18){
            System.out.println("\nVocê é menor de idade!");
        } else if (idade > 65){
            System.out.println("\nVocê tem mais que 65 anos!");
        } else if (idade <= 0) {
            System.out.println("\nIdade Inválida!");
        }
    }
}
