package in.co.nmsworks.week1.test;

public class Book {
    private String title;
    private String author;
    private int publicationyear;
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
    public void setPublicationyear(int publicationyear)
    {
        this.publicationyear=publicationyear;
    }
    public int getPublicationyear()
    {
        return publicationyear;
    }
}
