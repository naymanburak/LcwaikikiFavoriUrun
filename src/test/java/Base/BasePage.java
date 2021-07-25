package Base;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

public class BasePage extends BaseTest {

    WebDriverWait driverWait = new WebDriverWait(driver, 60);


    public void listElements(String xpath) throws InterruptedException { //Elemenetler Listeleniyor
        List<WebElement> li = driver.findElements(By.xpath(xpath));
        li.get(0).click();
        Thread.sleep(500);
        li.get(1).click();
        Thread.sleep(500);
        li.get(2).click();
        return;
    }

    public void assertionUrl(String link) {
        Assert.assertEquals(link, driver.getCurrentUrl());
    }

    public WebElement findElement(By by) {
        driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return driver.findElement(by);
    }

    public void hoverElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void click(By by) {
        driverWait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void waitForSecond(int x) throws InterruptedException {
        Thread.sleep(1000 * x);
    }

    public void check(String check, String text) {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(check)));
        Assert.assertEquals(text, driver.findElement(By.xpath(check)).getText());
    }

    public void checkXpath(By check, String x) {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(check));
        Assert.assertEquals(x, driver.findElement(check).getText());
    }

}
