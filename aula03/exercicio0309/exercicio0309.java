package exercicio0309;

import java.util.Scanner;

public class exercicio0309 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor=0,positivo=0,soma=0;
        float media=0,porcentagem=0;
        final int qtdValores=10;

        for (int i=1;i<=qtdValores;i++){
            System.out.println("Digite o valor ["+i+"]");
            valor = Integer.parseInt(in.nextLine());
            soma = soma+valor;
            if (valor > 0){
                positivo++;
            }
        }
        media = soma/qtdValores;
        porcentagem = ((float)positivo / qtdValores) * 100;
        System.out.println("A soma é "+soma);
        System.out.println("A media é "+media);
        System.out.println("Quantidade Numeros positivos "+positivo);
        System.out.println("% de Numeros positivos "+(int)porcentagem+"%");

    
        in.close();
    }
    
}