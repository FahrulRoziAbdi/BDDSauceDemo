package step_definitions;

import com.sun.tools.javac.comp.Check;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.CartPage;
import org.example.CheckOut;
import org.example.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartSteps {
    public WebDriver webDriver;

    public CartSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }


    @When("User sorting product list by {string}")
    public void selectProductSort(String sorting) throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.selectProductFilter(sorting);
        Thread.sleep(1000);
    }

    @And("User pick product Test.allTheThings T-Shirt Red")
    public void AddtoCart() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickButtonAdd();
        Thread.sleep(1000);
    }

    @And("User pick product Sauce Labs Onesie")
    public void AddtoCart2() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickButtonAdd2();
        Thread.sleep(1000);
    }

    @And("User checkout product")
    public void AddtoCart3() throws InterruptedException {
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCart();
        Thread.sleep(1000);
    }

    @And("User verify that products in a cartlist")
    public void verifyCartList() throws InterruptedException {
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayCheckOutPage());
        Thread.sleep(2000);
    }

    @Then("User remove Test.allTheThings T-Shirt Red from Cart")
    public void removeProduct() throws InterruptedException {
        CheckOut checkOut = new CheckOut(webDriver);
        checkOut.setRemoveProduct();
        Thread.sleep(1000);
    }

    @And("User click checkout")
    public void checkoutProduct() {
        CheckOut checkOut = new CheckOut(webDriver);
        checkOut.clickCheckOut();
    }

    @Then("User already on check out overview page")
    public void verifyCheckOutInfoPage() throws InterruptedException {
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayCheckOutOverviewPage());
        Thread.sleep(2000);
    }

    @And("User input {string} as firstname, input {string} as lastname, and input {string} as postcode")
    public void inputInformation(String fn, String ln, String pc) throws InterruptedException {
        CheckOut checkOutPage = new CheckOut(webDriver);
        checkOutPage.setFirstName(fn);
        Thread.sleep(1000);
        checkOutPage.setLastName(ln);
        Thread.sleep(1000);
        checkOutPage.setPostalCode(pc);
        Thread.sleep(1000);
        checkOutPage.clickContinue();

    }
    @Then("User already on checkout summary page")
    public void verifyCheckOutSummaryPage() throws InterruptedException {
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayCheckOutSumPage());
        Thread.sleep(1000);
    }
    @And("User verify item total")
    public void verifyTotalCheckOutSummaryPage() throws InterruptedException {
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayTotal());
        Thread.sleep(2000);
    }
    @Then("User want to finish CheckOut in Cart")
    public void finishCheckout() throws InterruptedException {
        CheckOut checkOut = new CheckOut(webDriver);
        checkOut.clickFinish();
        Thread.sleep(1000);
    }
    @Then("User has already on Complete the checkout")
    public void verifyCoCompletePage(){
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayThanks());
    }




}
