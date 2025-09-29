package prova;

public class Instalacao extends ObrasArte{
    private boolean interativa;

    public Instalacao(){
        super();
    }

    public Instalacao(String titulo, String artista, boolean interativa) {
        super(titulo, artista);
        this.interativa = interativa;
    }

    public boolean isInterativa() {
        return interativa;
    }

    public void setInterativa(boolean interativa) {
        this.interativa = interativa;
    }

    @Override
    public String toString() {
        return "Instalação " + super.toString();
    }

    @Override
    public String descrever() {
        return this.interativa ? "Instalação interativa" : "Intalação não interativa";
    }
}
