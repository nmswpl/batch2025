package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie>{

    private String name;
    private int yearOfRelease;
    private String genre;

    public Movie() {
    }

    public Movie(String name, int yearOfRelease, String genre) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getGenre() {
        return genre;
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
//        if (this.yearOfRelease < o.getYearOfRelease()) {
//            return -1;
//        } else if (this.yearOfRelease == o.getYearOfRelease()) {
//            return 0;
//        }
//        return 1;
        return this.yearOfRelease - o.getYearOfRelease();
    }
}
