package in.co.nmsworks.week1.test;

public class Book {
    String title;
    String author;
    int publicationYear;
    int noOfCopies;
    int availbility;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

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

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public void checkOut(){
        int noOfCopies = getNoOfCopies();
        if(noOfCopies > 0){
            System.out.println("Available");
            noOfCopies--;
            System.out.println("Current Availability : " + noOfCopies);
        }
        else {
            System.out.println("Not Available");
        }

    }
}
