package com.example.assignment2;

public class Movie {

    //Variables matching the json info
    private String Title;
    private String Year;
    private String imdbID;
    private String Poster;
    private String Rated;
    private String Metascore;

    //Constructor for Movie
    public Movie(String title, String year, String imdbID, String poster, String rating, String plot) {
        this.Title = title;
        this.Year = year;
        this.imdbID = imdbID;
        this.Poster = poster;
        this.Rated = rating;
        this.Metascore = plot;
    }

    //Getters
    public String getTitle() {
        //Truncate title if longer than 20 characters
        if (Title.length() > 20) {
            Title = Title.substring(0, 17) + "...";
        }
        return Title;
    }

    public String getYear() {
        return Year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getPoster() {
        return Poster;
    }

    public String getRated() {
        return Rated;
    }

    public String getMetascore() {
        return Metascore + "%";
    }
}
