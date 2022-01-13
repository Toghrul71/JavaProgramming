package day31_Tasks;

import day31_Constructors.scrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country, title, Genre, releaseDate, director;
   ArrayList<String> castsList = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String cast){
    castsList.add(cast);
    }
    public void addCasts(String[] casts){
        castsList.addAll(Arrays.asList(casts));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", total number of casts='" + castsList.size() + '\'' +
                '}';
    }
}
