package exe2_prof;

public class MainCbProf {
    public static void main(String[] args){
        //objeto com construtor vazio
        ContaBancariaProf conta1 = new ContaBancariaProf();
        //criando objeto com construtor completo
        ContaBancariaProf conta2 = new ContaBancariaProf("Lazaro", "12345-6", 0, true);

        conta2.desativar();
        conta2.ativar();
        conta2.depositar(1000);
        conta2.sacar(600);
        conta2.exibe();

        ContaBancariaProf conta3 = new ContaBancariaProf("João", "123456", 500, true);
    }
}
