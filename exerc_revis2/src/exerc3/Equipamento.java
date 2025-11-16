package exerc3;

public abstract class Equipamento {
    protected String nome;

    public Equipamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato
    public abstract void ligar();

    // Método concreto
    public void exibirNome() {
        System.out.println("Equipamento: " + nome);
    }
}

