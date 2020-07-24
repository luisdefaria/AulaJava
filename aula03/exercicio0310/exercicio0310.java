package exercicio0310;

import java.util.Scanner;

public class exercicio0310 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int voto, cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0, branco = 0, nulo = 0, validos = 0;
        final int qtdCandidatos = 10;

        for (int i = 1; i <= qtdCandidatos; i++) {
            System.out.printf("Voto do Eleitor [%d] ", i);
            voto = Integer.parseInt(in.nextLine());
            switch (voto) {
                case 1:
                    cand1++;
                    break;
                case 2:
                    cand2++;
                    break;
                case 3:
                    cand3++;
                    break;
                case 4:
                    cand4++;
                    break;
                case 5:
                    branco++;
                    break;
                case 6:
                    nulo++;
                    break;

            }

        }
        validos = qtdCandidatos - (branco + nulo);
        System.out.println("Candidato [1] teve " + cand1 + " Votos | " + ((double) (cand1) / validos * 100)
                + "% de votos validos");
        System.out.println("Candidato [2] teve " + cand2 + " Votos | " + ((double) (cand2) / validos * 100)
                + "% de votos validos");
        System.out.println("Candidato [3] teve " + cand3 + " Votos | " + ((double) (cand3) / validos * 100)
                + "% de votos validos");
        System.out.println("Candidato [4] teve " + cand4 + " Votos | " + ((double) (cand4) / validos * 100)
                + "% de votos validos");
        System.out.println("Votos em Branco " + branco);
        System.out.println("Votos Nulos " + nulo);
        System.out
                .println("tivemos " + ((double) (nulo + branco) / qtdCandidatos * 100) + "% de votos nulos e brancos");
        in.close();

    }

}