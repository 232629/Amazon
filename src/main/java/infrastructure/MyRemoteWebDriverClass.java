package infrastructure;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class MyRemoteWebDriverClass implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities capabilities) {

        try {
            capabilities.setBrowserName(Config.SELENOID_BROWSER);
            capabilities.setVersion(Config.SELENOID_BROWSER_VERSION);

            capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", false);
            capabilities.setCapability("enableLog", false);
            capabilities.setCapability("screenResolution", "1920x1080x24");
            capabilities.setCapability("timeZone", "Europe/Athens");

            RemoteWebDriver driver = new RemoteWebDriver(
                    URI.create(Config.SELENOID_URL + "/wd/hub").toURL(),
                    capabilities
            );

            return driver;
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}