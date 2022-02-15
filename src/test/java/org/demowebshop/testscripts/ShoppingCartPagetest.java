package org.demowebshop.testscripts;

import org.demoWebShop.automationcore.Base;
import org.demoWebShop.pages.HomePage;
import org.demoWebShop.pages.ProductListpage;
import org.demoWebShop.pages.ProductPage;
import org.demoWebShop.pages.ShoppingCartPage;
import org.demoWebShop.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ShoppingCartPagetest extends Base {
    HomePage home;
    ExcelUtility excel=new ExcelUtility();
    ProductPage productPage;
    ProductListpage productList;
    ShoppingCartPage shoppingCart;

@Test(priority = 1)
public void verifyProductAddedInShoppingCart() {
    List<List<String>> data = excel.excelDataReader("jewelleryPage");
    String option = data.get(1).get(0);
    productList = home.clickProductMenu(option);
    String value = data.get(2).get(1);
    productList.clickOnSortBy(value);
    productPage = productList.clickOnblackdaimond();
    productPage.clickOnAddToCart();
    shoppingCart = productPage.clickOnShoppingcartMenu();
    String productname = shoppingCart.getProductList();
    String expectedValue = "Black & White Diamond Heart";
    Assert.assertEquals(productname, expectedValue, "ERROR::cart mismatch");
    }
}
