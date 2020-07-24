package exercicio0405;

import java.util.Scanner;

public class exercicio0405 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero1,numero2,numero3,menorValor;


        System.out.println("Digite o valor a");
        numero1=in.nextInt();
        System.out.println("Digite o valor b");
        numero2=in.nextInt();
        System.out.println("Digite o valor c");
        numero3=in.nextInt();

        menorValor=menor(numero1,numero2,numero3);

        System.out.println("Menor valor = "+menorValor);

        in.close();

    }

    static int menor(int n1, int n2, int n3){

        if(n1<=n2 & n1<=n3){
            return n1;
        }else if(n2<=n3){
            return n2;
        }else{
            return n3;
        }


    }
}