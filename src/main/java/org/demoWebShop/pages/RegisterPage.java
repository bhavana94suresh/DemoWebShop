package org.demoWebShop.pages;

import org.demoWebShop.utilities.TestHelperUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class RegisterPage extends TestHelperUtility {
    public WebDriver driver;

    /**page constructor**/

    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /** page Elements **/
    private final String _gender="//div[@class='gender']";
    @FindBy(xpath = _gender) private List<WebElement> gender;

    private final String _firstName="FirstName";
    @FindBy(id = _firstName) private WebElement firstName;

    private final String _lastName="LastName";
    @FindBy(id = _lastName) private WebElement lastname;

    private final String _email="Email";
    @FindBy(id = _email) private WebElement email;

    private final String _password="Password";
    @FindBy(id = _password) private WebElement password;

    private final String _confirmPassword="ConfirmPassword";
    @FindBy(id = _confirmPassword) private WebElement confirmPassword;

    private final String _registerButton="register-button";
    @FindBy(id =_registerButton ) private WebElement registerButton;

    /** user action Methods**/

    public void selectGender(String gen) {
        for(int i=0;i<gender.size();i++) {
            String value=gender.get(i).getText();
            if(value.equals(gender)){
                page.clickOnElement(gender.get(i));
                break;
            }
        }
    }

    public void enterFirstname(String Fname){
        page.enterText(firstName, Fname);
        }

        public void enterLastName(String lname){
        page.enterText(lastname,lname);
        }

        public void enterEmail(String emailValue){
        page.enterText(email,emailValue);
        }

        public void enterPassword(String pwd){
        page.enterText(password,pwd);
        }


    public void enterConfirmPassword(String pwd){
        page.enterText(confirmPassword,pwd);
    }

        public UserAccountPage clickOnRegisterButton(){
        page.clickOnElement(registerButton);
        return new UserAccountPage(driver);
        }
    }




