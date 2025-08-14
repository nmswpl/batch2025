package in.co.nmsworks.week2.day4;

import java.util.Arrays;

public class MovieArray {
    public static void main(String[] args) {

        Movie m1 = new Movie("Enthiran" , 2010 , "Sci-fi");
        Movie m2 = new Movie("Kabali" , 2016 , "Action");
        Movie m3 = new Movie("SuperStar" , 2002 , "Drama");
        Movie m4 = new Movie("Baasha" , 1995 , "Action");
        Movie m5 = new Movie("Muthu" , 1995 , "Drama");
        Movie m6 = new Movie("Sivaji-The boss" , 2007, "Action");
        Movie m7 = new Movie("Peta" ,2019 , "Action");
        Movie m8 = new Movie("Thalapathi" , 1991, "Drama");
        Movie m9 = new Movie("Shivaji" ,2007 , "Action");
        Movie m10 = new Movie("Kaala" , 2018, "Drama");

        Movie[] movies = new Movie[]{m1 ,m2, m3, m4, m5, m6, m7, m8, m9, m10};

        // print the length of the array
        System.out.println(movies.length);

        //print the first element in the array
        System.out.println(movies[0]);

        // print the last element in the array
        System.out.println(movies[movies.length - 1]);

        // print the movie name only for the year of release before 2000

        for(int i=0 ; i< movies.length ; i++){
            if(movies[i].getYearOfRelease() < 2000){
                System.out.print(movies[i].getMovieName());
                System.out.println();
            }
        }
        // print the unsorted array
        System.out.println(Arrays.toString(movies));

        Arrays.sort(movies);

        System.out.println();

        System.out.println(Arrays.toString(movies));


        }
    }

