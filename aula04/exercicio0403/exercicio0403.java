package exercicio0403;

import java.util.Random;

public class exercicio0403 {
    public static void main(String[] args) {
    Random random = new Random();
    int[] amostra;
    int[] dado;
    final int qtdAmostras=100;
    final int ladoDados=6;
    int cont=0;

    amostra=new int[qtdAmostras];
    dado=new int[ladoDados];

    for  (int i=0;i<=amostra.length-1;i++){
        amostra[i]=1 + random.nextInt(ladoDados);
        System.out.print("["+amostra[i]+"]-");
    }

    for  (int i=0;i<=dado.length-1;i++){
        dado[i]=i+1;
    }

    for (int i=0;i<=dado.length-1;i++){
        cont=0;
        for  (int j=0;j<=amostra.length-1;j++){
            if (dado[i]==amostra[j]){
                cont++;
            }
        }
        System.out.print("\nVALOR "+dado[i]+" "+cont+"x"+" ("+((double)cont/qtdAmostras*100)+"%)");
    }

    }
}

