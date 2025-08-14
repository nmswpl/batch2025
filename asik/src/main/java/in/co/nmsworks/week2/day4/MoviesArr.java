package in.co.nmsworks.week2.day4;

import java.util.Arrays;

public class MoviesArr
{
    public static void main(String[] args)
    {

        Movie ethiran = new Movie("Enthiran", 2010, Movie.Genre.SCIFI);
        Movie kabali = new Movie("Kabali", 2016, Movie.Genre.ACTION);
        Movie superstar = new Movie("Superstar", 2002, Movie.Genre.DRAMA);
        Movie baasha = new Movie("Baasha", 1995, Movie.Genre.ACTION);
        Movie muthu = new Movie("Muthu", 1995, Movie.Genre.DRAMA);
        Movie sivaji = new Movie("Sivaji: The Boss", 2007, Movie.Genre.ACTION);
        Movie petta = new Movie("Petta", 2019, Movie.Genre.ACTION);
        Movie thalapathi = new Movie("Thalapathi", 1991, Movie.Genre.DRAMA);
        Movie shivaji = new Movie("Shivaji", 2007, Movie.Genre.ACTION);
        Movie kaala = new Movie("Kaala", 2018, Movie.Genre.DRAMA);
        Movie[] Movies = { ethiran, kabali, superstar, baasha, muthu, sivaji, petta, thalapathi, shivaji, kaala};

        System.out.println("Length Of Movie Array : " + Movies.length);
        System.out.println("First Element in the Movie Array : " + Movies[0]);
        System.out.println("Last Element in the Movie Array : " + Movies[Movies.length-1]);
        printMovieBefore2000(Movies);

        System.out.println("Unsorted Movies Array : " + Arrays.toString(Movies));
        Arrays.sort(Movies);
        System.out.println("Sorted Movies Array : " + Arrays.toString(Movies));
    }

    public static void printMovieBefore2000(Movie[] Movie)
    {
        System.out.println("Movie Before 2000");
        for( Movie movie : Movie )
        {
            if ( movie.getYear() < 2000 )
            {
                System.out.println(movie);
            }
        }
    }

}
