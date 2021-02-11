import java.util.Scanner;
/*
 
  @author Diego Brito

 */
public class IntroduçãoAOrientaçãoAPOO {
    public static void main(String[] args) {
        
        int i = 0;
        Scanner sc = new Scanner (System.in);
        
        //Instanciando objeto
        ContaBanco conta1 = new ContaBanco();
        
        conta1.nome_banco = "itau";
        conta1.nome_titular = "Diego Ramos Brito";
        conta1.num_agencia = "4277-0";
        conta1.num_conta = "30.999-2";
        conta1.tipo_conta = 'p';
        conta1.saldo =  (float) 1000.00;
        conta1.limite_saque = 100;
        
        conta1.imprimir();
        
        // Menu Para escolha
        while (i==0){
            
            System.out.println("Digite '0' Para sair do programa \nDigite '1' para Sacar \nDigite '2' para Despositar \nDigite '3' para ver os dados da conta novamente");
            int op = sc.nextInt();
            
            if (op == 1){
                System.out.println("*----------------------------------------*");
                System.out.println("Digite o Valor que deseja Sacar: ");
                float valor = sc.nextFloat();
                conta1.saque(valor);
                conta1.imprimir();
                i=0;
                
            }
            
            else if(op == 2){
                System.out.println("*----------------------------------------*");
                        
                System.out.println("Digite o valor que deseha depositar: ");
                float valor = sc.nextFloat();
                conta1.deposito(valor);
                conta1.imprimir();
                i=0;
            }
            
            else if (op ==3){
                System.out.println("*----------------------------------------*");
                conta1.imprimir();
                i=0;
            }
            
            else if (op != 1 || op != 2 || op != 3){
                System.out.println("*----------------------------------------*");
                System.out.println("Operação invalida");
                i ++;
            }
       
    }
        
        
    } 
    
    
    /*
        Criar uma classe ContaBanco com as seguintes informações:

        Atributos (pensem nos tipos de cada atributo)
        - Nome do banco
        - Número da agência
        - Número da conta
        - Nome do titular
        - Tipo (P – Poupança ou C – Corrente)
        - Saldo
        - Limite de saque

        Métodos a serem implementados (pensem nas regras envolvidas para saque e depósito)
        - Sacar (valor)
        - Depositar (valor)
        - Imprimir dados (exibindo os atributos)

        Criar uma classe AppMain com a função main() e:
        - Instanciar um objeto do tipo ContaBanco, definindo valores para os atributos do objeto instanciado
        - Realizar depósitos, saques e uma impressão dos dados a partir do objeto de ContaBanco criado
    */

   
 }
