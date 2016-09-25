package chap03;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by anny on 20.09.16.
 */
public class MyFirstTest {

    @Test
    public static void addTwoPlusTwoTest () {
        int answer = 2+2;
        Assert.assertEquals(4, answer, "2+2!=" + answer);

    }
}
