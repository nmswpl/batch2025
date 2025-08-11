package in.co.nmsworks.test;

public class Runner {
    public static void main(String[] args) {
        Book warAndPeace = new Book();
        warAndPeace.setTitle("War and Peace");
        warAndPeace.setAuthor("Leo Tolstoy");
        warAndPeace.setPublicationYear(1600);
        warAndPeace.setNoOfCopies(3);

        Book toKillAMockingBird = new Book();
        toKillAMockingBird.setTitle("To Kill A Mocking Bird");
        toKillAMockingBird.setAuthor("Harper Lee");
        toKillAMockingBird.setPublicationYear(1960);
        toKillAMockingBird.setNoOfCopies(1);

        checkOut(warAndPeace);
        checkOut(toKillAMockingBird);
        checkOut(toKillAMockingBird);


    }

    public static void checkOut(Book b){
        int noOfCopies = b.getNoOfCopies();
        if(noOfCopies!=0){
            System.out.println("Avaialable: " + noOfCopies);
            noOfCopies = noOfCopies-1;
        }
        else{
            System.out.println("Not Available");
        }
        System.out.println("No of copies after the book issued:" + noOfCopies);
    }
}
