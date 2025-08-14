/*6. Library System:
You are building a library management system. Each book in the library has a title, author, and a publication year. Write a class Book and create objects for different books with these attributes.

Book should also have Number Of Copies as an attribute. Write a method checkout which checks the No of Copies and If available reduces the count and prints available. If not availabe, should print book unavailable*/
package in.co.nmsworks.week1.test;

public class Book{

    String title;
    String author;
    int publicationYear;
    int noOfCopies;

    public void checkout(){

    }
}



public class LibrarySystem{
    public static void main(String[] args) {

        Book java = new Book();

        Book python = new Book();

    }

}
