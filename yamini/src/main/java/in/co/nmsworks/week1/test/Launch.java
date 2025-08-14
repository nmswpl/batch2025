package in.co.nmsworks.week1.test;

public class Launch {
    public static void main(String[] args) {
        Book book=new Book("Life of Pi","Yann Martel",2001,23);
        Book sewell=new Book("Black Beauty","Anna Sewell",1946,0);
        checkout(book);
        checkout(sewell);
    }

    public static void  checkout(Book book){
        boolean isAvailable=false;
         if(book.getNoOfCopies()>0){
             isAvailable =true;
             System.out.println(book.getNoOfCopies()-1);
         }if(!isAvailable){
            System.out.println("Not Available");
        }

    }
}
