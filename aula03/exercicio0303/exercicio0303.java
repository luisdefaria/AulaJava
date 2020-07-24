package exercicio0303;

import java.util.Scanner;

public class exercicio0303 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor,cont;

        System.out.println("Digite o valor:" );
        valor=Integer.parseInt(in.nextLine());
       
        cont=1;
        System.out.print(cont);
        cont*=2;
        while(cont <= valor){
            System.out.print(","+cont);
            cont*=2;
        }

        in.close();



    }
    
}