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
    
}
