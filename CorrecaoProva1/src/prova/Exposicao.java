package prova;

import java.util.ArrayList;
import java.util.List;

public class Exposicao {
    private String nome;
    private List<ObrasArte> obras;

    public Exposicao(){
        obras = new ArrayList<ObrasArte>();
    }

    public Exposicao(String nome) {
        this.nome = nome;
        this.obras = new ArrayList<ObrasArte>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addObras(ObrasArte obra){
        obras.add(obra);
    }

    public void removeObra(String titulo){
        for (ObrasArte obra : this.obras){
            if(obra.getTitulo().equals(titulo)){
                obras.remove(obra);
                return;
            }
        }
        System.out.println("Obra não encontrada");
    }

    public String toString(){
        return "Exposição: " + this.nome + this.obras.toString();
    }

    public String resumo(){
        return "Nome " + this.nome + "qtde de obras " + this.obras.size();
    }

}
