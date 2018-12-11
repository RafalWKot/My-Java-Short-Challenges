package SpellingBee;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpellingBeeTest {

    private static char [][] show(final char [][] hive) {
        for (int y = 0; y < hive.length; y++) {
            //System.out.println(hive[y]);
        }
        return hive;
    }

    @Test
    public void ex1() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                ".e..e..".toCharArray(),
                ".b..eeb".toCharArray()
        };
        assertEquals(5, SpellingBee.howManyBees(show(hive)));
    }

    @Test
    public void ex2() {
        final char hive[][] = new char[][] {
                "bee.bee".toCharArray(),
                "e.e.e.e".toCharArray(),
                "eeb.eeb".toCharArray()
        };
        assertEquals(8, SpellingBee.howManyBees(show(hive)));
    }
}