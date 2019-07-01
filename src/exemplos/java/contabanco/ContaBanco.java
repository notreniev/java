package exemplos.java.contabanco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author everton
 */
public class ContaBanco {
    public Integer numConta;
    protected String tipo;
    private String dono;
    private boolean status;
    private float saldo;

    // método especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public ContaBanco(Integer numConta, String tipo, String dono, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.status = status;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }    
    
    //métodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if ("CC".equals(t)){
            this.setSaldo(50f);
        }else if ("CP".equals(t)){
            this.setSaldo(150f);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem saldo.");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechada porque saldo é negativo.");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
    }
    
    public void sacar(float v){
        if (this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())){
            v = 12;
        }else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
}
