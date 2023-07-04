package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddtoCartFlow {
    public static WebDriver driver;

    public AddtoCartFlow(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectFilter;
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement selectButtonAdd;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement selectButtonAdd2;
    @FindBy(className = "shopping_cart_link")
    private  WebElement buttonCart;

    public void selectProductFilter(String sorting){
        Select a = new Select(selectFilter);
        a.selectByVisibleText(sorting);
    }
    public void clickButtonAdd(){
        selectButtonAdd.click();
    }
    public void clickButtonAdd2(){
        selectButtonAdd2.click();
    }
    public void clickCart(){
        buttonCart.click();
    }


}
