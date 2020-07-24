package exercicio0207;

import java.util.Scanner;

public class exercicio0207 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario;

        System.out.println("Digite o Salario:");
        salario = entrada.nextFloat();

        if (salario <= 600) {
            System.out.println("Isento de Desconto");
        } else {
            if (salario <= 1200) {
                System.out.println("Desconto de 20%: " + (salario * 0.2));
            } else {
                if (salario <= 2000) {
                    System.out.println("DEsconto de 25%: " + (salario * 0.25));
                } else {
                    System.out.println("Desconto de 30%: " + (salario * 0.3));
                }
            }
        }
        entrada.close();

    }
}