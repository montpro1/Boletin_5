
package boletin_5;


public class Conta {
    private String nome;
    private String numeroConta;
    private double saldo;

    public Conta() {
    }

    public Conta(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean reintegro(){
        if(saldo>0){
            System.out.println("novo saldo "+(saldo-=this.saldo));
            return true;
        
        }else if(saldo<0){
            
        }
        return false;
    }
        public void ingreso(){
            System.out.println("novo saldo "+(saldo+=this.saldo));
        }
        public void transferencia(Conta destino, double abono) {
        if (abono>0){
        reintegro(abono);
        destino.setSaldo(destino.getSaldo() + abono);
        }
        else
        System.out.println("Tes que poñer unha cantidade positiva");
    }
          public void Amosar() {
        System.out.println("Nombre del cliente " + nome + "\nO número da conta é " + numeroConta + "\nO saldo e " + saldo);
    }

    void reintegro(double abono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void ingreso(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }
    
    
    
    
    
    
    
    
    

