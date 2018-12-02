package BitCounting;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitCountingTest {

    @Test
    public void countBitsTest() {
        //Given
        BitCounting bitCounting = new BitCounting();

        //When & Then
        assertEquals(5, bitCounting.countBits(1234));
        assertEquals(1, bitCounting.countBits(4));
        assertEquals(3, bitCounting.countBits(7));
        assertEquals(2, bitCounting.countBits(9));
        assertEquals(2, bitCounting.countBits(10));
    }
}