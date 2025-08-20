import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library
{
    List<Book> listbooks = new ArrayList<>();
    List<Book> listusers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addBook(){
        System.out.print("Kitob Idisi -> ");
        int id = scanner.nextInt();
        System.out.print("Kitob Nomi -> ");
        String nom = scanner.next();
        System.out.print("Kitob Muallifi -> ");
        String autor = scanner.next();
        System.out.print("Kitob Yili -> ");
        int yil = scanner.nextInt();
        System.out.print("Kitob Boshmi bosh:true,!bosh:false -> ");
        boolean boshmi = scanner.hasNext();
        listbooks.add(new Book(id,nom,autor,yil,boshmi));
    }
    public void addUser(Member user){
        listusers
    }
}
