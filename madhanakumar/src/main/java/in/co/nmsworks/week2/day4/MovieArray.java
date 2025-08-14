package in.co.nmsworks.week2.day4;

import java.util.Arrays;

public class MovieArray {
    public static void main(String[] args) {
       Movie mv = new Movie();
       moviesArray(mv);
    }

    public static void moviesArray(Movie mv) {
        Movie m1 = new Movie("Sci-fi","Enthiran",2010);
        Movie m2 = new Movie("Action","Kabali",2016);
        Movie m3 = new Movie("Drama","Superstar",2002);
        Movie m4 = new Movie("Action","Baasha",1995);
        Movie m5 = new Movie("Drama","Muthu",1995);
        Movie m6 = new Movie("Action","Sivaji : The Boss",2007);
        Movie m7 = new Movie("Action","Petta",2019);
        Movie m8 = new Movie("Drama","Thalapathi",1991);
        Movie m9 = new Movie("Action","Shivaji",2007);
        Movie m10 = new Movie("Drame","Kaala",2018);

        Movie[] movies = new Movie[]{m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};

//        System.out.println(movies.length);
//
//
//        for (int i = 0; i < movies.length; i++) {
//            if (i == 0 || i == movies.length - 1){
//                System.out.println(movies[i]);
//            }
//        }
//
//        System.out.println("-------------------");
//
//        for (int i = 0; i < movies.length; i++) {
//            if (movies[i].getYearOfRelease() < 2000){
//                System.out.println(movies[i]);
//            }
//        }

        System.out.println("\nUnsorted Array.........\n");

        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }

        Arrays.sort(movies);

        System.out.println("\nSorted Array........... \n");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
        }

    }


}
