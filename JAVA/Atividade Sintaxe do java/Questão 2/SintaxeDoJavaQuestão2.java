/*
  @author Diego Brito

*/
import java.util.Scanner;
public class SintaxeDoJavaQuestão2 {
    public static void main(String[] args) {
        
        int i = 0;
        Scanner sc = new Scanner(System.in);
       
           
        while (i == 0){
            
            System.out.println("Você vai passar em ds1 ?");
            String op = sc.nextLine();
            if ("s".equals(op)){
                System.out.println("QUE BOM !");
                i++;
            }
            else if("n".equals(op)){
                System.out.println("Acredite em você !");
                i++;
            } 
            else if (!"s".equals(op) || !"n".equals(op)){
                System.out.println("Digite 's' ou 'n' ");
                i=0;
                System.out.println("\n");
            }  
        } 
    }
  
  /*
    Escreva um programa que pergunte “Você vai passar em DS1?”, sendo duas opções possíveis: S e N. 
    Caso o usuário digite S, mostre uma mensagem positiva. Caso o usuário digite N, mostre uma mensagem de incentivo. 
    O programa deve continuar pedindo para o usuário digitar até que ele coloque S ou N.

  */
    
}
