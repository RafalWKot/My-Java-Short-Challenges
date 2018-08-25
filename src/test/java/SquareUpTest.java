import org.junit.Test;

import static org.junit.Assert.*;

public class SquareUpTest {

    @Test
    public void getSquareUp() {
        //Gicen
        SquareUp squareUp = new SquareUp();

        //When
        int [] square = squareUp.getSquareUp(3);
        int [] expectArray = {0,0,1,0,2,1,3,2,1};

        //Then
        assertArrayEquals(expectArray, square);
    }
}