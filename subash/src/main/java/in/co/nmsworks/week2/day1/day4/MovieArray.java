package in.co.nmsworks.week2.day1.day4;

import java.util.Arrays;

public class MovieArray {

    public static void main(String[] args)
    {

        Movie mov1 = new Movie("Enthiran", 2010, "Sci-fi");
        Movie mov2 = new Movie("Kabali", 2016, "Action");
        Movie mov3 = new Movie("Superstar", 2002, "Drama");
        Movie mov4 = new Movie("Baasha", 1995, "Action");
        Movie mov5 = new Movie("Muthu", 1995, "Drama");
        Movie mov6 = new Movie("Sivaji-The Boss", 2007, "Action");
        Movie mov7 = new Movie("Petta", 2019, "Action");
        Movie mov8 = new Movie("Thalapathy", 1991, "Drama");
        Movie mov9 = new Movie("Sivaji", 2007, "Action");
        Movie mov10 = new Movie("Kaala", 2018, "Drama");

        Movie movArray[] = new Movie[]{mov1, mov2, mov3, mov4, mov5, mov6, mov7, mov8, mov9, mov10};

        for(Movie mov : movArray)
        {
            System.out.println(mov);
        }

        Arrays.sort(movArray);

        System.out.println();

        for(Movie mov : movArray)
        {
            System.out.println(mov);
        }

        System.out.println(mov1.compareTo(mov2));

    }

}

