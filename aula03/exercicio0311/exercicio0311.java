package exercicio0311;

import java.util.Scanner;

public class exercicio0311 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        float nota1,nota2,mediaAluno,mediaGeral=0;
        final int qtdAluno=5;

        for (int i=1;i<=qtdAluno;i++){
            
            do{
                System.out.printf("Insira a 1ª Nota do aluno %d :",i);
                nota1=Integer.parseInt(in.nextLine());    
            }while ((nota1<0 || nota1>10));    

            do{
                System.out.printf("Insira a 2ª Nota do aluno %d: ",i);
                nota2=Integer.parseInt(in.nextLine());
            }while (nota2<0 || nota2>10);

            mediaAluno=(nota1+nota2)/2;
            mediaGeral=mediaGeral+mediaAluno;
            System.out.printf("### Media Aluno [%d] = %.2f ### \n",i,mediaAluno);
        }

        System.out.printf("\n****** MEDIA GERAL = %.2f ******\n ",((float)mediaGeral/qtdAluno));
        in.close();

    }
    
}