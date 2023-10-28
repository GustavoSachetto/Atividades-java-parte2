package Pct;
import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
             
        int cont = 1;
        String nome, mat;
        String aux = "";       
       
        System.out.println("Esse programa fará a matricula do aluno,pedindo nome do aluno e nome do curso.");
        System.out.println("============================ \n");
           
        while (cont == 1){   
            
            System.out.print("Qual é o nome do aluno que você deseja matricular: " );
            nome = entrada.nextLine();
            
            System.out.print("Qual é o nome do curso que deseja fazer: ");
            mat = entrada.nextLine();
                                
            aux += "O nome do aluno: "+nome+"\nO Curso do aluno: "+mat+"\n\n"; 
            
            System.out.println("Deseja continuar o processo de matricula? (Caso sim digite 1, ao contrario, digite qualquer número)");
            cont = entrada.nextInt();
            
            System.out.println("========================");
        }
        
        System.out.println(aux);        
    }
}
