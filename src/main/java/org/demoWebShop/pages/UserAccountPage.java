package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UserAccountPage extends TestHelperUtility {
    WebDriver driver;

    /**page Constructor**/
    public UserAccountPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public  void getUserAccountMail(){

    }
}
