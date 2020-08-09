package infrastructure;

public final class Config {
    public static String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");
    public static final String BASE_URL = "https://www.amazon.co.uk";

    //Selenoid
    public static final String SELENOID_URL = "http://10.5.3.15:4444";
    public static final String SELENOID_BROWSER = "chrome";
    public static final String SELENOID_BROWSER_VERSION = "83.0";
}
