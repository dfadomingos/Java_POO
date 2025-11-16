package exerc3;

public class TelevisaoSmart extends Equipamento implements Conectado {

    public TelevisaoSmart(String nome) {
        super(nome);
    }

    @Override
    public void ligar() {
        System.out.println("A TV está ligando...");
    }

    @Override
    public void conectarWifi() {
        System.out.println("TV conectada ao Wi-Fi.");
    }
}

