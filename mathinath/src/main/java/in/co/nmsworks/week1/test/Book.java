package in.co.nmsworks.week1.test;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int noOfBooks;
    public Book()
    {

    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getTitle()
    {
        return title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
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

    public int getNoOfBooks()
    {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public void checkOut()
    {
        if(noOfBooks > 0)
        {
            noOfBooks--;
            System.out.println("Book Available");
        }
        else
        {
            System.out.println("Book Not Available");
        }
    }
}
