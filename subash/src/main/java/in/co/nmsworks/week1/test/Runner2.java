package in.co.nmsworks.week1.test;

public class Runner2 {

    public static void main(String[] args) {

        Book harrypotter=new Book();
        harrypotter.setTitle("Harry potter");
        harrypotter.setAuthor("JK Rowlings");
        harrypotter.setPublicationyear(2004);
//        harrypotter.setNoofcopies(4);

        Book twistedlove=new Book();
        twistedlove.setTitle("Twisted Love");
        twistedlove.setAuthor("Emilya");
        twistedlove.setPublicationyear(2001);
//        twistedlove.setNoofcopies(4);

        Book graveyard=new Book();
        graveyard.setTitle("Graveyard");
        graveyard.setAuthor("Crary");
        graveyard.setPublicationyear(2003);
        graveyard.setNoofcopies(4);
        graveyard.checkoutBooks();
        graveyard.checkoutBooks();
        graveyard.checkoutBooks();
        graveyard.checkoutBooks();
        graveyard.checkoutBooks();

    }

}
