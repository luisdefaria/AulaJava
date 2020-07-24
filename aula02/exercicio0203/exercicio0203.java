package exercicio0203;

import java.util.Scanner;

public class exercicio0203 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero1;
        float numero2;

        System.out.println("Digite o numero 1: ");
        numero1=entrada.nextFloat();
        System.out.println("Digite o numero 2: ");
        numero2=entrada.nextFloat();

        if (numero1 >= numero2){
            System.out.println(numero1 + " - " + numero2);
        }else{
            System.out.println(numero2 + " - " + numero1);
        }
        entrada.close();


    }
}