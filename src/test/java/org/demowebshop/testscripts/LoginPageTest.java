package org.demowebshop.testscripts;

import org.demoWebShop.automationcore.Base;
import org.demoWebShop.pages.HomePage;
import org.demoWebShop.pages.LoginPage;
import org.demoWebShop.utilities.ExcelUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends Base  {
    HomePage home;
    LoginPage login;
    ExcelUtility excel=new ExcelUtility();

    @Test(priority = 1)
    public void verifyValidLogin() {
        home = new HomePage(driver);
        login = home.clickOnLoginMenu();
        List<List<String>> data = excel.excelDataReader("loginPage");
        String uname = data.get(1).get(0);
        login.enterUserName(uname);
        String pwrd = data.get(1).get(1);
        login.enterPassword(pwrd);
        login.clickOnLoginButton();
        verifyLogin();
    }

    public void verifyLogin(){
        login=new LoginPage(driver);
        List<List<String>> data1 = excel.excelDataReader("loginPage");
        String expectedUserName= data1.get(1).get(0);
        String actualUsername= login.getActualUserName();
        Assert.assertEquals(actualUsername,expectedUserName,"ERROR::invalid HomePage Title");
    }

}
