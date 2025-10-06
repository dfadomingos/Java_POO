import exe3Prof.CarroEletrico;
import exe3Prof.Eletrico;
import exe3Prof.PatineteEletrico;
import exe3Prof.Veiculo;

import java.util.ArrayList;

public class MainVeiculoProf {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        CarroEletrico ce = new CarroEletrico("carro 1");
        PatineteEletrico pe = new PatineteEletrico("patinete elet 1");

        veiculos.add(ce);
        veiculos.add(pe);

        for (Veiculo v : veiculos){
            System.out.println(v.exibirModelo());
            v.mover();
            //cast é para conversão de tipos primitivos
            //coerção é para conversão de objetos
            Eletrico aux = (Eletrico) v;
            aux.carregarBateria();
        }
    }
}
