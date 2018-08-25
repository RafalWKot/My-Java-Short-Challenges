package StringWithoutX2;

import StringWithoutX2.StringWithoutX2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringWithoutX2Test {

    private StringWithoutX2 theString;

    @Before
    public void setUp() throws Exception {
        theString = new StringWithoutX2();
    }

    @Test
    public void stringFirstPlace() {
        //Given
        String str = "xHart";
        //When
        str = theString.getStringWithoutX2(str);
        //Then
        assertEquals("Hart", str);
    }

    @Test
    public void stringSecondPlace() {
        //Given
        String str = "Hxart";
        //When
        str = theString.getStringWithoutX2(str);
        //Then
        assertEquals("Hart", str);
    }

    @Test
    public void stringManyX() {
        //Given
        String str = "xxHarxxt";
        //When
        str = theString.getStringWithoutX2(str);
        //Then
        assertEquals("Harxxt", str);
    }
}