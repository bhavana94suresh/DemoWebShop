package org.demoWorkShop.utilities;

import com.sun.java.swing.plaf.windows.resources.windows;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.Iterator;
import java.util.Set;

public class PageUtility {

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public void enterText(WebElement element, String value) {
        element.sendKeys(value);
    }

    public String getElementText(WebElement element) {
        return element.getText();
    }

    public String getAttributeValue(WebElement element, String attribute) {
        return element.getAttribute(attribute);
    }

    public String getTagName(WebElement element) {
        return element.getTagName();
    }

    public Dimension getElementSize(WebElement element) {
        return element.getSize();
    }

    public void selectDropDownByText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectDropDownByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    public void selectDropDownByVisibleValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectDropDownByIsMultiple(WebElement element) {
        Select select = new Select(element);
        select.isMultiple();
    }

    public void DropDownByDeselectAll(WebElement element) {
        Select select = new Select(element);
        select.deselectAll();
    }

    public void deselectDropDownByByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByValue(value);
    }

    public void deselectDropDownByIndex(WebElement element, int value) {
        Select select = new Select(element);
        select.deselectByIndex(value);
    }

    public void deselectDropDownByText(WebElement element, String value) {
        Select select = new Select(element);
        select.deselectByVisibleText(value);
    }

    public void acceptAlert(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String alertGetText(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public void alertDismiss(WebDriver driver) {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void alertPrompt(WebDriver driver, String value) {

        Alert alert = driver.switchTo().alert();
        alert.sendKeys(value);
    }

    public void doubleClick(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element).build().perform();
    }

    public void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        Actions action = new Actions(driver);
        action.dragAndDrop(source, target).build().perform();
    }

    public void dragAndDropByDragBy(WebElement source, WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(source, x, y);

    }

    public void clickAndHold(WebDriver driver, WebElement drag, WebElement drop) {
        Actions action = new Actions(driver);
        action.clickAndHold(drag).moveToElement(drop).build().perform();
    }


    public void moveToElement(WebDriver driver, WebElement drag, WebElement drop) {
        Actions action = new Actions(driver);
        action.moveToElement(drop).build().perform();
    }

    public void mouseRightClick(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.contextClick(element);
    }

    public void navigateForward(WebDriver driver) {
        driver.navigate().forward();
    }

    public void navigateBackward(WebDriver driver) {
        driver.navigate().back();
    }

    public void navigateRefresh(WebDriver driver) {
        driver.navigate().refresh();
    }

    public void navigateToNextPage(WebDriver driver, String url) {
        driver.navigate().to(url);
    }

    public void frameByIndex(WebDriver driver, int i) {
        Frame frame = new Frame();
        driver.switchTo().frame(i);
    }

    public void frameByNameOrId(WebDriver driver, String value) {
        Frame frame = new Frame();
        driver.switchTo().frame(value);
    }

    public void frameByWebElement(WebDriver driver, WebElement element) {
        Frame frame = new Frame();
        driver.switchTo().frame(element);
    }

    public String windowHandlesTogetParent(WebDriver driver) {
        return driver.getWindowHandle();

    }

    public Set<String> windowHandlesToGetChild(WebDriver driver) {
        return driver.getWindowHandles();
    }
}


