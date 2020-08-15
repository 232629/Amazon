package pages;

import elements.AmazonElement;
import elements.IMySelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class PageCommon extends PageBase {

    public IMySelenideElement btnAccountList = new AmazonElement( $(By.id("nav-link-accountList")));
    public IMySelenideElement txtSearch = new AmazonElement($(By.id("twotabsearchtextbox")));
    public IMySelenideElement btnGo = new AmazonElement($(By.xpath("//input[@value='Go']")));

    public IMySelenideElement leftMenu = new AmazonElement( $(By.id("nav-hamburger-menu")));
        public IMySelenideElement btnSignOut = new AmazonElement($(By.linkText("Sign Out")));

    @Step("Sing out")
    public void singOut() {
        leftMenu.click();
        btnSignOut.click();
    }
}
