package in.co.nmsworks.week2.day4;

import java.util.Objects;

public class Movie implements Comparable<Movie>{
    public static int length;
    private String moviename;
    private int yearOfRealice;
    private String genre;

    public Movie(String moviename, int yearOfRealice, String genre){
        this.moviename=moviename;
        this.yearOfRealice=yearOfRealice;
        this.genre=genre;

    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public int getYearOfRealice() {
        return yearOfRealice;
    }

    public void setYearOfRealice(int yearOfRealice) {
        this.yearOfRealice = yearOfRealice;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public int compute(int a, int b) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movies = (Movie) o;
        return yearOfRealice == movies.yearOfRealice && Objects.equals(moviename, movies.moviename) && Objects.equals(genre, movies.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moviename, yearOfRealice, genre);
    }

    @Override
    public String toString() {
        return "Movies{" +
                "moviename='" + moviename + '\'' +
                ", yearOfRealice=" + yearOfRealice +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie mov) {

        return yearOfRealice-mov.yearOfRealice;
    }


}
