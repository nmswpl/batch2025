package in.co.nmsworks.week2.day4;

import java.util.Arrays;

public class MovieArray {

    private static void printMovieNameBefore2000(Movie[] movies) {
        for (Movie i : movies) {
            if (i.getYearOfRelease() > 2000) {
                System.out.println(i.getMovieName());
            }
        }
    }

    private static void printFirstAndLastElement(Movie[] movies) {
        System.out.println(movies[0].toString());
        System.out.println(movies[movies.length - 1].toString());
    }

    public static void main(String[] args) {

        Movie enthiran = new Movie("Enthiran",2010,"Sci-Fi");
        Movie kabali = new Movie("Kabali",2016,"Action");
        Movie superStar = new Movie("SuperStar",2002,"Drama");
        Movie baasha = new Movie("Baasha",1995,"Action");
        Movie muthu = new Movie("Muthu",1995,"Drama");
        Movie sivaji = new Movie("Sivaji: The Boss",2007,"Action");
        Movie petta = new Movie("Petta",2019,"Action");
        Movie thalapathi = new Movie("Thalapathi",1991,"Drama");
        Movie shivaji = new Movie("Shivaji",2007,"Action");
        Movie kaala = new Movie("Kaala",2018,"Drama");


        Movie[] movies = new Movie[]{enthiran,kabali,superStar,baasha,muthu,petta,thalapathi,sivaji,shivaji,kaala};

        System.out.println("The Length of Array : "+ movies.length);
        printFirstAndLastElement(movies);
        printMovieNameBefore2000(movies);


        printCompareUsingMovieYear(movies);

        printUnsortedAndSortedMovieList(movies);


    }

    private static void printUnsortedAndSortedMovieList(Movie[] movies) {
        System.out.println("Printing the Movie List Before Sorting");
        for(Movie i : movies) {
            System.out.println(i);
        }
        System.out.println("Printing the Movie List After Sorting");
        Arrays.sort(movies);
        for(Movie i : movies) {
            System.out.println(i);
        }

    }

    private static void printCompareUsingMovieYear(Movie[] movies) {
        System.out.println("The Value of Comparing : "+movies[0].compareTo(movies[2]));
    }


}
