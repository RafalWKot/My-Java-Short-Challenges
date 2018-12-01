//Write a function that takes in a string of one or more words,
//and returns the same string, but with all five or more letter words reversed
//Strings passed in will consist of only letters and spaces.
//Spaces will be included only when more than one word is present.
//
//
//Examples:
//
//spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
//spinWords( "This is a test") => returns "This is a test"
//spinWords( "This is another test" )=> returns "This is rehtona test"

package ReverseWords;

import java.util.Arrays;

public class ReverseWords {

    public String reverse(String sentence) {

        return String.join(" ", Arrays.stream(sentence.trim().split("\\s+"))
                .map(word -> {
                    if (word.length() >= 5) {
                        word = new StringBuilder(word).reverse().toString();
                    }
                    return word;
                })
                .toArray(String[]::new)
        );
    }
}