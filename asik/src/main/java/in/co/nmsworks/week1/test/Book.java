package in.co.nmsworks.week1.test;

public class Book
{
    private String title;
    private String author;
    private int publicationYear;
    private int noOfCopies;

    public Book()
    {}

    public Book(String title, String author, int publicationYear, int noOfCopies)
    {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.noOfCopies = noOfCopies;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return  title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setPublicationYear(int publicationYear)
    {
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear()
    {
        return publicationYear;
    }

    public void setNoOfCopies(int noOfCopies)
    {
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies()
    {
        return noOfCopies;
    }

    public void checkOut()
    {
        if(noOfCopies == 0)
        {
            System.out.println("Book Unavailable");
        }
        else
        {
            System.out.println("Available Number of Copies : " + noOfCopies);
            noOfCopies = noOfCopies - 1;
        }
    }
}
