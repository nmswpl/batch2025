package in.co.nmsworks.week1.test;


public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int noOfCopies;

    public Book(){}

    public Book(String title, String author,int publicationYear,int noOfCopies){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopies = noOfCopies;
    }

    public void setTitle(String Title){
        this.title = title;
    }

    public void setAuthor(String Author){
        this.author = author;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public void setNoOfCopies(int noOfCopies){
        this.noOfCopies = noOfCopies;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getPublicationYear(){
        return this.publicationYear;
    }

    public int getNoOfCopies(){
        return this.noOfCopies;
    }

    public void printDetails(Book book){
        System.out.println("Book Name: " + book.title);
        System.out.println("Book Author: " + book.author);
        System.out.println("Book publication year: " + book.publicationYear);
        System.out.println("Book Copies: " + book.noOfCopies);
    }

    public void checkOut(Book book){
        if(book.noOfCopies == 0){
            System.out.println(book.title + " Book is not available");
        }
        else{
            book.noOfCopies = book.noOfCopies - 1;
            System.out.println(book.title + " book is available");
            System.out.println(book.title + " no. of copies available: " + book.noOfCopies);
        }
    }
}
