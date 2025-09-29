import prova.Escultura;
import prova.Exposicao;
import prova.Instalacao;
import prova.Pintura;

public class Main{
    public static void main(String[] args) {
        Pintura p = new Pintura("Pintura 1", "Artista da pintura", "tecnica da pintura");
        Escultura e = new Escultura("Escultura 1", "Artista da escultura", "material da escultura");
        Instalacao i = new Instalacao("Titulo da instalacao", "Artista da instalação", true);

        Exposicao ex = new Exposicao("Comemoração 30 anos");
        ex.addObras(p);
        ex.addObras(e);
        ex.addObras(i);
        ex.removeObra("Escultura 1");
        System.out.println(ex.toString());

    }
}