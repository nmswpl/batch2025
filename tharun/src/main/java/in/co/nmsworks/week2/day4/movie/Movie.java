package in.co.nmsworks.week2.day4.movie;

public class Movie implements Comparable<Movie>{
    private String movieName;
    private int year;
    private String genre;

    public Movie() {
    }

    public Movie(String movieName, int year, String genre) {
        this.movieName = movieName;
        this.year = year;
        this.genre = genre;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
//        if (this.year == o.year){
//            return 0;
//        } else if (this.year < o.year) {
//            return -1;
//        }
//        else {
//            return 1;
//        }
        return year - o.year;
    }
}
