package infrastructure;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

import static infrastructure.AllureEnvironmentWriter.allureEnvironmentWriter;

public class AllureEnvironments {
    public static void set() {
        Map<String, String> environmentValues = new HashMap<String, String>();
        environmentValues.put("Selenoid", Config.SELENOID_URL);
        environmentValues.put("Browser", Config.browser);
        environmentValues.put("Site", Config.BASE_URL);
        environmentValues.put("Login", "kijowe8154@icanav.net");
        environmentValues.put("Password", "Password1");
        allureEnvironmentWriter(ImmutableMap.<String, String>builder().putAll(environmentValues).build());
    }
}
