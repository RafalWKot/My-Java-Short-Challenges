package FindDuplicate;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FinderOfDuplicateTest {

    @Test
    public void findDuplicateIncorrectInputData() {
        //Given
        FinderOfDuplicate finderOfDuplicate = new FinderOfDuplicate(Arrays.asList(1,2,3,4,6,6));
        //When
        int result = finderOfDuplicate.findDuplicate();
        //Then
        assertEquals(-1, result);
    }

    @Test
    public void findDuplicateCorrectInputData() {
        //Given
        FinderOfDuplicate finderOfDuplicate = new FinderOfDuplicate(Arrays.asList(1,2,3,4,4,5,6));
        //When
        int result = finderOfDuplicate.findDuplicate();
        //Then
        assertEquals(4, result);
    }
}