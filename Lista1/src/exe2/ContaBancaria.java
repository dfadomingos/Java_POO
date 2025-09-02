package exe2;

public class ContaBancaria {
    public String titular;
    public String numero;
    public double saldo;
    public boolean ativa;

    //construtor vazio
    public ContaBancaria(){

    }

    //construtor completo
    public ContaBancaria(String titular, String numero, double saldo, boolean ativa){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.ativa = ativa;
    }

    //metodos
    public void exibe(){
        String numMasc = "****" + this.numero.substring(this.numero.length() - 4);
        System.out.println("Titular: " + this.titular + "\nnumero: " + numMasc + "\nSaldo: " + this.saldo +
                "\nAtiva: " + this.ativa);
    }

    public void ativar(){
        if(!this.ativa){
            this.ativa = true;
        }
    }

    public void desativar(){
        if(this.ativa && this.saldo >= 0){
            this.ativa = false;
        } else{
            System.out.println("Não é possível desativar, saldo negativo");
        }
    }

    public void depositar(double valor){
        if (this.ativa && valor >0){
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > 0){
            if(this.ativa && valor <= saldo){
                this.saldo -= valor;
            }
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (this.ativa && destino.ativa) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                destino.saldo += valor;
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        } else {
            System.out.println("Não é possível transferir");
        }
    }


}