package SquareEveryDigit;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareEveryDigitTest {

    @Test
    public void testSquareDigits() {
        //Given
        SquareEveryDigit squareEveryDigit = new SquareEveryDigit();

        //When & Then
        assertEquals(811181, squareEveryDigit.squareDigits(9119));
        assertEquals(1491625,squareEveryDigit.squareDigits(12345));
    }
}