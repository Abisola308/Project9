package stepdefs;

import PageObject.RegistrationPageObj;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationStepdef {


    public static WebDriver driver;
    RegistrationPageObj registration;

    public RegistrationStepdef()
    {
      System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
      driver = new ChromeDriver();
      registration = new RegistrationPageObj(driver);
    }



    @Given("^I navigate to Giftrete website$")
    public void i_navigate_to_Giftrete_website() throws Throwable
    {
        driver.get("https://qa.giftrete.com");
        driver.manage().window().maximize();

    }

    @When("^I click on create account$")
    public void i_click_on_create_account() throws Throwable
    {
        registration.ClickOnAccount();
    }

    @When("^I click on register button$")
    public void i_click_on_register_button() throws Throwable
    {
        registration.ClickOnRegister();
    }

    @When("^I enter first name in the name textbox$")
    public void i_enter_first_name_in_the_name_textbox() throws Throwable
    {
        registration.EnterFirstName();
    }

    @When("^I enter last name in the last name field$")
    public void i_enter_last_name_in_the_last_name_field() throws Throwable
    {
        registration.EnterLastName();
    }

    @When("^I enter an email$")
    public void i_enter_an_email() throws Throwable
    {
        registration.EnterEmailAddress();
    }

    @When("^I enter mobile number \"([^\"]*)\"$")
    public void i_enter_mobile_number(String MobileNumber) throws Throwable
    {
        registration.EnterMobileNumber();
    }

    @When("^I enter password$")
    public void i_enter_password() throws Throwable
    {
        registration.EnterPassWord();
    }

    @When("^I confirm password$")
    public void i_confirm_password() throws Throwable
    {
        registration.EnterConfirmPassword();
    }

    @Then("^I bypasses capcha and click on the register link button$")
    public void i_bypasses_capcha_and_click_on_the_register_link_button() throws Throwable
    {
        registration.ClickOnCaptcha();
    }

    @Then("^error message is displayed for none use of capcha$")
    public void error_message_is_displayed_for_none_use_of_capcha() throws Throwable
    {
        Thread.sleep(1500);
        registration.AnErrorMessage();
        driver.quit();

    }

}
