package in.co.nmsworks.week1.test;

public class Book
{
    private String tittle;
    private  String author;
    private  int publicationYear;

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    private int noOfCopies;

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


    public Book()
    {
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Book(String tittle, String author, int publicationYear)
    {
        this.author=author;
        this.tittle=tittle;
        this.publicationYear=publicationYear;

    }

    public static void checkOut()
    {

    }


}

