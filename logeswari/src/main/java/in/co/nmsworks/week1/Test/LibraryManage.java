package in.co.nmsworks.week1.Test;

public class LibraryManage {


    private  String title;
    private  String author;
    private  int year;

    public LibraryManage(){

    }

    public LibraryManage(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;

    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(){
        return title;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
