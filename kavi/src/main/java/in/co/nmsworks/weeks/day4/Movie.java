package in.co.nmsworks.weeks.day4;

public class Movie implements Comparable<Movie> {

    public String name;
    public int yearOfRelease;
    public String genre;

    public Movie(){

    }

    public Movie(String name, int yearOfRelease, String genre) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (this.yearOfRelease == o.yearOfRelease)
            return 0;
        else if (this.yearOfRelease < o.yearOfRelease)
            return -1;
        else
            return 1;
        }
    }





