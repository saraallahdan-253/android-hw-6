package com.example.cw6;

public class movie {
    public String title;
    public String mainActor;
    public double movieRate;
    public int pgRate;
    public String genre;

    public movie(String title, String mainActor, double movieRate, int pgRate, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movieRate = movieRate;
        this.pgRate = pgRate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(double movieRate) {
        this.movieRate = movieRate;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
