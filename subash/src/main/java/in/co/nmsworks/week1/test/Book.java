package in.co.nmsworks.week1.test;

public class Book
{
    private String title;
    private String author;
    private int publicationyear;
    private int noofcopies;

    public int getNoofcopies() {
        return noofcopies;
    }

    public void setNoofcopies(int noofcopies) {
        this.noofcopies = noofcopies;
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
    public void setPublicationyear(int year)
    {
        this.publicationyear=year;
    }
    public int getPublicationyear()
    {
        return publicationyear;
    }

    public void checkoutBooks()
    {
        if(noofcopies>0) {
            noofcopies--;
            System.out.println("Available");
        }
        else
            System.out.println("Not Available");
    }


}

