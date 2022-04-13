import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
//         A prefeitura do Rio de Janeiro abriu uma linha de crédito para os 
// funcionários estatutários. O valor máximo da prestação não poderá 
// ultrapassar 30% do salário bruto. Fazer um algoritmo que leia o salário 
// bruto e o valor da prestação e informar se o empréstimo pode ou não ser 
// concedido

        double salario_bruto, valor_prestacao, valor_max_prestacao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o salário bruto: ");
        salario_bruto = entrada.nextDouble();
        System.out.println("\nInforme o valor da prestaçao: ");
        valor_prestacao = entrada.nextDouble();

        valor_max_prestacao = salario_bruto * 0.3;

        if (valor_prestacao <= valor_max_prestacao){
            System.out.println("\nO impréstimo pode ser concedido");
        } else{
            System.out.println("\nO impréstimo não pode ser concedido");
        }
    }
}
