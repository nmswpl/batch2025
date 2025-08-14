package in.co.nmsworks.week1.test;

public class Runner
{
    public static void main(String[] args) {
        Book db = new Book("DB", "Richard", 2014, 5);
        db.checkOut();
        db.checkOut();
        db.checkOut();
        db.checkOut();
        db.checkOut();
        db.checkOut();
    }
}
