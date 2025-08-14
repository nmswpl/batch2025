package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie>{
    String movieName;
    int yearOfRelease;
    String genere;

    public Movie(String genere, String movieName, int yearOfRelease) {
        this.genere = genere;
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
    }

    public Movie() {

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
        return "Movie{" +
                "genere='" + genere + '\'' +
                ", movieName='" + movieName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
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
