package Pct;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        int cont, num, resultado;
        
        System.out.print ("Digite o valor para calculo da tabuada: ");
        num = le.nextInt();
        
        for (cont = 1; cont<=10; cont++){
            resultado = num*cont;
            System.out.println(num +" X "+cont+" = "+resultado);
        }
    }   
}