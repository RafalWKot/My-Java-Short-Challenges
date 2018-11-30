package TwoToOne;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoToOneTest {

    @Test
    public void longestTest() {
        //Given
        TwoToOne twoToOne = new TwoToOne();
        //When & Then
        assertEquals("aehrsty", twoToOne.longest("aretheyheres", "yestheyarehere"));
        assertEquals("adegilnorstu", twoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("aeinsu", twoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
}