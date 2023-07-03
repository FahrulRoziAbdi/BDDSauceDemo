package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.example.LoginPage;

public class LoginSteps {

    public WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        Thread.sleep(1000);
        loginPage.setPassword(password);
        Thread.sleep(1000);
        loginPage.clickLogin();

    }


    @Given("User already on login page")
    public void verifyLoginPage(){
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @Then("User already on product page")
    public void verifyDashboard() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyDshboard());
        Thread.sleep(1000);
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        webDriver.quit();
    }
}
