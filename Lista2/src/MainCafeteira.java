import exe2.Cafeteira;

public class MainCafeteira {
    public static void main(String[] args){
        Cafeteira obj1 = new Cafeteira();
        obj1.adicionarAgua(1000);
        obj1.adicionarCafe(60);
        obj1.exibe();
        obj1.prepararCafe();
        obj1.ligar();
        obj1.prepararCafe();
        obj1.exibe();
        obj1.cafesPossiveis();

        System.out.println("-".repeat(80));
        Cafeteira obj2 = new Cafeteira();
        obj2.adicionarCafe(300);
        obj2.adicionarAgua(-10);

        System.out.println("-".repeat(80));
        Cafeteira obj3 = new Cafeteira();
        obj3.adicionarAgua(80);
        obj3.adicionarCafe(100);
        obj3.ligar();
        obj3.exibe();
        obj3.prepararCafe();
        obj3.adicionarAgua(300);
        obj3.exibe();
        obj3.cafesPossiveis();
        obj3.prepararCafe();

    }
}
