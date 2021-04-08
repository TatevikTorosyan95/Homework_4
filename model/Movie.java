package model;

public class Movie {
    private String title;
    private String director;
    private int releaseYear = 1995;
    private String language;
    private String country;
    private long budget;
    private int durationByMin;
    private int ratingInImbd;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int y) {
        if (y >= 1888) {
            releaseYear = y;
        }
        else {
            System.out.println("Error. The first movie was released in 1888.");
        }
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public int getDurationByMin() {
        return durationByMin;
    }

    public void setDurationByMin(int durationByMin) {
        this.durationByMin = durationByMin;
    }

    public int getRatingInImbd() {
        return ratingInImbd;
    }

    public void setRatingInImbd(int ratingInImbd) {
        this.ratingInImbd = ratingInImbd;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
