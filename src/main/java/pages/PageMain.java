package pages;

import elements.AmazonElement;
import elements.IMySelenideElement;
import elements.SearchElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PageMain extends PageCommon {

    public SearchElement result = new SearchElement($(new By.ByXPath("//span[@data-component-type='s-search-results']")));

}
