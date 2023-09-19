package lacosDeRepeticao;

public class Exercicio03 {
    public static void main(String[] args) {

        int fnAtual = 1;
        int fnAnterior = 0;
        int fn;

        for (int i = 1; i <= 30; i++) {

            System.out.printf("F%d = %d\n",i, fnAtual);
            fn =  fnAtual  + fnAnterior;
            fnAnterior = fnAtual;
            fnAtual = fn;
        }

    }
}
