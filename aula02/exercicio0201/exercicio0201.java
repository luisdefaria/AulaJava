package exercicio0201;

import java.util.Scanner;

public class exercicio0201 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero;

        System.out.println("Digite um numero:");
        numero = entrada.nextFloat();
        if (numero > 20){
            System.out.println("A metade ele é "+(numero/2));
        }
        entrada.close();

    }
}