package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie>{
    String movieName;
    int yearOfRelease;
    String genere;


    public Movie() {

    }

    public Movie(String movie, int yearOfRelease, String genere) {
        this.movieName = movie;
        this.yearOfRelease = yearOfRelease;
        this.genere = genere;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getGenere() {
        return genere;
    }

    public String getMovieName() {
        return movieName;
    }

    @Override
    public String toString() {
        return "Movie { " +
                "movieName='" + movieName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                "genere='" + genere + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        if (this.yearOfRelease < o.yearOfRelease){
            return -1;
        } else if (this.yearOfRelease == o.yearOfRelease) {
            return 0;
        }
        return 1;
    }
}
