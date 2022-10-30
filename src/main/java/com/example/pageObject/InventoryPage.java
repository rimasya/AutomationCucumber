package com.example.pageObject;

import cucumber.api.java.ca.I;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import javax.naming.Name;
public class InventoryPage {

    public static WebDriver driver;
    public InventoryPage (WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement product;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement shirt1;
    @FindBy(id ="add-to-cart-sauce-labs-onesie" )
    private WebElement shirt2;
    @FindBy(css = ".shopping_cart_link" )
    private WebElement shoppingchart;
    @FindBy(id = "checkout")
    private WebElement checkout;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement remove;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstname;
    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastname;
    @FindBy(name = "postalCode")
    private WebElement code;
    @FindBy(id = "continue" )
    private WebElement continueshop;
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemtotal;
    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;
    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;
    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish;
    @FindBy(css = ".complete-header")
    private WebElement success;

    public void setProduct (String sortProduct){
        product.click();
        Select a = new Select(product);
        a.selectByVisibleText(sortProduct);
    }
    public void clickShirt1(){
        shirt1.click();
    }
    public void clickShirt2(){
        shirt2.click();
    }
    public void shopChart(){
        shoppingchart.click();
    }
    public void remove(){
        remove.click();
    }
    public void Checkout(){
        checkout.click();
    }
    public void setFirstname(String user){
        firstname.sendKeys(user);
    }
    public void setLastname(String user){
        lastname.sendKeys(user);
    }
    public void setCode(String user){
        code.sendKeys(user);
    }
    public void Continue(){
        continueshop.click();
    }
    public String itemTotal(){
        return itemtotal.getText();
    }

    public String tax(){return tax.getText();}
    public String setTotal(){
        return total.getText();
    }
    public void setFinish(){
        finish.click();
    }
    public String success(){
        return success.getText();
    }

}
