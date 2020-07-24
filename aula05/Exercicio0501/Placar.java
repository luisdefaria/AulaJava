//Exercicio SOBRECARGA
package Exercicio0501;

public class Placar {
    public String time1,time2;
    public  int golsTime1,golsTime2;

    //Metodo Construtor
    public Placar(){
        time1="Time da Casa";
        time2="Visitante";
    }

    public Placar(String time1, String time2){
        this.time1=time1;
        this.time2=time2;

    }

    public Placar(String time1, String time2, int golsTime1, int golsTime2){
        this.time1=time1;
        this.time2=time2;
        this.golsTime1=golsTime1;
        this.golsTime2=golsTime2;
    }

    //Metodo Exibir
    public String exibirPlacar(){
        return (time1+" "+golsTime1+" X "+golsTime2+" "+time2);
    }
       


    
}