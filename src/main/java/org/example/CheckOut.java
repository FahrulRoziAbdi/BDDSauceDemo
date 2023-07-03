package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class CheckOut {
    public static WebDriver driver;

    public CheckOut(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private  WebElement btnremoveProduct;
    @FindBy(xpath = "//span[.='Your Cart']")
    private WebElement displayCheckOutPage;
    @FindBy(id = "checkout")
    private WebElement btnCheckOut;
    @FindBy(xpath = "//span[.='Checkout: Your Information']")
    private WebElement displayCheckOutOverviewPage;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    @FindBy(id = "continue")
    private WebElement btnContinue;
    @FindBy(xpath = "//span[.='Checkout: Overview']")
    private WebElement displayCheckOutSumPage;
    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement displayTotal;
    @FindBy(id = "finish")
    private WebElement btnFinish;
    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement displayThanks;


    public void clickCheckOut(){
        btnCheckOut.click();
    }
    public void setRemoveProduct(){
        btnremoveProduct.click();
    }

    public void setFirstName(String fname){
        firstName.sendKeys(fname);
    }

    public void setLastName(String lname){
        lastName.sendKeys(lname);
    }

    public void setPostalCode(String pcode){
        postalCode.sendKeys(pcode);
    }

    public void clickContinue(){
        btnContinue.click();
    }

    public void clickFinish(){
        btnFinish.click();
    }
    public boolean isDisplayCheckOutPage(){
        return displayCheckOutPage.isDisplayed();
    }
    public boolean isDisplayCheckOutOverviewPage(){
        return displayCheckOutOverviewPage.isDisplayed();
    }
    public boolean isDisplayCheckOutSumPage(){
        return displayCheckOutSumPage.isDisplayed();
    }
    public boolean isDisplayTotal() {
        return displayTotal.isDisplayed();
    }
    public boolean isDisplayThanks() {
        return displayThanks.isDisplayed();
    }





}
