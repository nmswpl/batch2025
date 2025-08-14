package in.co.nmsworks.week1.test;

public class Book {
    private String name;
    private String author;
    private int publicationYear;
    private int noOfCopies;

    public String getName() {
        return name;
    }

    public Book(String name, String author, int publicationYear, int noOfCopies) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopies = noOfCopies;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    void checkout(){
        noOfCopies--;
        if(noOfCopies>0){
            System.out.println("Book Available");
        }
        else {
            System.out.println("Book Unavailable");
        }
    }
}
