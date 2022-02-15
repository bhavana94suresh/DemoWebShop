package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends TestHelperUtility {
    WebDriver driver;

    /**page Constructor**/
    public ProductPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**page elements **/

    private final String _addToCartMenu="add-to-cart-button-14";
    @FindBy(id =_addToCartMenu ) private WebElement addToCartMenu;

    private final String _shoppingCartMenu="//a[@class='ico-cart']//span[@class ='cart-label']";
    @FindBy(xpath =_shoppingCartMenu ) private WebElement shoppingCartMenu;

    /**user action methods **/

    public void clickOnAddToCart(){
        page.clickOnElement(addToCartMenu);
    }

    public ShoppingCartPage clickOnShoppingcartMenu(){
        page.clickOnElement(shoppingCartMenu);
        return new ShoppingCartPage(driver);
    }
}
