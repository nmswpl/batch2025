package in.co.nmsworks.week1.test;

public class Book {
    String title;
    String author;
    int publictionYear;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublictionYear() {
        return publictionYear;
    }

    public void setPublictionYear(int publictionYear) {
        this.publictionYear = publictionYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publictionYear=" + publictionYear +
                '}';
    }

    public Book() {
        this.title = title;
        this.author = author;
        this.publictionYear = publictionYear;
    }
    public static void checkout(Book book){
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPublictionYear());
    }

    public static void main(String[] args) {
       Book book=new Book();
        book.setAuthor("kavi");
        book.setTitle("psy");
        book.setPublictionYear(15);

    }


}
