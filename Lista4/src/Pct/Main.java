package Pct;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println ("Faça um algoritmo que leia a largura e altura \n"
                + "de uma parede , calcule e mostre a área a ser pintada\n"
                + "e a quantidade de tinta necessária para serviço, sabendo \n"
                + "que cada litro de tinta pinta de uma área \n"
                + "de 2 metros quadrados.\n"
                + "Uma lata de tinta tem 18 litros, verifique SE vai ser \n"
                + "necessário mais de uma lata de tinta\n\n");
        
        System.out.println ("===================== INICIO ===================");
        
        // criação do objeto Scanner e para arredondamento
        DecimalFormat frmt = new DecimalFormat("#0.00");
        DecimalFormat lata = new DecimalFormat("#0");
        
        // criação de variável
        double l, a, area, qt,lt;
        
        // solicitação para usuário digitar um numero
        System.out.print (" Digite a altura da parede:");
        a = obj.nextDouble();
        
        System.out.print (" Digite a largura da parede:");
        l = obj.nextDouble();
        
        area = l*a;
        qt = area/2;
        lt= qt/18;

        System.out.println (" RESULTADO:\n "
                + "- AREA TOTAL: "+frmt.format(area)
                + "- LATAS DE 18 LITROS NECESSÁRIAS: "+lata.format(lt)+ "\n");
        
        System.out.println ("================= FIM DA EXECUÇÃO ==============");
    } 
}