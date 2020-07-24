package exercicio0304;

import java.util.Scanner;

public class exercicio0304 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, cont, par, impar;

        cont = 1;
        par = 0;
        impar = 0;
        while (cont <= 10) {
            System.out.print("Digite o Valor[" + cont + "]: ");
            valor = Integer.parseInt(in.nextLine());
            if (valor % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            cont++;
        }
        System.out.println("Quantidade de Numeros Pares: " + par);
        System.out.println("Quantidade de Num Impares: " + impar);

        in.close();

    }

}