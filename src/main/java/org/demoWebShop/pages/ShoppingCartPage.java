package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends TestHelperUtility {
    WebDriver driver;

    /**page Constructor**/
    public ShoppingCartPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**page elements **/

    private final String _product="product-name";
    @FindBy(className =_product) private WebElement product;

    /** user action method**/

    public String getProductList(){
        return page.getElementText(product);
    }
}
