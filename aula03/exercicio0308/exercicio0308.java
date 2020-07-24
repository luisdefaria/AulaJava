package exercicio0308;

public class exercicio0308 {
    public static void main(String[] args) {
        int a,i;
        a=10;
        i=0;

        System.out.println("a="+a+" | i="+i);

        while (i < 3){
           
            a = a+i;
            i++;
            System.out.println("a="+a+" | i="+i);
        }

        System.out.println(a);

    }
    
}