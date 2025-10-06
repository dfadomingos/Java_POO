package exe3Prof;

public abstract class Veiculo {
    protected String nome;

    public Veiculo(String nome){
        this.nome = nome;
    }

    public abstract void mover();

    public String exibirModelo(){
        return nome;
    }
}
