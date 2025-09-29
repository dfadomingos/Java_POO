package prova;

public class ObrasArte {
    protected String titulo, artista;

    public ObrasArte() {
    }

    public ObrasArte(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "\nObrasArte{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' + this.descrever() +
                '}';
    }

    public String descrever(){
        return "Ainda não sei qual obra de arte eu sou";
    }
}
