package infrastructure;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;

public class Browser {

    public static void initBrowser() {
        switch (Config.browser) {
            case "chrome":
                InitChrome();
                break;
            case "firefox":
                InitFirefox();
                break;
            case "selenoid":
                Configuration.browser = MyRemoteWebDriverClass.class.getName();
                break;
            default:
                InitChrome();
                break;
        }

    }

    private static void InitChrome() {
        Configuration.browser = Browsers.CHROME;
        Configuration.startMaximized = true;
        Configuration.browserCapabilities.setCapability("timeZone", "Europe/Athens");
        Configuration.headless = false;
    }

    private static void InitFirefox() {
        Configuration.browser = Browsers.FIREFOX;
        Configuration.startMaximized = true;
        Configuration.browserCapabilities.setCapability("timeZone", "Europe/Athens");
        Configuration.headless = false;
    }
}
