package strings;

public class Exercicio01 {

    public static void main(String[] args) {

        String bananada = "BANANADA";

        System.out.println(bananada.substring(1,4));

        System.out.println(bananada.replace("NANA","N"));

        System.out.println("As posições da letra 'A' na palavra 'BANANADA' são: ");
        for (int i = 0; i < bananada.length(); i++) {
            if (bananada.charAt(i) == 'A') {
                System.out.print(i + " ");
            }
        }

    }
}
