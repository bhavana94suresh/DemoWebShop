package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestHelperUtility {
    public WebDriver driver;

    /**page constructor**/

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**page Elements**/

    private final String _userName="//input[@id='Email']";
    @FindBy(xpath = _userName)  private WebElement userName;

    private final String _password="//input[@id='Password']";
    @FindBy(xpath = _password)  private WebElement password;

    private final String _loginButton="//input[@class='button-1 login-button']";
    @FindBy(xpath =_loginButton ) private WebElement loginButton;

    private final String _actualUserName="//div[@class='header-links']//a[@class='account']";
    @FindBy(xpath = _actualUserName) WebElement actualUserName;

    /**user action methods**/

    public void enterUserName(String uname){
       page.enterText(userName,uname);
    }

    public void enterPassword(String pwrd){
        page.enterText(password,pwrd);
    }

    public UserAccountPage clickOnLoginButton(){
        page.clickOnElement(loginButton);
        return new UserAccountPage(driver);
    }

    public String getActualUserName(){
        return page.getElementText(actualUserName);

    }

}
