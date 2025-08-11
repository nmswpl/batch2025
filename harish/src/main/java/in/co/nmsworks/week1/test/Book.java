package in.co.nmsworks.week1.test;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int noOfCopies;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void setNoOfCopies(int noOfCopies){
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies(){
        return noOfCopies;
    }

}
