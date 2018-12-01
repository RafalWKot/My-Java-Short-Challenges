package SumOfDigits;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDigitsTest {

    @Test
    public void getSumOfDigitsTest() {
        //Given
        SumOfDigits sumOfDigits = new SumOfDigits();

        //When && Then
        assertEquals(7, sumOfDigits.getSumOfDigits(16));
        assertEquals(4, sumOfDigits.getSumOfDigits(157));
    }
}