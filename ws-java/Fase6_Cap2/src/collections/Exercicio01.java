package collections;

import java.util.ArrayList;

public class Exercicio01 {

    public static void main(String[] args) {

        ArrayList listaStrings = new ArrayList();

        listaStrings.add("Metodo add, adiciona um objeto numa determinada posição;");
        listaStrings.add("Adicionando outro objeto;");
        listaStrings.add("String adicionada;");
        listaStrings.add("Metodo add, adiciona um objeto numa determinada posição;");

        System.out.println(listaStrings);

        listaStrings.remove(1);

        System.out.println(listaStrings.get(1));

        listaStrings.set(1, "Adiciona outro objeto, na posição que eu quiser;");

        System.out.println(listaStrings);

       int posicaoString = listaStrings.indexOf("Adiciona outro objeto, na posição que eu quiser;");

        System.out.println(posicaoString);

        int ultimaPosicao = listaStrings.lastIndexOf("Metodo add, adiciona um objeto numa determinada posição;");

        System.out.println(ultimaPosicao);

        System.out.println(listaStrings.subList(1,3));

        String [] amigos = {"José", "Carla", "Flavio", "Ana"};
        String amigos4 = amigos[3];

        System.out.println(amigos4);


    }



}
