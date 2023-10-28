package pct;
public class main {

    public static void main(String[] args) {
        int cont;
       
        System.out.println("Esse programa mostra numeros de 3 em 3 na casa do 500 até 200 em ordem DESC ");
        System.out.println("============================ \n");
       
        for(cont = 500; cont > 300;){
            System.out.println("Número:" +cont);
            cont = cont - 3;
        }
    } 
}
