import exe1_prof.CofrinhoProf;

public class Main_cofrinho_prof {
    public static void main(String[] args){
        CofrinhoProf obj1 = new CofrinhoProf(); //chama o construtor sem parametros
        obj1.exibe();
        CofrinhoProf obj2 = new CofrinhoProf(200, true);
        obj2.exibe();
    }
}
