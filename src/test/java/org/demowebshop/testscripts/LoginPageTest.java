package org.demowebshop.testscripts;

import org.demoWebShop.automationcore.Base;
import org.demoWebShop.pages.HomePage;
import org.demoWebShop.pages.LoginPage;
import org.demoWebShop.pages.UserAccountPage;
import org.demoWebShop.utilities.ExcelUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends Base  {
    HomePage home;
    LoginPage login;
    UserAccountPage userAccount;
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
       userAccount= login.clickOnLoginButton();
        String expectedEmail= uname;
        String actualEmail= userAccount.getUserAccountMail();
        Assert.assertEquals(actualEmail,expectedEmail,"ERROR::invalid UserLogin");
    }
}
