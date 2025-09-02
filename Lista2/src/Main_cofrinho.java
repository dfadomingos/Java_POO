import exe1.Cofrinho;

public class Main_cofrinho {
    public static void main(String[] args){
        Cofrinho obj1 = new Cofrinho();

        obj1.depositar(700);

        obj1.fechar();

        obj1.depositar(100);

        obj1.abrir();

        obj1.retirarTudo();

        obj1.fechar();

        obj1.retirarTudo();

        obj1.exibirSaldo();
    }
}