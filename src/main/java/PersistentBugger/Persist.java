package PersistentBugger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Persist {
    public static int persistence(long n) {

        int counter = 0;
        while (n > 9) {

            List<Long> numbers = Arrays.stream(String.valueOf(n).split(""))
                    .map(Long::valueOf)
                    .collect(Collectors.toList());

            n = 1;

            for (int i = 0; i < numbers.size(); i++) {
                n *=  numbers.get(i);
            }

            counter++;
        }

        return counter;
    }
}
