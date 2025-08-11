package in.co.nmsworks.week1.test;

public class Book {
    private String title;
    private  String author;
    private int year;
    private int noOfCopies;

    public Book(){

    }

    public  Book(String title,String author,int year,int noOfCopies){
        this.title=title;
        this.author=author;
        this.year=year;
        this.noOfCopies=noOfCopies;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setYear(int year){
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }
}
