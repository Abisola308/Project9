package stepdefs;

import PageObject.LoginPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepdef {

   public static WebDriver driver;

    LoginPageObject login;
    public LoginStepdef()
   {
       System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
       driver = new ChromeDriver();
       login = new LoginPageObject(driver);
   }



    @Given("^I navigate to www\\.giftrete\\.com$")
    public void i_navigate_to_www_giftrete_com() throws Throwable
    {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa.giftrete.com");
        driver.manage().window().maximize();
    }

    @When("^I click the login button$")
    public void i_click_the_login_button() throws Throwable
    {
        login.ClickSignInLink();
    }

    @When("^I fill my emailaddress in the emailaddress field \"([^\"]*)\"$")
    public void i_fill_my_emailaddress_in_the_emailaddress_field(String emailaddress) throws Throwable
    {
        login.EnterEmail();
    }

    @When("^I enter my password in the password field$")
    public void i_enter_my_password_in_the_password_field() throws Throwable
    {
        login.EnterPassWord();
    }

    @When("^I click sign in button$")
    public void i_click_sign_in_button() throws Throwable
    {
        login.ClickSignInButton();
    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable
    {
        login.AUserIsLoggedIn();
        driver.quit();
    }
}
