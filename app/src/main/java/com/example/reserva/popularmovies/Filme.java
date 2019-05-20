package com.example.reserva.popularmovies;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Filme {
    private int id;
    private String title;
    private Double popularity;
    private Double vote_average;
    private String overview;
    private String release_date;
    private int backdrop_path;

    public Filme(String title, Double popularity, Double vote_average, String overview, String release_date, int backdrop_path) {
        this.id = id;
        this.title = title;
        this.popularity = popularity;
        this.vote_average = vote_average;
        this.overview = overview;
        this.release_date = release_date;
        this.backdrop_path = backdrop_path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Double getVote_average() {
        return vote_average;
    }

    public void setVote_average(Double vote_average) {
        this.vote_average = vote_average;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(int backdrop_path) {
        this.backdrop_path = backdrop_path;
    }
}
