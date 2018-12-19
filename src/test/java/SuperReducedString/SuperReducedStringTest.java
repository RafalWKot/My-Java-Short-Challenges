package SuperReducedString;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperReducedStringTest {

    @Test
    public void testSuperReducedString () {

        assertEquals("acd", SuperReducedString.superReducedString("aaabbcddd"));
    }
}