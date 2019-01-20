package DecodeTheMorseCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        String wordsNative = "";
        String[] wordsMorse = morseCode.split("   ");

        for (int i = 0; i < wordsMorse.length; i++) {
            wordsNative += Arrays.stream(wordsMorse[i].split(" "))
                    .map(s -> MorseCode.get(s).toString())
                    .collect(Collectors.joining(""));

            if (i < wordsMorse.length - 1) {
                wordsNative += " ";
            }
        }
        return wordsNative;
    }
}
