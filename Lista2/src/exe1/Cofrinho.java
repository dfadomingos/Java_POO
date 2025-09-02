package exe1;

public class Cofrinho {
    private double saldo;
    private boolean fechado;

    //construtor vazio
    public Cofrinho(){
        //valores padrao
        this.saldo = 0.0;
        this.fechado = false;
    }

    //construtor com parametros
    public Cofrinho(double saldo, boolean fechado){
        this.setSaldo(saldo);
        this.fechado = fechado;
    }

    //set para saldo
    public void setSaldo(double saldo){
        if(saldo >= 0){
            this.saldo = saldo;
        } else{
            System.out.println("Não permitido saldo negativo!");
        }
    }

    //get verificar estado cofrinho
    public boolean isFechado(){
        return fechado;
    }

    //metodos abrir e fechar
    public void abrir(){
        this.fechado = false;
        System.out.println("O cofrinho foi aberto");
    }
    public void fechar(){
        this.fechado = true;
        System.out.println("O cofrinho foi fechado");
    }

    //metodo para depositar
    public void depositar(double valor){
        if(!this.fechado && this.saldo >= 0){
            this.setSaldo(this.saldo + valor);
            System.out.println("Foi depositado o valor: " + valor + ", saldo atual: " + saldo);
        } else if (this.fechado) {
            System.out.println("Cofrinho fechado, não possível depositar");
        } else{
            System.out.println("Valor inválido");
        }
    }

    //metodo retirar saldo
    public void retirarTudo(){
        if (!this.fechado) {
            System.out.println("Valor retirado " + saldo);
            this.saldo = 0;
        } else {
            System.out.println("Não é possível retirar, cofrinho está fechado");
        }
    }

    //get para exibir saldo
    public void exibirSaldo(){
        System.out.println("Saldo atual:" + this.saldo);
    }


}
