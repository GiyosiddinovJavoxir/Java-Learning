public class Book {
    private int id;
    private String title;
    private String autor;
    private int year;
    private boolean available;

    public Book(int id, String title, String autor, int year, boolean available) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString(){
        return  id + " - " + title + " (" + autor + ", " + year + ") "+ (available ? "[Available]" : "[Not Available]");
    }

    public void borrowBook(){
        available = false;
    }

    public void returnBook(){
        available = true;
    }

}