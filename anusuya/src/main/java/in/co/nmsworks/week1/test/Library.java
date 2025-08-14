package in.co.nmsworks.week1.test;

public class Library {

    public static void main(String[] args) {

        Book newBeginnings = new Book();
        newBeginnings.setTitle("New Beginnings");
        newBeginnings.setAuthor("Anusuya");
        newBeginnings.setPublicationYear(2020);
        newBeginnings.setNoOfCopies(0);

        Book thinkingBehind = new Book("Thinking Behind", "Jaysree", 2024, 3);

        printBookDetails(newBeginnings);
        printBookDetails(thinkingBehind);
    }

    public static void printBookDetails(Book book){
        System.out.println(" Title : " + book.getTitle());
        System.out.println(" Author : " + book.getAuthor());
        System.out.println(" Publication Year : " + book.getPublicationYear());
        System.out.println(" Available Copies : " + book.checkOut());
        System.out.println();
    }
}
