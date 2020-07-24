package samples;

import java.util.Scanner;

public class Sample01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanho;

        //int [] valores, numeros; // Ambos sao vetores

        int[] valores;

        tamanho = in.nextInt();

        valores = new int[tamanho];

        for (int i=0;1<valores.length;i++){
            System.out.println("Digite o Valor"+1+i);
            valores[i]=in.nextInt();            
        }

        in.close();


    }

}