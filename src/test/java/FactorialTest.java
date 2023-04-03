import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest extends TestCase {
    @Test
    public void testFactorial1() {
        Factorial test = new Factorial();
        long expected = test.factorial(5);
        long actual = 120;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial2() {
        Factorial test = new Factorial();
        long expected = test.factorial(1);
        long actual = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorial3() {
        Factorial test = new Factorial();
        long expected = test.factorial(10);
        long actual = 3628800;
        Assert.assertEquals(expected, actual);
    }



}