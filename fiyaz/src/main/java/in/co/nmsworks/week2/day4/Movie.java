package in.co.nmsworks.week2.day4;

public class Movie implements Comparable <Movie>  {

     String movieName;
     int yearOfRelease;
     String genre;

    public Movie() {

    }

    public Movie(String movieName, int yearOfRelease, String genre) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return 0;
    }
}
