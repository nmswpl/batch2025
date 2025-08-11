package in.co.nmsworks.week1.test;


public class Runner {

    public static void main(String[] args) {
        Book htmlCss = new Book("HTML and CSS3","John Doe",2010);
        Book coreJava = new Book("Core Java","John",2015);
        Book AdvancedJava = new Book("Advanced Java","Carry",2020);

        htmlCss.checkOut(5);
        coreJava.checkOut(4);
        coreJava.checkOut(0);
    }




}

