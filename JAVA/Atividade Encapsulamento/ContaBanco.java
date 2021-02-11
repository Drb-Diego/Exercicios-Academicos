package atividade.encapsulamento;
/**
 *
 * @author Diego Brito
 */
public class ContaBanco {
 
      private String nomeBanco;
   private String agencia;
   private String numeroConta;
   private  String nomeTitular;
   private char tipoConta;
   private float saldo;
   private float limite = 500;

    public ContaBanco(String nomeBanco, String agencia, String numeroConta, String nomeTitular, char tipoConta) {
        this.nomeBanco = nomeBanco;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        
        if (tipoConta == 'c'){
             this.tipoConta = tipoConta;
        }
        
        else if (tipoConta == 'p'){
            this.tipoConta = tipoConta;
        }
    }

    

 
    // Função pra deposito  
    void deposito (float valor){
        
        if (valor > 0){
            
            this.saldo += valor;
        }
    }
    
    
    // Função para saque
    void sacar (float valor) {
        
        if (valor <= saldo && valor <= limite){
           
            this.saldo -= valor;
        }
    }
    
    
    //Para imprimir o Saldo
    public float getSaldo() {
        return this.saldo;
    }

    //Troca de conta
    public void setTipoConta(char tipoConta) {
        this.tipoConta = tipoConta;
    }
    


}
