package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie>{
    private String movieName;
    int year;
    String genre;

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Movie(){

    }
    public Movie(String movieName , int year ,String genre){
       this.movieName = movieName;
       this.year = year;
       this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String getMovieName() {
        return movieName;
    }

    @Override
    public String toString() {
        return "Movie name :" + movieName + "Year :" + year + " Genre :" + genre;
    }

    @Override
    public int compareTo(Movie o) {
        if (this.year < o.year){
            return -1;
        }
        else if (this.year == o.year){
            return 0;
        }
        else{
            return 1;
        }

    }
}
