import exe2_prof.CafeteiraProf;

public class Main_cafeteira_prof {
    public static void main(String[] args){
        CafeteiraProf obj1 = new CafeteiraProf();
        obj1.adicionarAgua(1000);
        obj1.adicionarCafe(60);
        obj1.exibe();
        obj1.prepararCafe();
        obj1.ligar();
        obj1.prepararCafe();
        obj1.exibe();
        obj1.quantosCafesPossiveis();
    }
}
