package br.com.brincandocompalavras.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma palavra para inverter: ");
        String palavra = scanner.nextLine();
        System.out.println(inverterPalavra(palavra));
    }

    private static String inverterPalavra(String palavra) {
        char[] letras = palavra.toCharArray();
        StringBuilder palavraInvertida = new StringBuilder();
        for (int i = letras.length - 1; i >= 0; i--) {
            palavraInvertida.append(letras[i]);
        }
        return palavraInvertida.toString();
    }
}
