package CommonSubsequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonSubsegeunceTest {

    @Test
    public void testGetSubseguence() {
        //Given
        CommonSubsegeunce commonSubsegeunce = new CommonSubsegeunce();
        String stringA = "raaptttq";
        String stringB = "gggaawwtttt";

        //When
        String subseqeunce = commonSubsegeunce.getCommonSubseguence(stringA, stringB);

        //Then
        assertEquals("ttt", subseqeunce);
    }

    @Test
    public void testGetSubseguence2() {
        //Given
        CommonSubsegeunce commonSubsegeunce = new CommonSubsegeunce();
        String stringA = "raaptttqtgrfeerthtyuuuytaayh";
        String stringB = "gggaawwttttyuuuytaaqweqweqwe";

        //When
        String subseqeunce = commonSubsegeunce.getCommonSubseguence(stringA, stringB);

        //Then
        assertEquals("tyuuuytaa", subseqeunce);
    }
}