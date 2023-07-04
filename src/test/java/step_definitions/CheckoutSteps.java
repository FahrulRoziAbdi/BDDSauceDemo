package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.AddtoCartFlow;
import org.example.CheckoutFlow;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {
    public WebDriver webDriver;

    public CheckoutSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }


    @When("User sorting product list by {string}")
    public void selectProductSort(String sorting){
        AddtoCartFlow addtoCartFlow = new AddtoCartFlow(webDriver);
        addtoCartFlow.selectProductFilter(sorting);

    }

    @And("User pick product Test.allTheThings T-Shirt Red")
    public void addtoCart(){
        AddtoCartFlow addtoCartFlow = new AddtoCartFlow(webDriver);
        addtoCartFlow.clickButtonAdd();

    }

    @And("User pick product Sauce Labs Onesie")
    public void addtoCart2(){
        AddtoCartFlow addtoCartFlow = new AddtoCartFlow(webDriver);
        addtoCartFlow.clickButtonAdd2();

    }

    @Then("User checkout product")
    public void addtoCart3(){
        AddtoCartFlow addtoCartFlow = new AddtoCartFlow(webDriver);
        addtoCartFlow.clickCart();

    }

    @And("User verify that products in a cart list")
    public void verifyCartList(){
        CheckoutFlow checkoutFlow = new CheckoutFlow(webDriver);
        Assert.assertTrue(checkoutFlow.isDisplayCheckOutPage());

    }

    @And("User remove Test.allTheThings T-Shirt Red from Cart")
    public void removeProduct(){
        CheckoutFlow checkoutFlow = new CheckoutFlow(webDriver);
        checkoutFlow.setRemoveProduct();

    }

    @And("User click checkout")
    public void checkoutProduct(){
        CheckoutFlow checkoutFlow = new CheckoutFlow(webDriver);
        checkoutFlow.clickCheckOut();
    }

    @Then("User already on check out overview page")
    public void verifyCheckOutInfoPage(){
        CheckoutFlow checkoutFlow = new CheckoutFlow(webDriver);
        Assert.assertTrue(checkoutFlow.isDisplayCheckOutOverviewPage());

    }

    @When("User input {string} as firstname, input {string} as lastname, and input {string} as postcode")
    public void inputInformation(String fn, String ln, String pc){
        CheckoutFlow checkoutFlowPage = new CheckoutFlow(webDriver);
        checkoutFlowPage.setFirstName(fn);
        checkoutFlowPage.setLastName(ln);
        checkoutFlowPage.setPostalCode(pc);
        checkoutFlowPage.clickContinue();

    }
    @Then("User already on checkout summary page")
    public void verifyCheckOutSummaryPage(){
        CheckoutFlow checkoutFlow = new CheckoutFlow(webDriver);
        Assert.assertTrue(checkoutFlow.isDisplayCheckOutSumPage());

    }
    @And("User verify item total")
    public void verifyTotalCheckOutSummaryPage(){
        CheckoutFlow checkoutFlow = new CheckoutFlow(webDriver);
        Assert.assertTrue(checkoutFlow.isDisplayTotal());
    }
    @And("User want to finish CheckOut in Cart")
    public void finishCheckout(){
        CheckoutFlow checkoutFlow = new CheckoutFlow(webDriver);
        checkoutFlow.clickFinish();
    }
    @Then("User has already on Complete checkout")
    public void verifyCoCompletePage(){
        CheckoutFlow checkoutFlow = new CheckoutFlow(webDriver);
        Assert.assertTrue(checkoutFlow.isDisplayThanks());
    }




}
