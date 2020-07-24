package exercicio0204;

import java.util.Scanner;

public class exercicio0204 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float salarioBruto;
        float valorPrestacao;

        System.out.println("Digite o Salario Bruto:");
        salarioBruto = entrada.nextFloat();
        System.out.println("Digite o Valor da Prestacao:");
        valorPrestacao = entrada.nextFloat();

        if (valorPrestacao <= (salarioBruto*0.3)){
            System.out.println("Emprestimo LIBERADO");
        }else{
            System.out.println("Emprestimo REJEITADO, o valor da prestacao deve ser ate "+(salarioBruto*0.3));
        }
        entrada.close();



    }
}