package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        int valorUsuario = 0;
        int somaValores = 0;

        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite um numero inteiro:");
            valorUsuario = scn.nextInt();
            somaValores += valorUsuario;
        }

        System.out.printf("Soma dos valores: %d", somaValores);
    }

}
