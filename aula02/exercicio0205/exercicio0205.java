package exercicio0205;

import java.util.Scanner;

public class exercicio0205 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String chave;

        System.out.println("Digite a Senha: ");
        chave=entrada.nextLine();

        if (chave.equals("R10p5")){
            System.out.println("Acesso Concedido!");
        }else{
            System.out.println("Acesso Negado...");
        }
        entrada.close();
    }
}