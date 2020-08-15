import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import pages.*;

import static com.codeborne.selenide.Selenide.$;

public class Tests extends Main {

    @Severity(SeverityLevel.NORMAL)
    @ParameterizedTest
    @ValueSource(strings =  {
            "iphone 11 256Gb black",
            "iphone 11 64Gb green"
    })
    public void buyIphone(String q) {

        String login = "kijowe8154@icanav.net";
        String pas = "Password1";

        PageSignin pageSignin = new PageSignin();
        pageSignin.login(login, pas);

        PageMain pageMain = new PageMain();
        pageMain.txtSearch.setValue(q);
        pageMain.btnGo.click();
        pageMain.result.getMinimalPrice(q).click();

        PageReviewOrder pageReviewOrder = new PageReviewOrder();
        pageReviewOrder.addToBasket();

        PageBasket pageBasket = new PageBasket();
        pageBasket.btnDelete.clickJs();
        pageBasket.singOut();

    }

}
