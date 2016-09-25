package chap05;

import chap03.MyFirstTest;
import domainobject.TestAppEnv;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by anny on 24.09.16.
 */
public class TestAppEnvironment {

    @Test
    public void canGetUrlStatically(){
        Assert.assertEquals("http://192.123.0.3:67", TestAppEnv.getUrl(), "Returns the hardcoded URL");
    }

    @Test
    public void canGetDomainAndPortStatically(){
        Assert.assertEquals("192.123.0.3", TestAppEnv.DOMAIN, "Returns the static Domain name");
        Assert.assertEquals("67", TestAppEnv.PORT, "Returns the static Port number");
        Assert.assertTrue(TestAppEnv.DOMAIN.contains("192"));
        MyFirstTest.addTwoPlusTwoTest();
    }

    @Test
    public void staticFieldInArrayImplementation (){
        List<String> fields = new LinkedList<>(Arrays.asList(TestAppEnv.DOMAIN, TestAppEnv.PORT));
        fields.forEach(field -> Assert.assertEquals(TestAppEnv.DOMAIN, TestAppEnv.getUrl(), "Returns the static Port number"));
    }
}

