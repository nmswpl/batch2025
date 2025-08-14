package in.co.nmsworks.week2.day4;

import java.util.Arrays;

import static java.util.Arrays.*;

public class MovieArr {
    public static void main(String[] args) {

        Movie enthiran = new Movie("Enthiran", 2010, "Sci-fi");
        Movie kabali = new Movie("Kabali", 2016, "Action");
        Movie superStar = new Movie("Super Star", 2002, "Drama");
        Movie basha = new Movie("Basha", 1995, "Action");
        Movie muthu = new Movie("Muthu", 1995, "Drama");
        Movie sivaji = new Movie("Sivaji-The Boss", 2007, "Action");
        Movie petta = new Movie("Petta", 2019, "Action");
        Movie thalapathy = new Movie("Thalapathy", 1991, "Drama");
        Movie shivaji = new Movie("Shivaji", 2007, "Action");
        Movie kaala = new Movie("Kaala", 2018, "Drama");

        Movie[] movies = {enthiran, kabali, superStar, basha, muthu, shivaji, sivaji, petta, thalapathy, kaala};

        printLength(movies);
        printFirstLastMovie(movies);
        printBefore2000Movies(movies);

        System.out.println("Unsorted Array : \n" + Arrays.toString(movies));
        Arrays.sort(movies);

        System.out.println("Sorted Array : \n" + Arrays.toString(movies));
    }

    public static void printLength(Movie[] movies){
        System.out.println("Length of Movies is : " + movies.length + "\n");
    }

    public static void printFirstLastMovie(Movie[] movies){
        System.out.println("FIRST MOVIE" + "\n" + "Name : " + movies[0].getName()
                + "\n" + "Year Of Release : " + movies[0].getYearOfRelease()
                + "\n" + "Genre : " + movies[0].getGenre() + "\n");

        System.out.println("LAST MOVIE" + "\n" + "Name : " + movies[movies.length-1].getName()
                + "\n" + "Year Of Release : " + movies[movies.length-1].getYearOfRelease()
                + "\n" + "Genre : " + movies[movies.length-1].getGenre() + "\n");
    }

    public static void printBefore2000Movies(Movie[] movies){

        for (int i = 0; i < movies.length; i++){
            if(movies[i].getYearOfRelease() < 2000){
                System.out.println("MOVIE " + movies[i].getName() + " Release at " + movies[i].getYearOfRelease());
            }
        }
    }
}
