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
    public void selectProductSort(String sorting){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.selectProductFilter(sorting);

    }

    @And("User pick product Test.allTheThings T-Shirt Red")
    public void addtoCart(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickButtonAdd();

    }

    @And("User pick product Sauce Labs Onesie")
    public void addtoCart2(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickButtonAdd2();

    }

    @And("User checkout product")
    public void addtoCart3(){
        CartPage cartPage = new CartPage(webDriver);
        cartPage.clickCart();

    }

    @And("User verify that products in a cart list")
    public void verifyCartList(){
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayCheckOutPage());

    }

    @And("User remove Test.allTheThings T-Shirt Red from Cart")
    public void removeProduct(){
        CheckOut checkOut = new CheckOut(webDriver);
        checkOut.setRemoveProduct();

    }

    @And("User click checkout")
    public void checkoutProduct(){
        CheckOut checkOut = new CheckOut(webDriver);
        checkOut.clickCheckOut();
    }

    @Then("User already on check out overview page")
    public void verifyCheckOutInfoPage(){
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayCheckOutOverviewPage());

    }

    @When("User input {string} as firstname, input {string} as lastname, and input {string} as postcode")
    public void inputInformation(String fn, String ln, String pc){
        CheckOut checkOutPage = new CheckOut(webDriver);
        checkOutPage.setFirstName(fn);
        checkOutPage.setLastName(ln);
        checkOutPage.setPostalCode(pc);
        checkOutPage.clickContinue();

    }
    @Then("User already on checkout summary page")
    public void verifyCheckOutSummaryPage(){
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayCheckOutSumPage());

    }
    @And("User verify item total")
    public void verifyTotalCheckOutSummaryPage(){
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayTotal());
    }
    @And("User want to finish CheckOut in Cart")
    public void finishCheckout(){
        CheckOut checkOut = new CheckOut(webDriver);
        checkOut.clickFinish();
    }
    @Then("User has already on Complete checkout")
    public void verifyCoCompletePage(){
        CheckOut checkOut = new CheckOut(webDriver);
        Assert.assertTrue(checkOut.isDisplayThanks());
    }




}
