package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie>{
    private String name;
    private int yearOfRelease;
    private String genre;

    Movie(){}

    public Movie(String name, int yearOfRelease, String genre){
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
        int i = (yearOfRelease < o.getYearOfRelease()) ? -1 : (yearOfRelease > o.getYearOfRelease()) ? 1 : 0;
        return i;

        //return yearOfRelease - o.getYearOfRelease();
    }
}
