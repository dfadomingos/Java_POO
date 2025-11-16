package exerc2;

public class Email implements Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email: " + mensagem);
    }
}
