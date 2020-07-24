package Exercicio0502;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public int getHora(){
        return hora;
    }

    public void setHora(int hora){
        if (hora <= 24){
            this.hora=hora;
        }
    }

    public int getMinuto(){
        return minuto;
    }

    public void setMinuto(int minuto){
        if (minuto <= 60){
            this.minuto=minuto;
        }
    }

    public int getSegundo(){
        return segundo;
    }

    public void setSegundo(int segundo){
        if (segundo <= 60){
            this.segundo=segundo;
        }
    }



    public Relogio(int hora, int minuto, int segundo){
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String exibirHora(){
        return getHora()+":"+getMinuto()+":"+getSegundo();
    }

    
}