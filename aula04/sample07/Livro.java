package sample07;

public class Livro {
    //Atributos
    String titulo, autor;
    int numPaginas;

    //metodos

    //metodo construtor

    Livro(String titulo, String autor, int numPaginas){
        //THIS se refere ao proprio objeto, para diferenciar do parametro
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
    }

    String exibir(){
        return (titulo + ": " + autor + "("+numPaginas+")");
    }
}