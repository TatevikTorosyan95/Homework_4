package main;

import model.Movie;

public class Test {
    public static void main(String[] args) {
        Movie movie1 = new Movie();

        movie1.setTitle("Leon");
        movie1.setReleaseYear(1300);
        movie1.setBudget(115000000);
        movie1.setDurationByMin(110);
        movie1.setGenre("Drama");
        movie1.setCountry("France");
        movie1.setDirector("Luc Besson");
        movie1.setLanguage("English");
        movie1.setRatingInImbd(37);


        System.out.println(movie1.getTitle());
        System.out.println(movie1.getReleaseYear());
        System.out.println(movie1.getBudget() + "$");
        System.out.println(movie1.getDurationByMin() + "min");
        System.out.println(movie1.getCountry());
        System.out.println(movie1.getLanguage());
        System.out.println(movie1.getRatingInImbd());
        System.out.println(movie1.getDirector());
        System.out.println(movie1.getGenre());

    }
}
