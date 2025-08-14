package in.co.nmsworks.week1.test;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book() {

    }

    public Book(String title,String author,int publicationYear) {
          this.title = title;
          this.author = author;
          this.publicationYear = publicationYear;
    }



    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public  void checkOut(int noOfCopies) {

        if(noOfCopies>0)
        {
            noOfCopies= noOfCopies - 1;
            System.out.println("Available");
        }
        else
        {
            System.out.println("Not Available");
        }
    }


}

