package PointsInTheCircle;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointsCircleTest {
    @Test
    public void pointsNumberTest() {
        assertEquals(5,PointsCircle.pointsNumber(1));
        assertEquals(13,PointsCircle.pointsNumber(2));
        assertEquals(29,PointsCircle.pointsNumber(3));
        assertEquals(81,PointsCircle.pointsNumber(5));
        assertEquals(3141549,PointsCircle.pointsNumber(1000));
    }

}