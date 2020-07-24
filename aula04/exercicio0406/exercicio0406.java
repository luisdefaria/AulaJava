package exercicio0406;

import java.util.Scanner;

public class exercicio0406 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palavra;

        System.out.println("Digite a Palavra: ");
        palavra = in.nextLine();
        System.out.println("Vogais:" + contarVogal(palavra));
        in.close();

    }

    static int contarVogal(String word) {
        int contagem = 0;
        String wordLower;

        wordLower=word.toLowerCase();

        for (int i = 0; i <  word.length(); i++) {
            if (wordLower.charAt(i) == 'a' || wordLower.charAt(i) == 'e' 
            || wordLower.charAt(i) == 'i' || wordLower.charAt(i) == 'o'
                    || wordLower.charAt(i)=='u') {
                contagem++;
            }
        }

        return contagem;
    }

}