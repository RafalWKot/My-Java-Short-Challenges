package MoviesAnalyzer;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class MoviesAnalyzerTest {

    @Test
    public void getTopMovies() {
        //Given
        MoviesAnalyzer moviesAnalyzer = new MoviesAnalyzer();

        Set<String> tom = new HashSet<>();
        tom.add("Bekarty Wojny");
        tom.add("Top Gun");
        tom.add("Skazani na Shawshank");

        Set<String> mary = new HashSet<>();
        mary.add("Przewinelo z wiatrem");
        mary.add("Top Gun");
        mary.add("Skazani na Shawshank");

        Set<String> adam = new HashSet<>();
        adam.add("Chlopaki nie placza");
        adam.add("Top Gun");
        adam.add("Bekarty Wojny");
        adam.add("Skazani na Shawshank");

        Set<String> daniel = new HashSet<>();
        daniel.add("Skazani na Shawshank");
        daniel.add("Zielona mila");
        daniel.add("Ojciec chrzestny");
        daniel.add("Forrest Gump");

        List<Set<String>> friends = new ArrayList<>();
        friends.add(tom);
        friends.add(mary);
        friends.add(adam);
        friends.add(daniel);

        //When
        List<Set<String>> topMovies = moviesAnalyzer.getTopMovies(friends,3);

        //When
        assertEquals(true, topMovies.get(0).contains("Skazani na Shawshank"));
        assertEquals(true, topMovies.get(1).contains("Top Gun"));
        assertEquals(true, topMovies.get(2).contains("Bekarty Wojny"));
    }
}