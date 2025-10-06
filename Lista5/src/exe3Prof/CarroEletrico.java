package exe3Prof;

public class CarroEletrico extends Veiculo implements Eletrico{

    public CarroEletrico(String modelo){
        super(modelo);
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando bateria...");
    }

    @Override
    public void mover() {
        System.out.println("Movendo carro elétrico...");
    }
}
