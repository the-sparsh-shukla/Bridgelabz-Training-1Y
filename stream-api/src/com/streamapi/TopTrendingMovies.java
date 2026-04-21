package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TopTrendingMovies {

    static class Movie {
        private final String title;
        private final double rating;
        private final int year;

        Movie(String title, double rating, int year) {
            this.title = title;
            this.rating = rating;
            this.year = year;
        }

        public String getTitle() {
            return title;
        }

        public double getRating() {
            return rating;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return title + " | Rating: " + rating + " | Year: " + year;
        }
    }

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", 8.8, 2010),
                new Movie("Interstellar", 8.7, 2014),
                new Movie("The Dark Knight", 9.0, 2008),
                new Movie("Dune", 8.2, 2021),
                new Movie("Oppenheimer", 8.5, 2023),
                new Movie("The Matrix", 8.7, 1999),
                new Movie("Avengers: Endgame", 8.4, 2019),
                new Movie("The Batman", 7.8, 2022)
        );

        System.out.println("Top 5 Trending Movies (rating >= 8.0):");
        movies.stream()
                .filter(movie -> movie.getRating() >= 8.0)
                .sorted(Comparator.comparingDouble(Movie::getRating)
                        .thenComparingInt(Movie::getYear)
                        .reversed())
                .limit(5)
                .forEach(System.out::println);
    }
}
