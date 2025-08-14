package in.co.nmsworks.week1.test;

public class Books {

    private String title, author, publicationYear;
    private int numberOfCopies;

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void checkOut(){
        if (numberOfCopies > 0 ){
            System.out.println("Available");
            numberOfCopies--;
        }
        else {
            System.out.println("Unavailable");
        }
    }

}
