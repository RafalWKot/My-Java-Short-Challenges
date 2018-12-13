package WriteNumberInExpandedForm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpandFormTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", ExpandForm.expandedForm(12));
        assertEquals("40 + 2", ExpandForm.expandedForm(42));
        assertEquals("70000 + 300 + 4", ExpandForm.expandedForm(70304));
    }

}