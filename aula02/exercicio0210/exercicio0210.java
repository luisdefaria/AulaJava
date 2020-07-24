package exercicio0210;

import java.util.Scanner;

public class exercicio0210 {
    public static void main(final String[] args) {
        final Scanner inNum = new Scanner(System.in);
        final Scanner inChar = new Scanner(System.in);

        float num1, num2;
        String entrada;
        char operador;

        System.out.println("Digite o Primeiro Valor: ");
        num1 = inNum.nextFloat();
        System.out.println("Digite o Segundo Valor");
        num2 = inNum.nextFloat();
        System.out.println("Agora digite a Operacao Desejada:");
        System.out.println("==> '+' para Adição");
        System.out.println("==> '-' para Subtração");
        System.out.println("==> '*' para Multiplicação");
        System.out.println("==> '/' para Divisão");
        entrada = inChar.nextLine();
        operador = entrada.charAt(0);

        if (operador == '/' && num2 == 0) {
            System.out.println("Impossivel Dividir por Zero, tente novamente...");
        } else {
            switch (operador) {
                case '+':
                    System.out.println("Adição = " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Subtração= " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Multiplicação= " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Divisão= " + (num1 / num2));
                    break;
                default:
                    System.out.println("Operado Invalido: " + operador);

            }

        }

        inNum.close();
        inChar.close();
    }

}