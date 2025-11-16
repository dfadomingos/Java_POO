package exerc3;

public class GeladeiraSmart extends Equipamento implements Conectado {

    public GeladeiraSmart(String nome) {
        super(nome);
    }

    @Override
    public void ligar() {
        System.out.println("A geladeira está ligando...");
    }

    @Override
    public void conectarWifi() {
        System.out.println("Geladeira conectada ao Wi-Fi.");
    }
}

