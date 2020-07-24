package exercicio0208;

import java.util.Scanner;

public class exercicio0208 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float a,b,c;
        
        System.out.println("Digite o tamanho do lado 'A': ");
        a=entrada.nextFloat();
        System.out.println("Digite o tamanho do lado 'B'");
        b=entrada.nextFloat();
        System.out.println("Digite o tamanho do lado 'C'");
        c=entrada.nextFloat();

        if ((a > b+c)||(b > a+c) || (c > b+a)){
            System.out.println("Isso nao forma um triangulo...");
        }else{
            if ((a==b)&&(b==c)){
                System.out.println("Triangulo Equilatero!");
            }else{
                if ((a==b)||(b==c)||(a==c)){
                    System.out.println("Triangulo Isosceles!");
                }else{ System.out.println("Triangulo Escaleno!"); }
             }
        }

        entrada.close();
    
    }

}