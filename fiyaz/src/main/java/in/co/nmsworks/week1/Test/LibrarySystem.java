
package in.co.nmsworks.week1.Test;


public class LibrarySystem {

    private String title;
    private String author;
    private int publicationyear;
    private int count;


    public LibrarySystem(String title, String author, int publicationyear, int count) {
        this.title = title;
        this.author = author;
        this.publicationyear = publicationyear;
        this.count = count;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public int getPublicationyear() {
        return publicationyear;
    }

    public void setPublicationyear(int publicationyear) {
        this.publicationyear = publicationyear;
    }
}
