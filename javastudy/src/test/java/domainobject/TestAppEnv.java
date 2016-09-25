package domainobject;

/**
 * Created by anny on 24.09.16.
 */
public class TestAppEnv {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://"+DOMAIN+":"+PORT;
    }
}
