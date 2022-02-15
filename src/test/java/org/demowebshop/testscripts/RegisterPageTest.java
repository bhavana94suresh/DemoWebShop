package org.demowebshop.testscripts;

import org.demoWebShop.automationcore.Base;
import org.demoWebShop.pages.HomePage;
import org.demoWebShop.pages.LoginPage;
import org.demoWebShop.pages.RegisterPage;
import org.demoWebShop.pages.UserAccountPage;
import org.demoWebShop.utilities.ExcelUtility;
import org.demoWebShop.utilities.RandomDataUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RegisterPageTest extends Base {
    HomePage home;
    UserAccountPage userAccount;
    ExcelUtility excel=new ExcelUtility();
    RegisterPage register;
    RandomDataUtility randomData=new RandomDataUtility();

    @Test(priority = 1)
    public void verifyUserRegisteration(){
        home = new HomePage(driver);
        register= home.clickOnRegisterMenu();
        List<List<String>> data = excel.excelDataReader("registerPage");
        String gender=data.get(1).get(0);
        register.selectGender(gender);
        String fname=data.get(1).get(1);
        register.enterFirstname(fname);
        String lname=data.get(1).get(2);
        register.enterLastName(lname);
        String email= randomData.getRandomString("email");
        register.enterEmail(email);
        String pwd=data.get(1).get(3);
        register.enterPassword(pwd);
        register.enterConfirmPassword(pwd);
        userAccount=register.clickOnRegisterButton();
        String actualAccountmail=userAccount.getUserAccountMail();
        Assert.assertEquals(actualAccountmail,email,"invalid userLogin");
    }
}
