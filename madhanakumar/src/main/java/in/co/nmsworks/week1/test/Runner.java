package in.co.nmsworks.week1.test;

public class Runner {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("One Piece");
        b1.setAuthor("Echiro Oda");
        b1.setPublicationYear(1997);
        b1.setNoOfCopies(77);

        Book b2 = new Book();
        b2.setTitle("The Harry Potter");
        b2.setAuthor("J K Rowling");
        b2.setPublicationYear(1972);
        b2.setNoOfCopies(0);

        b1.checkOut();
        b2.checkOut();
    }
}
