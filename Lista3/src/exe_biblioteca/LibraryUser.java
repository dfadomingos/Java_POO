package exe_biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private String name;
    private List<LoanItem> loans;

    public LibraryUser() {
        this.loans = new ArrayList<LoanItem>();
    }

    public LibraryUser(String name) {
        this.name = name;
        this.loans = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<LoanItem> getLoans() {
        return loans;
    }

    public void addLoan(Book book, int days){
        this.loans.add(new LoanItem(book, days));
        System.out.println("Livro adicionado com sucesso");
    }

    public void removeLoanBookTitle(String title) {
        boolean removed = loans.removeIf(loan -> loan.getBook().getTitle().equals(title));
        if (removed) {
            System.out.println("Empréstimo removido com sucesso!");
        } else {
            System.out.println("Livro não encontrado nos empréstimos.");
        }
    }

    public void clearLoans(){
        loans.clear();
        System.out.println("Empréstimos removidos!");
    }

    public void isEmpty(){
        if(loans.isEmpty()){
            System.out.println("O usuário não possui empréstimos");
        }
        else System.out.println("O usuário possui empréstimos");
    }

    public void totalDaysBorrowed(){
        int somaDias = 0;
        for(LoanItem loanItem : loans){
            somaDias += loanItem.getDays();
        }
        System.out.println("Total de dias = " + somaDias);
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "name='" + name + '\'' +
                ", loans=" + loans +
                '}';
    }


}
