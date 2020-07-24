package exercicio0202;

import java.util.Scanner;

public class exercicio0202 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1;
        float nota2;

        System.out.println("Digite a nota 1:");
        nota1 = entrada.nextFloat();
        System.out.println("Digite a nota 2:");
        nota2 = entrada.nextFloat();

        nota1 = ((float) nota1 * 0.4f);
        System.out.println("Nota 1 =" + nota1);
        nota2 = ((float) nota2 * 0.6f);
        System.out.println("Nota 2 =" + nota2);

        float media;
        media = nota1 + nota2;

        if (media >= 6) {
            System.out.println("Aluno APROVADO com nota" + media);
        } else {
            System.out.println("Aluno REPROVADO com nota" + media);
        }
        entrada.close();
    }
}