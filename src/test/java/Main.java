import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.common.collect.ImmutableMap;
import infrastructure.AllureEnvironments;
import infrastructure.Browser;
import infrastructure.Config;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.open;

public class Main {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("BeforeClass");
        Browser.initBrowser();
        AllureEnvironments.set();
    }

    @BeforeEach
    public void beforeTest(TestInfo testInfo) {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open(Config.BASE_URL);
    }

    @AfterEach
    public void afterTest(TestInfo testInfo) {

    }

    @AfterAll
    public static void afterAllTests() {

    }
}
