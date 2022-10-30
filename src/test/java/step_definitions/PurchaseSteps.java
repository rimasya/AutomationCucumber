package step_definitions;

import com.example.pageObject.InventoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver =Hooks.webDriver;
    }

    @Then("User sort product list on \"(.*)\"")
    public void selectProduct(String setProduct) throws InterruptedException{
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        Thread.sleep(2000);
        inventoryPage.setProduct(setProduct);
    }
    @And("User select 2 item")
    public void selectItem(){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.clickShirt1();
        inventoryPage.clickShirt2();
    }
    @And("User click shopping chart icon")
    public void shoppingChart(){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.shopChart();
    }
    @Then("User input \"(.*)\" as setFirstname and \"(.*)\" as setLastname and \"(.*)\" as setCode")
    public void inputCredential(String Firstname, String Lastname, String Code){
        InventoryPage inventoryPage= new InventoryPage(webDriver);
        inventoryPage.setFirstname(Firstname);
        inventoryPage.setLastname(Lastname);
        inventoryPage.setCode(Code);
    }
    @Then("User remove item in list shopping chart")
    public void remove(){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.remove();
    }
    @And("User checkout the item")
    public void checkout(){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.Checkout();
    }
    @And("User click continue")
    public void continueCheckout(){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.Continue();
    }
    @Then("User should get \"(.*)\" as expected Item total")
    public void itemTotal(String itemTotal) {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.itemTotal();
        Assert.assertEquals(itemTotal, inventoryPage.itemTotal());
    }
    @And("User should get \"(.*)\" as expected Tax")
    public void Tax (String tax){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.tax();
        Assert.assertEquals(tax, inventoryPage.tax());
    }
    @And("User should get \"(.*)\" as expected total")
    public void expectedTax(String expectedTotal){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.setTotal();
        Assert.assertEquals(expectedTotal, inventoryPage.setTotal());
    }
    @Then("User click finish")
    public void finish(){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.setFinish();
    }
    @Then("User will see \"(.*)\" as end")
    public void end (String success){
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.success();
        Assert.assertEquals(success, inventoryPage.success());
    }

}
