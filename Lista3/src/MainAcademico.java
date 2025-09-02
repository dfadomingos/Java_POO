import exe0.Departamento;
import exe0.Professor;

public class MainAcademico {
    public static void main(String[] args){
        Departamento depobj1 =
        new Departamento("Análise e Desenvolvimento de Sistemas", "ADS");

        Professor profobj1 =
        new Professor("Jaqueline", "Doutora", depobj1);

        Professor profobj2 = new Professor();
        profobj2.setNome("Carlão");
        profobj2.setTitulacao("Mestre");
        profobj2.setDepartamento(depobj1);

        System.out.println(depobj1.toString());
        System.out.println(profobj1.toString());
        System.out.println(profobj2.toString());

    }
}