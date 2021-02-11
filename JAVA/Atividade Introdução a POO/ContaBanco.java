/**
 *
 * @author Diego Brito
 */
public class ContaBanco {
   
    String nome_banco;
    String num_agencia;
    String num_conta;
    String nome_titular;
    char tipo_conta;
    float saldo;
    float limite_saque;
    
    //Metodo de Deposito
   public void saque (float valor){    
       if (valor < saldo && valor < limite_saque){
           System.out.println("Saque efetuado");
       }
    } 
   
    // Metodo de Saque
   public void deposito (float valor){
       if (valor > 0){
           saldo += valor;
       }
    }
   
   //Metodo para imprimir os dados 
   public void imprimir (){
       System.out.println("*------------DADOS DA CONTA----------*");
       System.out.println("Nome do Banco: " + nome_banco + "\nNumero Agencia: " + num_agencia + "\nNumero da Conta: " + num_conta + "\nNome do Titular: " + nome_titular + "\nTipo da Conta: " + tipo_conta + 
       "\nSaldo Atual: " + saldo + "\nLimite de Saque atual: " + limite_saque);
       System.out.println("*----------------------------------------*");
    }
    
}
