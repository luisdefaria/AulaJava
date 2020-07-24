package exercicio0209;

import java.util.Scanner;

public class exercicio0209 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float nota1,nota2,nota3,nota4,media;
        int faltas;

        System.out.println("Digita a 1ª Nota: ");
        nota1=entrada.nextFloat();
        System.out.println("Digita a 2ª Nota: ");
        nota2=entrada.nextFloat();
        System.out.println("Digita a 3ª Nota: ");
        nota3=entrada.nextFloat();
        System.out.println("Digita a 4ª Nota: ");
        nota4=entrada.nextFloat();
        System.out.println("Digita a Quantidade de Faltas: ");
        faltas=entrada.nextInt();
        media=(nota1+nota2+nota3+nota4)/4;

        if (faltas >=16){
            System.out.println("Aluno Reprovado por "+faltas+" faltas");
        }else{
            if(media>=6){
                System.out.println("Aluno Aprovado com media "+media+" e "+faltas+" faltas");
            }else{
                float notaExame,mediaExame;
                System.out.println("Digite a Nota do Exame: ");
                notaExame=entrada.nextFloat();
                mediaExame=(notaExame+media)/2;
                if (mediaExame >=5){
                    System.out.println("Aluno Aprovado no Exame com nota: "+mediaExame+" e "+faltas+" faltas");
                }else{System.out.println("Aluno Reprovado no Exame com nota: "+mediaExame+" e "+faltas+" faltas");}

            }
        }
        entrada.close();
    }
}