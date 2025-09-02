import exe_biblioteca.Book;
import exe_biblioteca.LibraryUser;
import exe_biblioteca.LoanItem;

public class MainLibrary {
    public static void main(String[] args) {
        Book obj1 = new Book("A", "X", 2000);
        Book obj2= new Book("B", "Y", 2020);
        Book obj3 = new Book("C", "Z", 1990);

        LibraryUser objLibraryUser = new LibraryUser("AAA");

        objLibraryUser.addLoan(obj1, 6);
        objLibraryUser.addLoan(obj2, 2);
        objLibraryUser.addLoan(obj3, 8);

        System.out.println(objLibraryUser.toString());

        objLibraryUser.totalDaysBorrowed();

        objLibraryUser.removeLoanBookTitle("B");
        System.out.println(objLibraryUser.toString());

        objLibraryUser.clearLoans();

        objLibraryUser.isEmpty();
    }
}
