package in.co.nmsworks.week1.test;

import com.google.protobuf.Enum;

public class Book {
    private String title;
    private String author;
    private int year;
    private int numOfCopies;

    public Book() {
    }

    public Book(String title, String author, int year,int numOFCopies) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.numOfCopies = numOFCopies;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getNumOFCopies() {
        return numOfCopies;
    }
    public void setNumOFCopies(int numOFCopies) {
        this.numOfCopies = numOFCopies;
    }

    public void ckeckOut() {
        if(this.numOfCopies > 0) {
            System.out.println("Available Book: " + this.numOfCopies);
            this.numOfCopies--;
        }
        else {
            System.out.println("Not Available");
        }
    }
}
