package elements;

import com.codeborne.selenide.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Coordinates;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public abstract class MySelenideElement implements IMySelenideElement {

    protected SelenideElement element;
    public MySelenideElement(SelenideElement element) {
        this.element = element;
    }

    @Override
    public SelenideElement setValue(String s) {
        return element.setValue(s);
    }

    @Override
    public SelenideElement val(String s) {
        return element.val(s);
    }

    @Override
    public SelenideElement append(String s) {
        return element.append(s);
    }

    @Override
    public SelenideElement pressEnter() {
        return element.pressEnter();
    }

    @Override
    public SelenideElement pressTab() { return element.pressTab(); }

    @Override
    public SelenideElement pressEscape() {
        return element.pressEscape();
    }

    @Override
    public String getText() {
        return element.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return element.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return element.findElement(by);
    }

    @Override
    public String text() {
        return element.text();
    }

    @Override
    public String innerText() {
        return element.innerText();
    }

    @Override
    public String innerHtml() {
        return element.innerHtml();
    }

    @Override
    public String attr(String s) {
        return element.attr(s);
    }

    @Override
    public String name() {
        return element.name();
    }

    @Override
    public String val() {
        return element.val();
    }

    @Override
    public String getValue() {
        return element.getValue();
    }

    @Override
    public SelenideElement selectRadio(String s) {
        return element.selectRadio(s);
    }

    @Override
    public String data(String s) {
        return element.data(s);
    }

    @Override
    public boolean exists() {
        return element.exists();
    }

    @Override
    public boolean isDisplayed() {
        return element.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return element.getLocation();
    }

    @Override
    public Dimension getSize() {
        return element.getSize();
    }

    @Override
    public Rectangle getRect() {
        return element.getRect();
    }

    @Override
    public String getCssValue(String s) {
        return element.getCssValue(s);
    }

    @Override
    public boolean is(Condition condition) {
        return element.is(condition);
    }

    @Override
    public boolean has(Condition condition) {
        return element.has(condition);
    }

    @Override
    public SelenideElement setSelected(boolean b) {
        return element.setSelected(b);
    }

    @Override
    public SelenideElement should(Condition... conditions) {
        return element.should(conditions);
    }

    @Override
    public SelenideElement shouldHave(Condition... conditions) {
        return element.shouldHave(conditions);
    }

    @Override
    public SelenideElement shouldBe(Condition... conditions) {
        return element.shouldBe(conditions);
    }

    @Override
    public SelenideElement shouldNot(Condition... conditions) {
        return element.shouldNot(conditions);
    }

    @Override
    public SelenideElement shouldNotHave(Condition... conditions) {
        return element.shouldNotHave(conditions);
    }

    @Override
    public SelenideElement shouldNotBe(Condition... conditions) {
        return element.shouldNotBe(conditions);
    }

    @Override
    public SelenideElement waitUntil(Condition condition, long l) {
        return element.waitUntil(condition, l);
    }

    @Override
    public SelenideElement waitUntil(Condition condition, long l, long l1) {
        return element.waitUntil(condition, l, l1);
    }

    @Override
    public SelenideElement waitWhile(Condition condition, long l) {
        return element.waitWhile(condition, l);
    }

    @Override
    public SelenideElement waitWhile(Condition condition, long l, long l1) {
        return element.waitWhile(condition, l, l1);
    }

    @Override
    public SelenideElement parent() {
        return element.parent();
    }

    @Override
    public SelenideElement lastChild() {
        return element.lastChild();
    }

    @Override
    public SelenideElement closest(String s) {
        return element.closest(s);
    }

    @Override
    public SelenideElement find(String s) {
        return element.find(s);
    }

    @Override
    public SelenideElement find(String s, int i) {
        return element.find(s, i);
    }

    @Override
    public SelenideElement find(By by) {
        return element.find(by);
    }

    @Override
    public SelenideElement find(By by, int i) {
        return element.find(by, i);
    }

    @Override
    public SelenideElement $(String s) {
        return element.$(s);
    }

    @Override
    public SelenideElement $(String s, int i) {
        return element.$(s, i);
    }

    @Override
    public SelenideElement $(By by) {
        return element.$(by);
    }

    @Override
    public SelenideElement $(By by, int i) {
        return element.$(by, i);
    }

    @Override
    public SelenideElement $x(String s) {
        return element.$x(s);
    }

    @Override
    public SelenideElement $x(String s, int i) {
        return element.$x(s, i);
    }

    @Override
    public ElementsCollection findAll(String s) {
        return element.findAll(s);
    }

    @Override
    public ElementsCollection findAll(By by) {
        return element.findAll(by);
    }

    @Override
    public ElementsCollection $$(String s) {
        return element.$$(s);
    }

    @Override
    public ElementsCollection $$(By by) {
        return element.$$(by);
    }

    @Override
    public ElementsCollection $$x(String s) {
        return element.$$x(s);
    }

    @Override
    public File uploadFromClasspath(String... strings) {
        return element.uploadFromClasspath(strings);
    }

    @Override
    public File uploadFile(File... files) {
        return element.uploadFile(files);
    }

    @Override
    public void selectOption(int... ints) {
        element.selectOption(ints);
    }

    @Override
    public void selectOption(String... strings) {
        element.selectOption(strings);
    }

    @Override
    public void selectOptionContainingText(String s) {
        element.selectOptionContainingText(s);
    }

    @Override
    public void selectOptionByValue(String... strings) {
        element.selectOptionByValue(strings);
    }

    @Override
    public SelenideElement getSelectedOption() throws NoSuchElementException {
        return element.getSelectedOption();
    }

    @Override
    public ElementsCollection getSelectedOptions() {
        return element.getSelectedOptions();
    }

    @Override
    public String getSelectedValue() {
        return element.getSelectedValue();
    }

    @Override
    public String getSelectedText() {
        return element.getSelectedText();
    }

    @Override
    public SelenideElement scrollTo() {
        return element.scrollTo();
    }

    @Override
    public SelenideElement scrollIntoView(boolean b) {
        return element.scrollIntoView(b);
    }

    @Override
    public SelenideElement scrollIntoView(String s) {
        return element.scrollIntoView(s);
    }

    @Override
    public File download() throws FileNotFoundException {
        return element.download();
    }

    @Override
    public File download(long l) throws FileNotFoundException {
        return element.download(l);
    }

    @Override
    public String getSearchCriteria() {
        return element.getSearchCriteria();
    }

    @Override
    public WebElement toWebElement() {
        return element.toWebElement();
    }

    @Override
    public WebElement getWrappedElement() {
        return element.getWrappedElement();
    }

    @Override
    public void click() { element.click(); }

    @Override
    public void submit() {
        element.submit();
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        element.sendKeys(charSequences);
    }

    @Override
    public void clear() {
        element.clear();
    }

    @Override
    public String getTagName() {
        return element.getTagName();
    }

    @Override
    public String getAttribute(String s) {
        return element.getAttribute(s);
    }

    @Override
    public boolean isSelected() {
        return element.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return element.isEnabled();
    }

    @Override
    public void click(int i, int i1) {
        element.click(i, i1);
    }

    @Override
    public SelenideElement contextClick() {
        return element.contextClick();
    }

    @Override
    public SelenideElement doubleClick() {
        return element.doubleClick();
    }

    @Override
    public SelenideElement hover() {
        return element.hover();
    }

    @Override
    public SelenideElement dragAndDropTo(String s) {
        return element.dragAndDropTo(s);
    }

    @Override
    public SelenideElement dragAndDropTo(WebElement webElement) {
        return element.dragAndDropTo(webElement);
    }

    @Override
    public <ReturnType> ReturnType execute(Command<ReturnType> command) {
        return element.execute(command);
    }

    @Override
    public boolean isImage() {
        return element.isImage();
    }

    @Override
    public File screenshot() {
        return element.screenshot();
    }

    @Override
    public BufferedImage screenshotAsImage() {
        return element.screenshotAsImage();
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return element.getScreenshotAs(outputType);
    }

    @Override
    public WebDriver getWrappedDriver() {
        return element.getWrappedDriver();
    }

    @Override
    public Coordinates getCoordinates() {
        return element.getCoordinates();
    }

    @Override
    public String pseudo(String s, String s1) { return element.pseudo(s, s1); }

    @Override
    public String pseudo(String s) { return element.pseudo(s); }

    @Override
    public SelenideElement sibling(int i) { return element.sibling(i); }

    @Override
    public SelenideElement preceding(int i) { return element.preceding(i); }

    //My functions
    @Override
    public void myMethod() { throw  new NotImplementedException(); }

    @Override
    public void clickJs() {
        JavascriptExecutor executor = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        executor.executeScript("arguments[0].click();", element);
    }

}
