package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestHelperUtility {
    WebDriver driver;

    /**page Constructor**/
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**page elements **/
    private final String _loginMenu="//a[@class='ico-login']";
    @FindBy(xpath =_loginMenu )
    private WebElement loginMenu;

    /**user Action Methods**/

    public String getHomePageTitle(){
        String title=page.getPageTitleValue(driver);
        return title;
    }

    public LoginPage clickOnLoginMenu() {
        page.clickOnElement(loginMenu);
        return new LoginPage(driver);
    }
}
