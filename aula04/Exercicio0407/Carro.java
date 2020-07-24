package Exercicio0407;

public class Carro {
 //Atributos
 String modelo,marca;
 double consumo;

//Metodo Constutor
Carro(String modelo, String marca, double consumo){
    this.modelo=modelo;
    this.marca=marca;
    this.consumo=consumo;
}

//Metodo Exibir Dados

String exibirDados(){
    
    return (marca.toUpperCase()+" "+modelo);
}

String exibirConsumo(){
    return (modelo+" - Consumo: "+consumo+"Km/l\n");
}

}