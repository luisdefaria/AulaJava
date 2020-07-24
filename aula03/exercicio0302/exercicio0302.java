package exercicio0302;

import java.util.Scanner;

public class exercicio0302 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor;
        int cont;
       
        System.out.println("Digite o Valor: ");
        valor=Integer.parseInt(in.nextLine());
        System.out.println("###TABUADA DO "+valor);

        cont = 0;
        while (cont <=10){
            System.out.println(valor + " x " + cont + " = "+(valor*cont));
            cont++;
        }
        
        in.close();
        



    }
    
}