package MultiplesOf3Or5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals(23, new Solution().getSum(10));
    }
}