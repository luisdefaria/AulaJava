package exercicio0401;

import java.util.Scanner;

public class exercicio0401 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] notas;
        int qtdAcimaMedia=0;
        double mediaTurma=0;
        final int qtdAluno=10;

        notas=new int[qtdAluno];

        for (int i=0;i<notas.length;i++){
            System.out.println("Digite a Nota do Aluno ["+(i+1)+"]");
            notas[i]=in.nextInt();
            mediaTurma=mediaTurma+notas[i];
        }

        mediaTurma=(((double)mediaTurma/qtdAluno));

        

        for (int i=0;i<notas.length;i++){
            System.out.println("Aluno ["+(i+1)+"] = "+notas[i]);
            if (notas[i]>=mediaTurma){
                qtdAcimaMedia++;
            }
        }

        

        System.out.printf("\nMedia da Turma = %.2f",mediaTurma);
        System.out.printf("\nQuantidade de Notas acima da Media: %d",qtdAcimaMedia);

        in.close();      


    }
}