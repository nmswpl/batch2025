package in.co.nmsworks.week2.day4;

import java.util.Arrays;

public class MovieArr {
    public static void main(String[] args) {
        Movie m1 = new Movie(" Enthiran",2010,"Sci-Fi");
        Movie m2 = new Movie(" Kabali",2016,"Action");
        Movie m3 = new Movie(" Superstar",2002,"Drama");
        Movie m4 = new Movie(" Baasha",1995,"Action");
        Movie m5 = new Movie(" Muthu",1995,"Drama");
        Movie m6 = new Movie(" Sivaji-TheBoss",2007,"Action");
        Movie m7 = new Movie(" Petta",2019,"Action");
        Movie m8 = new Movie(" Thalapathi",1991,"Drama");
        Movie m9 = new Movie(" Shivaji",2007,"Action");
        Movie m10 = new Movie(" Kaala",2018,"Drama");

        Movie movies[]=new Movie[] {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};

        System.out.println("the length: "+movies.length);
        System.out.println("first: "+movies[0]);
        System.out.println("last: "+movies[movies.length-1]);

        System.out.println(Arrays.toString(movies));
        Arrays.sort(movies);
        System.out.println(Arrays.toString(movies));



    }

}
