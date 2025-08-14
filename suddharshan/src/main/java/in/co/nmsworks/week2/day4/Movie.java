package in.co.nmsworks.week2.day4;

public class Movie implements Comparable <Movie> {
    private String name;
    private int yearOfRelease;
    private String genre;

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie() {
    }

    public Movie(String name, int yearOfRelease, String genre) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        return this.yearOfRelease - o.yearOfRelease;
        /*if (this.yearOfRelease < o.yearOfRelease)
            return -1;
        else if (this.yearOfRelease == o.yearOfRelease)
            return 0;
        return 1;
        return (this.yearOfRelease < o.yearOfRelease) ? -1 : (this.yearOfRelease == o.yearOfRelease ? 0 : 1);
        return Integer.compare(this.yearOfRelease, o.yearOfRelease);*/
    }

}
