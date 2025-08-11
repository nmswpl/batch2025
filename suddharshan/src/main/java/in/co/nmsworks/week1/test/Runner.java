package in.co.nmsworks.week1.test;

public class Runner {
    public static void main(String[] args) {
        Book English = new Book("English","Peter",2008,5);
        Book Maths = new Book("Maths","Eistein", 2012, 2);
        Book Social = new Book("Science", "Rutherford", 2000, 6);

        English.printDetails(English);
        Maths.printDetails(Maths);
        Social.printDetails(Social);

        English.checkOut();
        Maths.checkOut();
        Social.checkOut();

        Maths.checkOut();
        Maths.checkOut();

    }
}
