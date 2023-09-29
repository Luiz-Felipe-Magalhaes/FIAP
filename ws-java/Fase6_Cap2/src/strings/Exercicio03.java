package strings;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        System.out.println("Palavras repetidas:");

        for (int i = 0; i < palavras.length; i++) {
            String palavraAtual = palavras[i].toLowerCase();

            boolean palavraImpressa = false;
            for (int j = 0; j < i; j++) {
                if (palavraAtual.equals(palavras[j].toLowerCase())) {
                    palavraImpressa = true;
                    break;
                }
            }

            if (!palavraImpressa) {
                for (int k = i + 1; k < palavras.length; k++) {
                    String palavraComparada = palavras[k].toLowerCase();
                    if (palavraAtual.equals(palavraComparada)) {
                        System.out.println(palavraAtual);
                        break;
                    }
                }
            }
        }
    }
}