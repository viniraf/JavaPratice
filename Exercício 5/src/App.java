import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Ler o salário de uma pessoa e imprimir o desconto do INSS segundo a tabela 
        // a seguir:
        // <= R$ 600,00                   | Isento
        // > R$ 600,00 e <= 1200          | 20%
        // > R$ 1200,00 e <= R$ 2000,00   | 25%
        // > R$ 2000,00                   | 30%

        double salario;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        salario = entrada.nextDouble();

        if (salario <= 600){
            System.out.println("\nO desconto de INSS para o salário de R$ " + salario + " é isento");
        } else if (salario > 600 && salario <= 1200){
            System.out.println("\nO desconto de INSS para o salário de R$ " + salario + " é de 20%");
        } else if (salario > 1200 && salario <= 2000){
            System.out.println("\nO desconto de INSS para o salário de R$ " + salario + " é de 25%");
        } else if (salario > 2000){
            System.out.println("\nO desconto de INSS para o salário de R$ " + salario + " é de 30%");
        }
    }
}
