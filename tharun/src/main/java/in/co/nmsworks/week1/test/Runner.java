package in.co.nmsworks.week1.test;

public class Runner {
    public static void main(String[] args) {
        Book jjkV1 = new Book("Jujustu kaisen","Gege",2019,3);
        Book jjkV2 = new Book("Jujustu kaisen","Gege",20023,7);
        Book jjkV3 = new Book("Jujustu kaisen","Gege",2025,5);

        jjkV1.checkout();
        jjkV1.checkout();
        jjkV1.checkout();

    }
}
