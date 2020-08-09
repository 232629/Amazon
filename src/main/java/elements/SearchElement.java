package elements;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


public class SearchElement extends AmazonElement {

    public SearchElement(SelenideElement element) {
        super(element);
    }

    @Step("Get Results")
    public ElementsCollection getResults() {
        return element.$$(By.xpath(".//div[@data-component-type='s-search-result']/div"));
    }

    @Step("Get Results with {q}")
    public ElementsCollection getResults(String q)  {
        ElementsCollection r = getResults();
        if (!q.contains("pro"))
            r = r.filterBy(Condition.not(Condition.text("pro")));
        String[] words = q.split(" ");
        for (String w : words)
        {
            r = r.filterBy(Condition.text(w));
            r.shouldBe(CollectionCondition.sizeGreaterThan(0));
        }
        return r;
    }

    @Step("Get minimal Price with {q}")
    public AmazonElement getMinimalPrice(String q) {
        return new AmazonElement(getMinimalValue(getResults(q)));
    }

    @Step("Get minimal Price")
    public AmazonElement getMinimalPrice() {
        return new AmazonElement(getMinimalValue(getResults()));
    }

    private double getPrice(SelenideElement e) {
        String price = e.find(By.xpath(".//span[@class='a-price-whole']")).getText() + "." + e.find(By.xpath(".//span[@class='a-price-fraction']")).getText();
        return  Double.parseDouble(price.replace(",",""));
    }

    private SelenideElement getMinimalValue(ElementsCollection r) {
        int s = r.size();
        double minPrice = getPrice(r.get(0));
        SelenideElement el = r.get(0);

        for (int i=1; i<s; i++ )
        {
            double currentPrice = getPrice(r.get(i));
            if (minPrice > currentPrice) {
                minPrice = currentPrice;
                el = r.get(i);
            }
            System.out.println(currentPrice);
        }
        System.out.println(minPrice);
        return el.find(By.xpath(".//span[@class='a-price-whole']"));
    }


}
