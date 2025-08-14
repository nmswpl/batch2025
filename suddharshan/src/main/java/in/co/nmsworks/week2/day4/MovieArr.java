package in.co.nmsworks.week2.day4;

import java.util.Arrays;

public class MovieArr {
    public static void main(String[] args) {
        Movie Enthiran = new Movie("Enthiran",2010, "Sci-Fi");
        Movie Kabali = new Movie("Kabali",2016,	"Action");
        Movie SuperStar = new Movie("Superstar",2002,"Drama");
        Movie Baasha = new Movie("Baasha",1995,"Action");
        Movie Sivaji = new Movie("Sivaji: The Boss",2007,"Action");
        Movie Muthu = new Movie("Muthu",1995,"Drama");
        Movie Petta = new Movie("Petta",2019,"Action");
        Movie Thalapathi = new Movie("Thalapathi",1991,"Drama");
        Movie Shivaji = new Movie("Shivaji",2007,"Action" );
        Movie Kaala = new Movie("Kaala",2018,"Drama");

        Movie movies[] = new Movie[] {Enthiran,Kabali,SuperStar,Baasha,Sivaji,Muthu,Petta,Thalapathi,Shivaji,Kaala};
        System.out.println("Unsorted Array: ");
        for(Movie m:movies){
            System.out.print(m.toString() + " ");
        }
        System.out.println();
        Arrays.sort(movies);
        System.out.println("Sorted Array: ");
        for(Movie m:movies){
            System.out.print(m.toString() + " ");
        }

        System.out.println("Length of Movie Array: " + movies.length);

        System.out.println(movies[0].toString() + "\n" + movies[movies.length-1].toString());

        for(int i = 0; i < movies.length; i++){
            if(movies[i].getYearOfRelease() < 2000){
                System.out.println(movies[i].getName());
            }
        }
    }
}
