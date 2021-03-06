package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage extends TestHelperUtility {
    WebDriver driver;

    /**page Constructor**/
    public UserAccountPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**page Elements**/
    private final String _actualEmail="//div[@class='header-links']//a[@class='account']";
    @FindBy(xpath = _actualEmail) WebElement actualEmail;

   /**user action methods**/

    public  String getUserAccountMail(){
        return page.getElementText(actualEmail);
    }
}
