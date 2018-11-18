package EqualSum;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FinderEqualSumTest {

    @Test
    public void findIndexEqualSumIncorrectInputData() {
        //Given
        int[] testArray = {1,2,4,3,5,5,4};
        FinderEqualSum finderEqualSum = new FinderEqualSum(testArray);
        //When
        int result = finderEqualSum.findIndexEqualSum();
        //Then
        assertEquals(-1, result);
    }

    @Test
    public void findIndexEqualSumWithoutEqualSum() {
        //Given
        int[] testArray = {1,2,4,3,5,5,6,1};
        FinderEqualSum finderEqualSum = new FinderEqualSum(testArray);
        //When
        int result = finderEqualSum.findIndexEqualSum();
        //Then
        assertEquals(-1, result);
    }

    @Test
    public void findIndexEqualSumWithEqualSum() {
        //Given
        int[] testArray = {1,2,4,3,5,5};
        FinderEqualSum finderEqualSum = new FinderEqualSum(testArray);
        //When
        int result = finderEqualSum.findIndexEqualSum();
        //Then
        assertEquals(3, result);
    }
}