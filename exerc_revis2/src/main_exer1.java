import exerc1.Animal;
import exerc1.Leao;
import exerc1.Macaco;

import java.util.ArrayList;

public class main_exer1 {
    public static void main(String[] args) {

        Leao leao1 = new Leao("leao1", 80);
        Macaco macaco1 = new Macaco("macaco1", 50);

        ArrayList<Animal> lista = new ArrayList<>();

        lista.add(leao1);
        lista.add(macaco1);

        for (Animal animal : lista) {
            System.out.println(animal.toString());
        }
    }
}

