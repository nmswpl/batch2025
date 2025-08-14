package in.co.nmsworks.week2.day4;


import java.util.Arrays;

public class MovieArray {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Enthiran",2010,"Sci Fi");
        Movie movie2 = new Movie("Kabali",2016,"Action");
        Movie movie3 = new Movie("Superstar",2002,"Drama");
        Movie movie4 = new Movie("Baasha",1995,"Action");
        Movie movie5 = new Movie("Muthu",1995,"Drama");
        Movie movie6 = new Movie("Sivaji: The Boss",2007,"Action");
        Movie movie7 = new Movie("Petta",2019,"Action");
        Movie movie8 = new Movie("Thalapathy",1991,"Drama");
        Movie movie9 = new Movie("Shivaji",2007,"Action");
        Movie movie10 = new Movie("Kaala",2018,"Drama");

        Movie[] movies = new Movie[ ] {movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10};

        System.out.println("Length of movies array: " + movies.length);

        System.out.println();

        System.out.println("First movie: " + movies[0].getName() + " " + movies[0].getYearOfRelease() + "\t" + "Last movie: " + movies[movies.length-1].getName() + " " + movies[movies.length-1].getYearOfRelease());

        System.out.println();

        for(int i=0;i<=movies.length-1;i++){
            if(movies[i].getYearOfRelease()<2000){
                System.out.println(movies[i].getName());
            }
        }

        System.out.println(Arrays.toString(movies));

        Arrays.sort(movies);

        System.out.println(Arrays.toString(movies));




    }
}
