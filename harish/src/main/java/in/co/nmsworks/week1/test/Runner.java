package in.co.nmsworks.week1.test;

public class Runner {
    public static void main(String[] args) {

        Book tenthBook = new Book();
        tenthBook.setAuthor("Tngoverment");
        tenthBook.setTitle("Physice");
        tenthBook.setPublicationYear(2019);
        tenthBook.setNoOfCopies(100);
        checkOut(tenthBook);

        Book eleventhBook = new Book();
        eleventhBook.setAuthor("Tngoverment");
        eleventhBook.setTitle("Tamil");
        eleventhBook.setPublicationYear(2020);
        eleventhBook.setNoOfCopies(100);
        checkOut(eleventhBook);


    }

    public static void checkOut(Book bookname){
        int numberOfCopies = bookname.getNoOfCopies() - 1;
        if (numberOfCopies == 0){
            System.out.println("There is no available copies of that book");
        }
        else{
            System.out.println("The Title is "+bookname.getTitle());
            System.out.println("The Author name is "+bookname.getAuthor());
            System.out.println("The Publication year is "+bookname.getPublicationYear());
            System.out.println("The Number of copies are availabel "+numberOfCopies);
            System.out.println("The Author name is "+bookname.getAuthor());
            System.out.println("\n");
        }
    }
}
