import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {
    @Test
    public void testGCD1() {
        GCD test = new GCD();
        int expected = test.gcd(102,68);
        Assert.assertEquals(expected, 34);
    }

    @Test
    public void testGCD2() {
        GCD test = new GCD();
        int expected = test.gcd(96,72);
        Assert.assertEquals(expected, 24);
    }

    @Test
    public void testGCD3() {
        GCD test = new GCD();
        int expected = test.gcd(6,2);
        Assert.assertEquals(expected, 2);
    }

    @Test
    public void testGCD4() {
        GCD test = new GCD();
        int expected = test.gcd(100,100);
        Assert.assertEquals(expected, 100);
    }



}