import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

    //   Construa um algoritmo que leia 4 valores referentes a nota de um aluno, e a 
    // sua quantidade de faltas. Se ele faltou 16 ou mais aulas, está 
    // automaticamente reprovado por faltas. Caso contrário, esse aluno está 
    // aprovado se sua média for maior ou igual a 6. Se essa média for menor que 
    // 6, solicitar a nota do exame e recalcule a média do aluno (somar as duas 
    // notas e dividí-la).Caso tenha uma nova média maior ou igual a 5, ele está 
    // aprovado em exame. Se não, está reprovado por nota

    double nota_1, nota_2, nota_3, nota_4, nota_exame;
    double media, media_com_exame;
    int numero_faltas;
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o número de faltas: ");
    numero_faltas = entrada.nextInt();

    if (numero_faltas >= 16) {
        System.out.println("\nEste aluno está reprovado por faltas\n");
    } else {
        System.out.println("\nDigite a nota 1: ");
        nota_1 = entrada.nextDouble();
        System.out.println("\nDigite a nota 2: ");
        nota_2 = entrada.nextDouble();
        System.out.println("\nDigite a nota 3: ");
        nota_3 = entrada.nextDouble();
        System.out.println("\nDigite a nota 4: ");
        nota_4 = entrada.nextDouble();

        media = (nota_1 + nota_2 + nota_3 + nota_4) / 4;

        if (media >= 6) {
            System.out.println("\nMedia: " + "(" + nota_1  + " + " + nota_2 + " + " + nota_3 + " + " + nota_4 + ")" + " ÷ " + "2" + " = " + media );
            System.out.println("Este aluno está aprovado!\n");
        } else if (media < 6) {
            System.out.println("\nMedia: " + "(" + nota_1  + " + " + nota_2 + " + " + nota_3 + " + " + nota_4 + ")" + " ÷ " + "2" + " = " + media );
            System.out.println("\nEste aluno nao está aprovado e realizou o exame!");
            System.out.println("\nInsira a nota do exame: ");
            nota_exame = entrada.nextDouble();

            media_com_exame = (media + nota_exame) / 2;

            if (media_com_exame >= 5) {
                System.out.println("\nMedia com exame: " + "(" + media + " + " + nota_exame + ")" + " ÷ " + "2" +  " = "   +  media_com_exame);
                System.out.println("Este aluno está aprovado em exame!\n");
            } else {
                System.out.println("\nMedia com exame: " + "(" + media + " + " + nota_exame + ")" + " ÷ " + "2" +  " = "   +  media_com_exame);
                System.out.println("Este aluno está reprovado por nota\n");
            }
        }
        
    }

    }
}
