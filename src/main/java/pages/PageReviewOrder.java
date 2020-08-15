package pages;

import elements.AmazonElement;
import elements.IMySelenideElement;
import elements.SearchElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PageReviewOrder extends PageCommon {

    public IMySelenideElement btnAddToBasket = new AmazonElement($(By.id("add-to-cart-button")));

    @Step("Add order to basket")
    public void addToBasket() {
        btnAddToBasket.click();

        sleep(2000);
        if ($(By.id("attach-sidesheet-view-cart-button")).exists()) {
            $(By.id("attachSiNoCoverage-announce")).click();
            $(By.xpath("//input[@class='a-button-input']")).click();
        } else if ($(By.id("hlb-view-cart-announce")).exists()) {
            $(By.id("hlb-view-cart-announce")).click();
        } else if ($(By.id("siNoCoverage-announce")).exists()) {
            $(By.id("siNoCoverage-announce")).click();
            $(By.id("hlb-view-cart-announce")).click();
        } else if ($(By.id("add-to-cart-button")).exists()) {
            $(By.id("add-to-cart-button")).click();
            $(By.id("attachSiAddCoverage-announce")).click();
            $(By.xpath("//input[@class='a-button-input']")).click();
        }
    }

}
