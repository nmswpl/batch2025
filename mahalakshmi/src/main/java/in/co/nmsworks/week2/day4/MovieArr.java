package in.co.nmsworks.week2.day4;

import java.util.Arrays;

public class MovieArr {

    public static void main(String[] args) {
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Enthiran", 2010, "Sci-fi");
        movies[1] = new Movie("Kabali", 2016, "Action");
        movies[2] = new Movie("Superstar", 2002, "Drama");
        movies[3] = new Movie("Baasha", 1995, "Action");
        movies[4] = new Movie("Muthu", 1995, "Drama");
        movies[5] = new Movie("Sivaji:The Boss", 2007, "Action");
        movies[6] = new Movie("Petta", 2019, "Action");
        movies[7] = new Movie("Thalapathi", 1991, "Drama");
        movies[8] = new Movie("Shivaji", 2007, "Action");
        movies[9] = new Movie("Kaala", 2018, "Drama");

        System.out.println("Length: " + movies.length);
        System.out.println("First element: " + movies[0].toString());
        System.out.println("Last element: " + movies[movies.length - 1].toString());
        for (Movie m : movies) {
            if (m.getYearOfRelease() < 2000) {
                System.out.println(m.getName());
            }
        }
        System.out.println("Unsorted Array");
        for(Movie m : movies) {
            System.out.println(m.toString());
        }

        System.out.println();
        Arrays.sort(movies);
        System.out.println("Sorted Array");
        for(Movie m : movies) {
            System.out.println(m.toString());
        }

    }
}
