package in.co.nmsworks.week2.day4;

public class Movie  implements Comparable<Movie> {
    private String movieName;
    private int year;
    private String genre;
    private String movieId;

    public Movie(String result) {
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

    public Movie(){

    }

    public Movie(String movieName,int year,String genre) {
        this.movieName=movieName;
        this.year=year;
        this.genre=genre;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Override
    public int compareTo(Movie mv) {
        //return this.year-mv.getYear();
        if(this.year>mv.year){
            return 1;
        }
        else if(this.year<mv.year){
            return -1;
        }
       return 0;
    }

}
