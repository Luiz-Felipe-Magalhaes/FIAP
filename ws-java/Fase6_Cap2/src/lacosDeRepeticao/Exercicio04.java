package lacosDeRepeticao;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        double salario;
        String nome;
        double somaSalario = 0;
        double mediaSalario;
        int qtdPessoas = 0;
        char opcaoContinuar = 'N';

        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Informe o nome: ");
            nome = scn.nextLine();

            System.out.println("Informe o salario:");
            salario = scn.nextDouble();

            somaSalario += salario;
            qtdPessoas++;

            mediaSalario = somaSalario/qtdPessoas;

            System.out.println("Deseja continuar? S/N");
            opcaoContinuar = scn.next().toUpperCase().charAt(0);

            scn.nextLine();

        } while (opcaoContinuar == 'S');

        System.out.printf("Quantidade de pessoas: %d\nMédia de salarios: R$%.2f", qtdPessoas, mediaSalario);
    }
}
