package exerc1;

public class Macaco extends Animal {

    public Macaco(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println("O macaco grita!");
    }
}

