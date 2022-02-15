package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

public class ProductListpage extends TestHelperUtility {
    WebDriver driver;

    /**page Constructor**/
    public ProductListpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**page elements **/

    private final String _sortByOption="products-orderby";
    @FindBy(id = _sortByOption) private List<WebElement>sortByOption;

    private final String _blackDaimond="//h2[@class='product-title']//a[@href='/black-white-diamond-heart']";
    @FindBy(xpath =_blackDaimond ) private WebElement blackDaimond;

    /**user action methods**/

    public void clickOnSortBy(String value) {
        for (int i=0;i<sortByOption.size();i++) {
            String val = sortByOption.get(i).getText();
            if (val.equals(sortByOption)) {
                page.selectDropDownByValue(sortByOption.get(i), value);
            }
        }
    }

    public ProductPage clickOnblackdaimond() {
        page.clickOnElement(blackDaimond);
        return new ProductPage(driver);
    }
}
