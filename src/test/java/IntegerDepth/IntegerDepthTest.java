package IntegerDepth;

import org.junit.Assert;
import org.junit.Test;

public class IntegerDepthTest {

    @Test
    public void sampleTest1() {
        Assert.assertEquals(10, new IntegerDepth().computeDepth(1));
    }

    @Test
    public void sampleTest2() {
        Assert.assertEquals(9, new IntegerDepth().computeDepth(42));
    }


}