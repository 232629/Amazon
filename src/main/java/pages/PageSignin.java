package pages;

import elements.AmazonElement;
import elements.IMySelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class PageSignin extends PageCommon {

    public IMySelenideElement txtLogin = new AmazonElement($(By.id("ap_email")));
    public IMySelenideElement btnContinue = new AmazonElement( $(By.id("continue")));

    public IMySelenideElement txtPassword = new AmazonElement($(By.id("ap_password")));
    public IMySelenideElement btnSignIn = new AmazonElement($(By.id("signInSubmit")));

    @Step("Login by {login} / {pas}")
    public void login(String login, String pas) {
        btnAccountList.click();

        txtLogin.setValue(login);
        btnContinue.click();

        txtPassword.setValue(pas);
        btnSignIn.click();
    }

}
