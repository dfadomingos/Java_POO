import exe_lista2.CofreSenhas;

public class MainCofreSenhas_lista2 {
    public static void main(String[] args) {

        // Cofre com construtor vazio
        CofreSenhas cofre1 = new CofreSenhas();
        System.out.println("Cofre1 criado com construtor vazio.");

        // Cofre com construtor completo
        CofreSenhas cofre2 = new CofreSenhas("4321", true);
        System.out.println("Cofre2 criado com construtor completo.");

        // Tentando abrir com senha correta
        cofre1.abrir("1234");

        // Armazenando e mostrando senha
        cofre1.armazenarSenha("senhaEmail");
        cofre1.mostrarSenha();

        // Apagando senha
        cofre1.apagarSenha();
        cofre1.mostrarSenha();

        // Fechando cofre e tentando armazenar/mostrar senha
        cofre1.fechar();
        cofre1.armazenarSenha("senhaBanco");
        cofre1.mostrarSenha();

        // Tentando alterar senha mestre
        cofre1.setSenhaMestre("5678"); // não vai funcionar pois está fechado

        // Abrindo novamente e alterando senha mestre
        cofre1.abrir("1234"); // senha antiga
        cofre1.setSenhaMestre("5678"); // agora funciona
    }
}

