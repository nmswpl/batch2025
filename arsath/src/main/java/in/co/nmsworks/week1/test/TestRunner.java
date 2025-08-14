package in.co.nmsworks.week1.test;

public class TestRunner {
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

        warAndPeace.checkOut();
        toKillAMockingBird.checkOut();
        //toKillAMockingBird.checkOut();


    }

}
