package pages;

import elements.AmazonElement;
import elements.IMySelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageBasket extends PageCommon {
    public IMySelenideElement btnDelete = new AmazonElement($(By.xpath("//input[@data-action='delete']")));
}
