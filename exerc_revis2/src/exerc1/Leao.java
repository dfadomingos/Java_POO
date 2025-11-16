package exerc1;

public class Leao extends Animal {

    public Leao(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("O leão ruge!");
    }
}

