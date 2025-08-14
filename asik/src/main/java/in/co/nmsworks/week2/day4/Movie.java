package in.co.nmsworks.week2.day4;

public class Movie implements Comparable<Movie>
{
    public enum Genre
    {
        SCIFI, ACTION, DRAMA
    }

    private String movieName;
    private int year;
    private Genre genre;

    public Movie()
    {}

    public Movie(String movieName, int year, Genre genre)
    {
        this.movieName = movieName;
        this.year = year;
        this.genre = genre;
    }

    public String getMovieName()
    {
        return movieName;
    }

    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public void setGenre(Genre genre)
    {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return "Movie { " +
                "movieName = '" + movieName + '\'' +
                ", year = " + year +
                ", genre = " + genre +
                " }" ;
    }

    @Override
    public int compareTo(Movie o)
    {
        /*return this.year == o.getYear() ? 0 : this.year < o.getYear() ? -1 : 1;*/
        return year - o.getYear();
    }

}


