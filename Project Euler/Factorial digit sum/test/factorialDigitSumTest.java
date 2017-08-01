import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Abhijith on 01-Aug-17.
 */
public class factorialDigitSumTest {
    @Test
    public void fact5() {
        factorialDigitSum fact = new factorialDigitSum();
        assertEquals("120", factorialDigitSum.factorial(5));
        assertEquals(3, factorialDigitSum.sumOfDigit("120"));
    }

    @Test
    public void fact1() {
        assertNotEquals("10", factorialDigitSum.factorial(10));
        assertNotEquals("10", factorialDigitSum.sumOfDigit("10"));
    }

    @Test
    public void fact10() {
        assertEquals("3628800", factorialDigitSum.factorial(10));
        assertEquals(27, factorialDigitSum.sumOfDigit("3628800"));
    }
}