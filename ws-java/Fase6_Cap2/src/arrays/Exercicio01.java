package arrays;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {

        int numeros[] = new int[15];

        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);

            System.out.printf("Posição [%d] = %d\n",(i + 1), numeros[i]);
        }

    }
}
