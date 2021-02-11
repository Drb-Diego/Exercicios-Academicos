package atividade.encapsulamento;
import java.util.Scanner;
/**
 *
 * @author Diego Brito
 */
public class AtividadeEncapsulamento {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
        String nomeBanco;
        String agencia;
        String numeroConta;
        String nomeTitular;
        char tipoConta;
        float valor = 0;
        int op;
        int i = 0;
        
        //ENTRADA DOS DADOS
        System.out.println("DIGITE O NOME DO SEU BANCO");
        nomeBanco = sc.nextLine();
        
        System.out.println("DIGITE A SUA AGENCIA; COM DIGITO");
        agencia = sc.nextLine();
        
        System.out.println("DIGITE O NUMERO DA CONTA");
        numeroConta = sc.nextLine();
        
        System.out.println("DIGITE O SEU NOME COMPLETO");
        nomeTitular = sc.nextLine();
        
        System.out.println("DIGITE: c = CONTA CORRENTE ou p = CONTA POUPANÇA");
        tipoConta = sc.next().charAt(0);
        
       
        //CRIANDO OBJ
        ContaBanco c1 = new ContaBanco (nomeBanco, agencia, numeroConta, nomeTitular, tipoConta);
      
        
        //MENU DAS OPERAÇÕES  
        while (i == 0){
            
            System.out.println("SALDO ATUAL: " + c1.getSaldo());
            System.out.println("DIGITE: 1 = SAQUE, 2 = DEPOSITO");
            op = sc.nextInt();
            
            if (op == 1){
                System.out.println("DIGITE O VALOR QUE DESEJA SACAR");
                valor = sc.nextFloat();

                c1.sacar(valor);
                
                System.out.println("DIGITE: 0 = PARA FAZER NOVAMENTE, 1 = SAIR");
                i= sc.nextInt();
            }
            
            
            else if (op == 2){
                System.out.println("DIGITE O VALOR QUE DESEJA DEPOSITAR");
                valor = sc.nextFloat();

                c1.deposito(valor);
                
                
                
                System.out.println("DIGITE: 0 = PARA FAZER NOVAMENTE, 1 = SAIR");
                i= sc.nextInt();
           }    
        
    }    
        
        
        
        
        
        
    }
    /*
        Analisar a classe ContaBanco (da atividade anterior) e alterar o acesso aos atributos criados. Implementar os métodos get() e set() para estes atributos, mas somente nos casos convenientes.
        Ainda na classe ContaBanco, criar um construtor com os parâmetros (na ordem): nome do banco, número da agência, número da conta, nome do titular e tipo da conta.
        Dentro do construtor, alterar o saldo inicial para 0 e o limite de saque para 500.
        Na classe AppMain, criar objetos do tipo ContaBanco, passando os respectivos parâmetros pedidos pelo construtor.
        Realizar operações de saque e depósito com os objetos criados.
    */
}
