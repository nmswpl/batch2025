package in.co.nmsworks.week2.day4;

public class Movie {

    String name;
    int year;
    String genre;

    public Movie(String name, int year,String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}

