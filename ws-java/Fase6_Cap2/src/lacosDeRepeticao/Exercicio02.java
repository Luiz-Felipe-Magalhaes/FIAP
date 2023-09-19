package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        int valorMultiplicação;
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int valorUsuario = scn.nextInt();

        System.out.printf("A tabuada de 0 a 12, para %d é: \n", valorUsuario);

       for (int i = 0; i <= 12; i++) {
           valorMultiplicação = valorUsuario * i;

           System.out.printf("%d x %d = %d\n", valorUsuario, i, valorMultiplicação);
       }
    }
}
