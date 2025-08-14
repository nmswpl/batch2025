package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie> {
     private String movieName;
     private int yearOfRelease;
     private String genre;

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

    public Movie(String movieName, int yearOfRelease, String genre) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName = '" + movieName + '\'' +
                ", yearOfRelease = " + yearOfRelease +
                ", genre = '" + genre + '\'' +
                '}';
    }



    @Override
    public int compareTo(Movie o) {



        if (this.getYearOfRelease() < o.getYearOfRelease())
            return -1;

        else if (this.getYearOfRelease() == o.getYearOfRelease())
            return 0;

        else if (this.getYearOfRelease() > o.getYearOfRelease())
            return 1;

        return 0;



    }

}

