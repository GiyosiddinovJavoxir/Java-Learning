import java.util.ArrayList;

public class Member {
    private int id;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String borrow(Book book) {
        if(borrowedBooks.size()>3){
            return "Sizda 3 ta dan Ortiq Kitib Mavjud Boshqa Band qila olmaysiz";
        }
        if(book.isAvailable()){
            book.setAvailable(false);
            return "Kitob Band Qilindi!";
        }
        else {
            return "Kitob Alalqachon Band Qilingan!";
        }
    }

    public void Return(Book book){
        book.setAvailable(true);
        borrowedBooks.remove(book);
        System.out.println("Kitob Ro'yhatdan O'chirildi!");
    }
}
