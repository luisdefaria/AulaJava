package exercicio0402;

import java.util.Scanner;

public class exercicio0402 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String[] nomes;
        final int qtdNomes=7;

        nomes=new String[qtdNomes];

        for (int i=0;i<qtdNomes;i++){
            System.out.println("Digite o nome da Pessoa"+(i+1));
            nomes[i]=in.nextLine();
        }


        for (int i=nomes.length-1; i>=0; i--){
            System.out.println("Nome:"+nomes[i]);
        }
        in.close();
    }
}