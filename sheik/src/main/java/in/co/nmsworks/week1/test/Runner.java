package in.co.nmsworks.week1.test;

public class Runner
{
    public static void main(String[] args) {
        Book comic = new Book("Charlie" , "Author1" , 2000 , 3);
        Book drama = new Book("Hunter" , "Author2" , 2010 , 2);
        Book horror = new Book("Jungles" , "Author3" , 1909 , 0);

        checkOut(comic);
    }

    public static void checkOut(Book book)
    {
        if(book.getCopies()>0){
            System.out.println("Book Title :" + book.getTitle()
                    + "No of Copies Availabale : " + book.getCopies());
        }
        else{
            System.out.println("The Book is Not available");
        }


    }
}
