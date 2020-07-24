package Exercicio0407;

public class AppCarro {
    public static void main(String[] args) {
        Carro carro1= new Carro("Corolla Hybrid", "Toyota", 17.8);
        Carro carro2= new Carro("Golf TSI", "Volkswagem", 13);
        Carro carro3= new Carro("458 Italia", "Ferrari", 5);

        System.out.println(carro1.exibirDados());
        System.out.println(carro1.exibirConsumo());
        System.out.println(carro2.exibirDados());
        System.out.println(carro2.exibirConsumo());
        System.out.println(carro3.exibirDados());
        System.out.println(carro3.exibirConsumo());


    }
    
}