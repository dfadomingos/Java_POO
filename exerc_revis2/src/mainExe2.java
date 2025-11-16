import exerc2.Email;
import exerc2.Notificacao;
import exerc2.Sms;

import java.util.ArrayList;
import java.util.List;

public class mainExe2 {
    public static void main(String[] args) {
        List<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new Sms());

        String[] mensagens = {"notificacao1", "msg2"};

        for (int i = 0; i < notificacoes.size(); i++) {
            notificacoes.get(i).enviar(mensagens[i]);
        }
    }
}
