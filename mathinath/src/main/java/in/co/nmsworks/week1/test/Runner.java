package in.co.nmsworks.week1.test;

public class Runner {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.setTitle("harrypotter");
        b1.setAuthor("mathi");
        b1.setPublicationYear(2000);
        b1.setNoOfBooks(4);
        b1.checkOut();
        b1.checkOut();
        b1.checkOut();
        b1.checkOut();
        b1.checkOut();
    }
}
