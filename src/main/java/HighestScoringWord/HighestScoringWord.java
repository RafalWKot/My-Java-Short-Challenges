package HighestScoringWord;

public class HighestScoringWord {
    private static final int ASCII_START_VALUE = 96;

    public static String high(String s) {

        String [] words = s.split(" ");

        String highestScoreWord = "";
        int highestScore = 0;

        int actualScore = 0;
        for (String word: words) {
            for (char ch: word.toCharArray()) {
                actualScore += (int)ch -  ASCII_START_VALUE;
            }
            if (actualScore > highestScore) {
                highestScoreWord = word;
                highestScore = actualScore;
            }
            actualScore = 0;
        }

        return highestScoreWord;
    }
}
