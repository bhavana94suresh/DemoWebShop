package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    private final String _registerMenu="//a[@class='ico-register']";
    @FindBy(xpath = _registerMenu) private WebElement registerMenu;

    private final String _jewelleryMenu="top-menu-triangle";
    @FindBy(className = _jewelleryMenu) private List<WebElement> jewelleryMenu;

    /**user Action Methods**/

    public String getHomePageTitle(){
        String title=page.getPageTitleValue(driver);
        return title;
    }

    public LoginPage clickOnLoginMenu() {
        page.clickOnElement(loginMenu);
        return new LoginPage(driver);
    }

    public RegisterPage clickOnRegisterMenu(){
        page.clickOnElement(registerMenu);
       return new RegisterPage(driver) ;
    }

    public ProductListpage clickProductMenu(String text) {
        for (int i = 0; i < jewelleryMenu.size(); i++) {
            String value = jewelleryMenu.get(i).getText();
            if (value.equals(text)) {
                page.clickOnElement(jewelleryMenu.get(i));
                break;
            }
        }
        return new ProductListpage(driver);
    }
}
