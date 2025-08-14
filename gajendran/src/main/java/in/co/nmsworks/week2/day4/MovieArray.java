package in.co.nmsworks.week2.day4;


import java.util.Arrays;

public class MovieArray {

    public static int findLength(Movie[] movieArr){
        return movieArr.length;
    }


    public static void printFirstAndLastMovie(Movie[] movies){
        System.out.println();
        System.out.println("Print FirstAndLastMovie");
        System.out.println(movies[0]);
        System.out.println(movies[findLength(movies) - 1]);
        System.out.println();

    }


    public static void PrintArray(Movie[] movies){
        System.out.println(Arrays.toString(movies));
    }


    public static void printMovieNameBasedOnYear(Movie[] movies, int year){

        System.out.println();
        System.out.println("Print Movie Name Based On Year");

        for (Movie i : movies){
            if (i.getYearOfRelease() < year) {
                System.out.println(i.getMovieName());
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Movie[] movies = new Movie[]{
                new Movie("Enthiran",2010, Movie.Genre.SCIENCE_FICTION),
                new Movie("Superstar",2002, Movie.Genre.DRAMA),
                new Movie("Enthiran",2010, Movie.Genre.SCIENCE_FICTION),
                new Movie("Baasha",1995, Movie.Genre.ACTION),
                new Movie("Muthu",1995, Movie.Genre.DRAMA),
                new Movie("Sivaji: The Boss",2007, Movie.Genre.ACTION),
                new Movie("Petta",2019, Movie.Genre.ACTION),
                new Movie("Thalapathi",1991, Movie.Genre.DRAMA),
                new Movie("Shivaji",2007, Movie.Genre.ACTION),
                new Movie("Kaala",2018, Movie.Genre.DRAMA)

        };

        System.out.println(findLength(movies));
        printFirstAndLastMovie(movies);
        printMovieNameBasedOnYear(movies,2000);



        System.out.println(Arrays.toString(movies));
        Arrays.sort(movies);
        System.out.println(Arrays.toString(movies));


    }
}

