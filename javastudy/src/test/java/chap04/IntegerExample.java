package chap04;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anny on 21.09.16.
 */
public class IntegerExample {

    @Test
    public void integerExploration (){
        Integer four = new Integer("4");
        List<Integer> numbers = new LinkedList<>(Arrays.asList(11, 10, 3, 21));
        Assert.assertEquals(4, four.intValue(), "String become integer");
        Integer six = 6;
        Assert.assertEquals(6, six.intValue(), "Autoboxing feature");
        numbers.forEach(number -> System.out.println(""+number+" to hex string is " +Integer.toHexString(number)));
    }

    @Test
    public void minAndMaxIntegerVerification (){
        Assert.assertEquals(-2147483648, Integer.MIN_VALUE, "Min int value not equal");
        Assert.assertEquals(2147483647, Integer.MAX_VALUE, "Max int value not equal");
        System.out.println(Byte.SIZE);
        Integer.toHexString(99);


    }
}
