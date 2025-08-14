package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie>{
    private String movieName ;
    private int yearOfRelease ;
    private String Genre ;



    public Movie(String movieName, int yearOfRelease, String genre) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        Genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getGenre() {
        return Genre;
    }

    @Override
    public String toString() {
        return "MovieClass{" +
                "movieName='" + movieName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", Genre='" + Genre + '\'' +
                '}';
    }


    @Override
    public int compareTo(Movie o) {
         if(yearOfRelease == o.yearOfRelease){
             return 0;
         }
         else if(yearOfRelease > o.yearOfRelease){
             return 1 ;
         }
         else{
             return -1 ;
         }
    }
}
