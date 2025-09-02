package exe2;
import java.util.Scanner;

public class MainConta {
    public static void main(String[] args){

        //conta 1
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Ana";
        conta1.numero = "12345678";
        conta1.saldo = 3000.0;
        conta1.ativa = true;

        System.out.println("Conta 1: ");
        conta1.exibe();

        //conta 2
        ContaBancaria conta2 = new ContaBancaria("Domingos", "87654321", 4000.0, true);

        System.out.println("\nConta 2: ");
        conta2.exibe();

        //realizando transaçoes
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigte o valor que será depositado na Conta 1:  ");
        conta1.depositar(Double.parseDouble(sc.nextLine()));

        System.out.println("\nDigte o valor que será sacado da Conta 1:  ");
        conta1.sacar(Double.parseDouble(sc.nextLine()));

        System.out.println("\nDigte o valor que será transferido da Conta 1 para a Conta 2:  ");
        conta1.transferir(conta2, Double.parseDouble(sc.nextLine()));

        //exibindo estado das contas no final
        System.out.println("\nContas ao final: ");
        conta1.exibe();
        System.out.println("\n");
        conta2.exibe();
    }
}
