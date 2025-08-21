package in.co.nmsworks.week3.day4;

import in.co.nmsworks.week2.day4.movie.Movie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MoviePersistor2 {
    public static void main(String[] args) {
        MoviePersistor2 mp = new MoviePersistor2();
        List<Movie> movies = mp.getMovieFromFile();
        System.out.println(movies);

    }

    private List<Movie> getMovieFromFile() {
        List<Movie> movies = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("/home/nms-training/Downloads/DBMovieName.txt"))) {
            String line ;
            while ((line = br.readLine()) != null){
                String[] lineSeparator = line.split(",");
                for (int i = 0; i < lineSeparator.length; i++) {
                    lineSeparator[i]=lineSeparator[i].replace('"',' ').trim();
                }

                if (lineSeparator[1].equals("Movie")){
                    continue;
                }
                int year = Integer.parseInt(lineSeparator[2]);
                Movie movieObject = new Movie(lineSeparator[1],year,lineSeparator[3]);
                movies.add(movieObject);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return movies;
    }
}
