package in.co.nmsworks.weeks.day4;

import in.co.nmsworks.weeks.day4.Movie;

import java.util.Arrays;

public class MovieArray {
    public static void main(String[] args) {

        Movie[] movie = {
                new Movie("Enthiran", 2010, "Sci-Fi"),
                new Movie("Kabali", 2016, "Action"),
                new Movie("Superstar", 2002, "Drama"),
                new Movie("Baasha", 1995, "Action"),
                new Movie("Muthu", 1995, "Drama"),
                new Movie("Sivaji: The Boss", 2007, "Action"),
                new Movie("Petta", 2019, "Action"),
                new Movie("Thalapathi", 1991, "Drama"),
                new Movie("Shivaji", 2007, "Action"),
                new Movie("Kaala", 2018, "Drama")
        };

        System.out.println("Total number of movies: " + movie.length);
        System.out.println("Movies released before 2001:");
        for (Movie m : movie) {
            if (m.yearOfRelease < 2001) {
                System.out.println(" " + m.name);
            }
        }
        System.out.println("First movie: " + movie[0].name + movie[0].yearOfRelease + ", " + movie[0].genre );
        System.out.println("Last movie: " + movie[movie.length - 1].name + movie[movie.length - 1].yearOfRelease + movie[movie.length - 1].genre);

        System.out.println("Last movie: " + movie[movie.length - 1].name +
                movie[movie.length - 1].yearOfRelease
                + movie[movie.length - 1].genre );

        System.out.println("Unsorted Movie Array:");
        System.out.println(Arrays.toString(movie));

        Arrays.sort(movie);

        System.out.println("\nSorted Movie Array by year of release:");
        System.out.println(Arrays.toString(movie));

    }
}

