package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPageObj {


    public RegistrationPageObj(WebDriver driver)
    {
       PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "a[href=\"/account/authentication?ref=1\"]")
    public WebElement account;


    @FindBy(how = How.ID, using = "nav-register-tab")
    public WebElement register;

    @FindBy(how = How.ID, using = "first_name")
    public WebElement firstname;


    @FindBy(how = How.ID, using = "last_name")
    public WebElement lastname;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailaddress;

    @FindBy(how = How.ID, using = "mobile")
    public  WebElement mobile;

    @FindBy(how = How.ID, using = "password")
    public WebElement password;

    @FindBy(how = How.ID, using = "confirm_password")
    public  WebElement confirmpassword;


    @FindBy(how = How.CSS, using = "#btn_register")
    public  WebElement captcha;

    @FindBy(how = How.CSS, using = "#dng_msg > p")
    public WebElement errormessage;




    public void ClickOnAccount() { account.click(); }

    public void ClickOnRegister(){ register.click();}

    public void EnterFirstName(){ firstname.sendKeys("Bolu");}

    public void EnterLastName(){ lastname.sendKeys("Ola");}

    public void EnterEmailAddress() { emailaddress.sendKeys("boluola@yahoo.com"); }

    public void EnterMobileNumber(){mobile.sendKeys("+447985461549");}

    public  void EnterPassWord(){password.sendKeys("Dancing308");}

    public void EnterConfirmPassword(){confirmpassword.sendKeys("Dancing308");}

    public void ClickOnCaptcha(){captcha.click();}

    public void AnErrorMessage()
    {

        Assert.assertEquals(errormessage.getText(),"The Captcha field is required.");
        System.out.println("error_message_is_displayed_for_none_use_of_capcha()");


    }

}
