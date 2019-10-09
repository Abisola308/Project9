package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageObject {

    public LoginPageObject(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using ="a[href=\"/account/authentication?ref=1\"]")
    public WebElement signin;

    @FindBy(how = How.ID, using = "user_email")
    public WebElement email;

    @FindBy(how = How.ID, using = "user_password")
    public WebElement password;

    @FindBy(how = How.ID, using = "btn_signin")
    public WebElement signinbutton;

    @FindBy(how = How.CSS, using = "#all-communities div > div > div > div:nth-child(2) > h2")
    public WebElement loggedin;


    public void ClickSignInLink() { signin.click(); }
    public void EnterEmail(){ email.sendKeys("ogunnaikebisola@yahoo.com");}
    public void EnterPassWord(){password.sendKeys("Nigeria2014");}
    public  void ClickSignInButton(){signinbutton.click();}
    public void AUserIsLoggedIn()
    {
        Assert.assertEquals(loggedin.getText(),"Ogunnaike Abisola");
    }



}
