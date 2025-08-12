package in.co.nmsworks.week1.test;

public class Runner {
    public static void main(String[] args) {

        Book tenthBook = new Book();
        tenthBook.setAuthor("Tngoverment");
        tenthBook.setTitle("Physice");
        tenthBook.setPublicationYear(2019);
        tenthBook.setNoOfCopies(100);
        tenthBook.checkOut();

        Book eleventhBook = new Book();
        eleventhBook.setAuthor("Tngoverment");
        eleventhBook.setTitle("Tamil");
        eleventhBook.setPublicationYear(2020);
        eleventhBook.setNoOfCopies(100);
        eleventhBook.checkOut();


    }
}
