package in.co.nmsworks.week3.day4;

public class Movie
{
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    String movie;
   int year;
    String gener;

    @Override
    public String toString() {
        return "Movie{" +
                "movie='" + movie + '\'' +
                ", year=" + year +
                ", gener='" + gener + '\'' +
                '}';
    }

    public Movie(String movie, int year, String gener) {
        this.movie = movie;
        this.year = year;
        this.gener = gener;
    }


}
