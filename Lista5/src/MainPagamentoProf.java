import exe2Prof.CartaoCredito;
import exe2Prof.Pagamento;
import exe2Prof.Pix;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPagamentoProf {
    public static void main(String[] args) {

        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        Pagamento cartaoCredito = new CartaoCredito();
        Pagamento pix1 = new Pix();
        Pagamento pix2 = new Pix();
        Pagamento cartaoCredito1 = new CartaoCredito();

        pagamentos.add(cartaoCredito);
        pagamentos.add(pix1);
        pagamentos.add(pix2);
        pagamentos.add(cartaoCredito1);

        Scanner sc = new Scanner(System.in);
        for (Pagamento p : pagamentos){
            System.out.println("Informe o valor da autorização: ");
            p.autorizar(sc.nextDouble());
        }

    }
}
