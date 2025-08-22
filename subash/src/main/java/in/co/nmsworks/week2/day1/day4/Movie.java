package in.co.nmsworks.week2.day1.day4;

public class Movie implements Comparable<Movie> {

    private int serialNo;
    private String movName;
    private int yearOfRelease;
    private String genre;

    public Movie(int serialNo, String movName, int yearOfRelease, String genre) {
        this.serialNo = serialNo;
        this.movName = movName;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public Movie(String movName, int yearOfRelease, String genre) {
        this.movName = movName;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public Movie() {
    }

    public Movie(String movieName) {
        this.movName=movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getMovName() {
        return movName;
    }

    public void setMovName(String movName) {
        this.movName = movName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movName='" + movName + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {

        if (yearOfRelease > o.getYearOfRelease())
            return 1;
        else if (yearOfRelease < o.getYearOfRelease())
            return -1;

        return 0;

    }
}
