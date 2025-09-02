import exe1.Lampada;

import java.util.Scanner;

public class Main_lampada {
    public static void main(String[] args) {
        Lampada obj1 = new Lampada();
        obj1.marca = "Philips";
        obj1.cor = "branca";
        obj1.ligada = false;
        obj1.brilho = 0;

        System.out.println("Lâmpada 1");
        obj1.exibe();

        obj1.ligar();
        obj1.ajustarBrilho(80);
        obj1.mudarCor("azul");
        System.out.println("\nDepois de ligar, ajustar brilho e mudar cor:");
        obj1.exibe();

        obj1.desligar();
        System.out.println("\nDepois de desligar:");
        obj1.exibe();

        Lampada obj2 = new Lampada();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a marca da lâmpada: ");
        obj2.marca = entrada.nextLine();
        System.out.println("Digite o cor da lâmpada: ");
        obj2.cor = entrada.nextLine();
        System.out.println("Lâmpada ligada(true/false): ");
        obj2.ligada = entrada.nextBoolean();
        System.out.println("Digite o brilho da lâmpada: ");
        obj2.brilho = entrada.nextInt();

        obj2.exibe();

        // Testando
        obj2.desligar();
        System.out.println("\nDepois de desligar:");
        obj2.exibe();

        obj2.ligar();
        obj2.ajustarBrilho(30);
        obj2.mudarCor("verde");
        System.out.println("\nDepois de ligar, ajustar brilho e mudar cor:");
        obj2.exibe();
    }
}