//Movies analyzer | Find top favorite movies among friends -
//Implement a method that will analyze movies dataset and return array of most favourited movies

package MoviesAnalyzer;

import java.util.*;
import java.util.stream.Collectors;

public class MoviesAnalyzer {

    public List<Set<String>> getTopMovies(List<Set<String>> fiendsFavouritesMovies, int numberFavouritesMovies) {
        Map<String, Long> countTopMovies = fiendsFavouritesMovies.stream()
                .flatMap(t -> t.stream())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<Long> quantityMoviesFirstPlaces = countTopMovies.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(t -> t.getValue())
                .distinct()
                .sorted(Collections.reverseOrder())
                .limit(numberFavouritesMovies)
                .collect(Collectors.toList());

        List<Set<String>> topMovies= new ArrayList<>();
        for(Long quantity: quantityMoviesFirstPlaces) {
            Set<String> movies =  countTopMovies.entrySet().stream()
                    .filter(f -> f.getValue() == quantity)
                    .map(t -> t.getKey())
                    .collect(Collectors.toSet());
            topMovies.add(movies);
        }
        return topMovies;
    }
}
