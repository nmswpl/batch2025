package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie>{

    private String movieName;
    private int yearOfRelease;
    public enum Genre{
        SCIENCE_FICTION, ACTION, DRAMA;
    }
    private String genre_;

    public Movie() {
    }

    public Movie(String movieName, int yearOfRelease, String genre) {
        this.genre_ = genre;
        this.yearOfRelease = yearOfRelease;
        this.movieName = movieName;
    }

    @Override
    public int compareTo(Movie o) {
        /*
        if (this.yearOfRelease < o.yearOfRelease){
            return -1;
        }else if (this.yearOfRelease > o.yearOfRelease){
            return 1;
        }
        return 0;



        or




        return (this.yearOfRelease < o.yearOfRelease) ? -1 : (this.yearOfRelease > o.yearOfRelease) ? 1 : 0;


        or


        */



        return this.yearOfRelease - o.yearOfRelease;



    }



    public Movie(String movieName, int yearOfRelease, Genre genre) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre_='" + genre_ + '\'' +
                '}';
    }


    public String getMovieName() {
        return movieName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }


    Genre genre;

}
