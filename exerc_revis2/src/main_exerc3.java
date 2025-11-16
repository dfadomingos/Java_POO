import exerc3.Conectado;
import exerc3.Equipamento;
import exerc3.GeladeiraSmart;
import exerc3.TelevisaoSmart;

import java.util.ArrayList;

public class main_exerc3 {
    public static void main(String[] args) {

        ArrayList<Equipamento> lista = new ArrayList<>();

        lista.add(new TelevisaoSmart("Smart TV Samsung"));
        lista.add(new GeladeiraSmart("Geladeira LG"));

        System.out.println("--- Ligando Equipamentos ---");
        for (Equipamento eq : lista) {
            eq.exibirNome();
            eq.ligar();
            System.out.println();
        }

        System.out.println("--- Conectando ao Wi-Fi ---");
        for (Equipamento eq : lista) {

            // Conexão via interface
            if (eq instanceof Conectado) {
                ((Conectado) eq).conectarWifi();
            }
        }
    }
}

