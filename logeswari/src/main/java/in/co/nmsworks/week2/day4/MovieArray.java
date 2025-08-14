package in.co.nmsworks.week2.day4;

public class MovieArray {

    public static void main(String[] args) {
        Movie m1=new Movie("enthiran",2010,"sci-fi");
        Movie m2=new Movie("kabali",2016,"action");
        Movie m3=new Movie("superstar",2002,"drama");
        Movie m4=new Movie("baasha",1995,"action");
        Movie m5=new Movie("muththu",1995,"drama");
        Movie m6=new Movie("sivaji",2007,"action");
        Movie m7=new Movie("petta",2019,"action");
        Movie m8=new Movie("thalabathi",1991,"drama");
        Movie m9=new Movie("shivaji",2007,"action");
        Movie m10=new Movie("kaala",2018,"drama");

        Movie[] movies={m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};
        printMovie(movies);

        System.out.println();
        System.out.println("compare m1,m2 :" +m1.compareTo(m2));

        for (int i=0;i<5;i++){
            System.out.println("compare movie [0] and [i] : "+movies[0].compareTo(movies[i]));
        }


    }
    public static void printMovie(Movie[] movies){

        for(int i = 0; i< Movie.length; i++){
            System.out.println(movies[i].getMoviename());
            System.out.println(movies[i].getYearOfRealice());
            System.out.println(movies[i].getGenre());
            System.out.println("legnth of array"+movies.length);
        }
    }

}
