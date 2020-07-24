package exercicio0211;

import java.util.Scanner;

public class exercicio0211 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia;

        System.out.println("Digite o Dia da Semana (1-7): ");
        dia = in.nextInt();

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia Útil");
                break;
            case 6:
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Dia Invalido: " + dia);

        }

        in.close();
        
    }

}