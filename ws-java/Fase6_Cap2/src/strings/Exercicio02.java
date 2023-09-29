package strings;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        String palavra;
        int caracterInicio = 0;
        int caracterFim;
        boolean palindromo = true;

        char verificaCaracterInicio;
        char verificaCaracterFim;

        Scanner scn = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        palavra = scn.nextLine().toUpperCase().replace(" ","");

        caracterFim = palavra.length() -1;

       while (caracterInicio < caracterFim) {
           verificaCaracterInicio = palavra.charAt(caracterInicio);
           verificaCaracterFim = palavra.charAt(caracterFim);

           if (palavra.charAt(caracterInicio) != palavra.charAt(caracterFim)) {
               palindromo = false;

               break;
           }
           caracterInicio++;
           caracterFim--;


       }
        if (palindromo == false) {
            System.out.println(palavra + " não é um palindromo");
        } else {
            System.out.println(palavra + " é um palindromo");
        }

    }



}
