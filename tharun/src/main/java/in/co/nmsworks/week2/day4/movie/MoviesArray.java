package in.co.nmsworks.week2.day4.movie;

import java.util.Arrays;

public class MoviesArray{

    static void printFirstAndLastElement(Movie [] movieArray){
        System.out.println(movieArray[0]);
        System.out.println(movieArray[movieArray.length-1]);
    }

    static  void printMovieName(Movie [] movieArray){
        System.out.println();
        for (int i = 0 ; i < movieArray.length ; i++){
            if (movieArray[i].getYear() < 2000){
                System.out.println(movieArray[i].getMovieName());
            }
        }
    }

    public static void main(String[] args) {

        Movie enthiran = new Movie("Enthiran",2010,"Sci-Fi");
        Movie kabali = new Movie("Kabali",2016,"Action");
        Movie superstar = new Movie("Superstar",2002,"Drama");
        Movie baasha = new Movie("Baasha",1995,"Action");
        Movie muthu = new Movie("Muthu",1995,"Drama");
        Movie sivaji = new Movie("Sivaji: The Boss",2007,"Action");
        Movie petta = new Movie("Petta",2019,"Action");
        Movie thalapathi = new Movie("Thalapathi",1991,"Drama");
        Movie shivaji = new Movie("Shivaji",2007,"Action");
        Movie kaala = new Movie("Kaala",2018,"Drama");

        Movie [] movies = new Movie [] {enthiran,kabali,superstar,baasha,muthu,sivaji,petta,thalapathi,shivaji,kaala};

        System.out.println("Movies Array Length : "+ movies.length);
        printFirstAndLastElement(movies);

        printMovieName(movies);

        System.out.println("Unsorted Array : " + Arrays.toString(movies) );
        Arrays.sort(movies);
        System.out.println("Sorted Array : "+Arrays.toString(movies));



    }
}
