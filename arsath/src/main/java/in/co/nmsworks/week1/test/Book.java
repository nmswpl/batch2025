package in.co.nmsworks.week1.test;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private static int noOfCopies;

    public Book(){

    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
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

    public void checkOut(){
        if(noOfCopies>0){
            noOfCopies = noOfCopies-1;
            System.out.println("Avaialable");
            System.out.println("No of copies after the book issued:" + noOfCopies);
        }
        else{
            System.out.println("Not Available");
        }

    }

}


/* public static void checkOut(){
        /*int noOfCopies = getNoOfCopies();
        if(noOfCopies!=0){
            System.out.println("Avaialable: " + noOfCopies);
            noOfCopies = noOfCopies-1;
        }
        else{
            System.out.println("Not Available");
        }
        System.out.println("No of copies after the book issued:" + noOfCopies);
    }*/