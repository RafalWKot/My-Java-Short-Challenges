package SquaresInARectangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresInARectangleTest {

    @Test
    public void findSquaresTest() {
        assertEquals(8, SquaresInARectangle.findSquares(3,2));
        assertEquals(20, SquaresInARectangle.findSquares(4,3));
        assertEquals(100, SquaresInARectangle.findSquares(11,4));
    }
}