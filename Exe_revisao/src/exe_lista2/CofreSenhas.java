package exe_lista2;

import java.util.ArrayList;

public class CofreSenhas {
    private String senhaMestre;
    private boolean aberto;
    private String senhaArmazenada; // apenas uma senha

    // Construtor vazio
    public CofreSenhas() {
        this.senhaMestre = "1234";
        this.aberto = false;
        this.senhaArmazenada = "";
    }

    // Construtor com parâmetros
    public CofreSenhas(String senhaMestre, boolean aberto) {
        this.senhaMestre = senhaMestre;
        this.aberto = aberto;
        this.senhaArmazenada = "";
    }

    // Getters
    public String getSenhaMestre() {
        return senhaMestre;
    }

    public boolean isAberto() {
        return aberto;
    }

    // Setters
    public void setSenhaMestre(String novaSenha) {
        if (aberto) {
            this.senhaMestre = novaSenha;
            System.out.println("Senha mestre alterada com sucesso!");
        } else {
            System.out.println("Cofre fechado! Não é possível alterar a senha mestre.");
        }
    }

    // Métodos
    public void abrir(String senha) {
        if (senha.equals(this.senhaMestre)) {
            aberto = true;
            System.out.println("Cofre aberto!");
        } else {
            System.out.println("Senha incorreta! Cofre permanece fechado.");
        }
    }

    public void fechar() {
        aberto = false;
        System.out.println("Cofre fechado!");
    }

    public void armazenarSenha(String s) {
        if (aberto) {
            this.senhaArmazenada = s;
            System.out.println("Senha armazenada com sucesso!");
        } else {
            System.out.println("Cofre fechado! Não é possível armazenar senha.");
        }
    }

    public void mostrarSenha() {
        if (aberto) {
            if (senhaArmazenada.isEmpty()) {
                System.out.println("Não há senha armazenada.");
            } else {
                System.out.println("Senha armazenada: " + senhaArmazenada);
            }
        } else {
            System.out.println("Cofre fechado! Não é possível mostrar a senha.");
        }
    }

    public void apagarSenha() {
        if (aberto) {
            senhaArmazenada = "";
            System.out.println("Senha apagada com sucesso!");
        } else {
            System.out.println("Cofre fechado! Não é possível apagar a senha.");
        }
    }
}
