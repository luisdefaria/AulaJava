package Exercicio0501.Aplicativo;

import Exercicio0501.Placar;

public class AppPlacar {
  public static void main(String[] args) {
      Placar placar1 = new Placar();
      Placar placar2 = new Placar("Brasil","Alemanha");
      Placar placar3 = new Placar("Brasil","Alemanha",1,7);

      System.out.println(placar1.exibirPlacar());
      System.out.println(placar2.exibirPlacar());
      System.out.println(placar3.exibirPlacar());
  }  
}