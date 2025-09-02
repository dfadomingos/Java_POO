package exe1_prof;

public class CofrinhoProf {
    private double saldo;
    private boolean fechado;

    //construtor vazio
    public CofrinhoProf(){
        this.saldo = 0;
        this.fechado = false;
    }

    public CofrinhoProf(double saldo, boolean fechado){
        this.setSaldo(saldo);
        this.fechado = fechado;
    }
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        }
        else{
            System.out.println("Saldo inválido");
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
    public boolean getFechado(){
        return this.fechado;
    }

    public void abrir(){
        if(this.fechado){
            this.fechado = false;
        }
        else{
            System.out.println("Cofrinho já está aberto");
        }
    }
    public void fechar(){
        if(!this.fechado){
            this.fechado = true;
        }
        else{
            System.out.println("Cofrinho já está fechado");
        }
    }

    public void depositar (double valor){
        if (!this.fechado && valor > 0){
            this.setSaldo(this.saldo + valor);
        }
        else{
            System.out.println("Depósito inválido!");
        }
    }

    public void retirarTudo(){
        if (!this.fechado && this.saldo > 0){
            double aux = this.saldo;
            this.setSaldo(0);
            System.out.println("Valor retirado " + this.saldo);
        }
        else{
            System.out.println("Não foi possível zerar o cofrinho");
        }
    }

    public void exibe(){
        System.out.println("Saldo: " + this.getSaldo() + "\nFechado: " + (this.fechado ? "Sim": "Não"));
    }
}
