package prova;

public class Pintura extends ObrasArte{
    private String tecnica;

    public Pintura(){
        super();
    }

    public Pintura(String titulo, String artista, String tecnica) {
        super(titulo, artista);
        this.tecnica = tecnica;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    @Override
    public String toString() {
        return "Pintura{" +
                super.toString() +
                '}';
    }

    @Override
    public String descrever() {
        return "Pintura feita com a técnica " + this.tecnica;
    }
}
