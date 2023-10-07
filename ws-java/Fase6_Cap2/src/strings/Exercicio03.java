package strings;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String frase;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();

        String[] separado = frase.split(" ");

        for (int i = 0; i < separado.length; i++) {
            boolean repetida = false;

            for (int j = i + 1; j < separado.length; j++) {
                if (separado[i].equals(separado[j])) {
                    repetida = true;
                    break;
                }
            }

            if (repetida) {
                System.out.println(separado[i]);
            }
        }
    }
}



