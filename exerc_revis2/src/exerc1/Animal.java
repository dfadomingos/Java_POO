package exerc1;

public abstract class Animal {
    protected String nome;
    protected double peso;

    public Animal() {
    }

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "\nAnimal{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
