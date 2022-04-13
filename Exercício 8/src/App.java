import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        //   Um comerciante comprou um produto e quer vendê-lo com um lucro de 
        // 45%, se o valor da compra for menor que R$ 20,00; caso contrário, o lucro 
        // será de 30%. Entrar com o valor do produto e imprimir o valor da venda.

        double valor_produto, valor_venda;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valor_produto = entrada.nextDouble();

        if (valor_produto < 20) {
            valor_venda = valor_produto + (valor_produto * 0.45);
            System.out.println("\nO valor de venda para obter 45% de lucro é: R$ " + valor_venda);
        } else {
            valor_venda = valor_produto + (valor_produto * 0.30);
            System.out.println("\nO valor de venda para obter 30% de lucro é: R$ " + valor_venda);
        }
    }
}
