package arrays;

import java.util.Random;

public class Exercicio04 {

    public static void main(String[] args) {

        double notas[][] = new double[5][20];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nDISCIPLINA %d\n", i+1);
            for (int c = 0; c < notas[i].length; c++) {

                notas[i][c] = random.nextInt(10);
                System.out.printf("Aluno: %d | Nota: %.2f\n", c+1, notas[i][c]);
            }
        }
    }
}
