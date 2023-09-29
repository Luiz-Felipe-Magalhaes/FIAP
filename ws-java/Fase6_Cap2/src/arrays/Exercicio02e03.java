package arrays;

import java.util.Scanner;

public class Exercicio02e03 {

    public static void main(String[] args) {

//        double temperatura[] = new double[24];
//        double somaTemperatura = 0;
//        double temperaturaMedia = 0;
//
//        Scanner scn = new Scanner(System.in);
//
//        for(int i = 0; i < temperatura.length; i++) {
//            System.out.printf("Digite a temperatura marcada as %dh00min: ", i);
//            temperatura[i] = scn.nextDouble();
//
//            somaTemperatura += temperatura[i];
//            temperaturaMedia = somaTemperatura/temperatura.length;
//        }
//
//        System.out.printf("A temperatura media foi de: %.2fºC",temperaturaMedia);

        double temperatura[][] = new double[30][24];
        double somaTemperatura = 0;
        double temperaturaMedia = 0;
        double maiorTemperatura = 0;
        double menorTemperatura = 100;

        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < temperatura.length; i++) {
            System.out.printf("----------DIA %d----------\n", i+1);
            for (int c = 0; c < temperatura[i].length; c++) {
                System.out.printf("Temperatura registrada as %dh00min: ", c);
                temperatura[i][c] = scn.nextDouble();

                somaTemperatura += temperatura[i][c];

                if (temperatura[i][c] > maiorTemperatura) {
                    maiorTemperatura = temperatura[i][c];
                }

                if (temperatura[i][c] < menorTemperatura) {
                    menorTemperatura = temperatura[i][c];
                }
            }
            temperaturaMedia = somaTemperatura / (temperatura.length * temperatura[0].length);
        }

        System.out.printf("\nMaior temperatura: %.2fºC",maiorTemperatura);
        System.out.printf("\nMenor temperatura: %.2fºC",menorTemperatura);
        System.out.printf("\nTemperatura media: %.2fºC",temperaturaMedia);
    }
}
