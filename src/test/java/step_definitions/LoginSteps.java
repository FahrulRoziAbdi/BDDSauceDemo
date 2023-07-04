package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.example.LoginFlow;

public class LoginSteps {

    public WebDriver webDriver;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password){
        LoginFlow loginFlow = new LoginFlow(webDriver);
        loginFlow.setUserName(userName);
        loginFlow.setPassword(password);
        loginFlow.clickLogin();
    }
    @Given("User already on login page")
    public void verifyLoginPage(){
        LoginFlow loginFlow = new LoginFlow(webDriver);
        Assert.assertTrue(loginFlow.verifyLoginPage());
    }
    @Then("User already on product page")
    public void verifyDashboard(){
        LoginFlow loginFlow = new LoginFlow(webDriver);
        Assert.assertTrue(loginFlow.verifyDshboard());
    }
    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        webDriver.quit();
    }
}
