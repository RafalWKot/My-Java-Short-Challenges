package SpellingBee;

import java.util.Arrays;

public class SpellingBee {
    public static int howManyBees(final char[][] hive) {
        if (hive == null || hive.length == 0 ) {
            return 0;
        }
        int numberOfBee = 0;
        int n = 0;
        String[] strings = new String[hive.length * 2 + hive[0].length * 2];
        for (int i = 0; i < hive.length; i++) {
            strings[n] = "";
            for (int j = 0; j < hive[i].length; j++) {
                strings[n] += hive[i][j];
            }
            n++;
            strings[n] = new StringBuilder(strings[n - 1]).reverse().toString();
            n++;
        }
        for (int i = 0; i < hive[0].length; i++) {
            strings[n] = "";
            for (int j = 0; j < hive.length; j++) {
                strings[n] += hive[j][i];
            }
            n++;
            strings[n] = new StringBuilder(strings[n - 1]).reverse().toString();
            n++;
        }
        for (String string : strings) {
            numberOfBee += string.split("bee", -1).length - 1;
        }
        return numberOfBee;
    }

}
