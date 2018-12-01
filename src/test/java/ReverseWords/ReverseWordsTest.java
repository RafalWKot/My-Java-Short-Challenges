package ReverseWords;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsTest {

    @Test
    public void reverseTest() {
        //Given
        ReverseWords reverseWords = new ReverseWords();

        //When & Then
        assertEquals("emocleW", reverseWords.reverse("Welcome"));
        assertEquals("Hey wollef sroirraw", reverseWords.reverse("Hey fellow warriors"));
    }
}