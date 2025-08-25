package in.co.nmsworks.week1.test;

public class Book
{
    private String title;
    private String authorName;
    private int publicationYear;
    private int copies;

    public Book()
    {

    }

    public Book(String title , String authorName , int publicationYear , int copies)
    {
        this.title = title;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.copies = copies;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;

    }
    public String getAuthorName(){
        return authorName;

    }

    public void setPublicationyear(int publicationYear){
        this.publicationYear = publicationYear;

    }
    public int getPublicationyear(){

        return publicationYear;
    }

    public void setCopies(int copies){
        this.copies = copies;

    }
    public int getCopies(){

        return copies;
    }

}
