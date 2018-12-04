package AlternatingSplit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AlternatingSplitTest {

    @Test
    public void testEncrypt() {
        //Given
        AlternatingSplit alternatingSplit = new AlternatingSplit();

        //When & Then
        assertEquals("This is a test!", alternatingSplit.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", alternatingSplit.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", alternatingSplit.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", alternatingSplit.encrypt("This is a test!", 3));
        assertEquals("This is a test!", alternatingSplit.encrypt("This is a test!", 4));
        assertEquals("This is a test!", alternatingSplit.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", alternatingSplit.encrypt("This kata is very interesting!", 1));
    }

    @Test
    public void testDecrypt() {
        //Given
        AlternatingSplit alternatingSplit = new AlternatingSplit();

        //When & Then
        assertEquals("This is a test!", alternatingSplit.decrypt("This is a test!", 0));
        assertEquals("This is a test!", alternatingSplit.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", alternatingSplit.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", alternatingSplit.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", alternatingSplit.decrypt("This is a test!", 4));
        assertEquals("This is a test!", alternatingSplit.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", alternatingSplit.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    public void testNullOrEmpty() {
        //Given
        AlternatingSplit alternatingSplit = new AlternatingSplit();

        //When & Then
        assertEquals("", alternatingSplit.encrypt("", 0));
        assertEquals("",  alternatingSplit.decrypt("", 0));
        assertEquals(null, alternatingSplit.encrypt(null, 0));
        assertEquals(null,  alternatingSplit.decrypt(null, 0));
    }
}