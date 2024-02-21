package com.business.mlshop;

import static com.utility.ExtentReporter.CTCurrentTime;
import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.ExtentReporter.ReportName;
import static com.utility.ExtentReporter.buildVersion;
import static com.utility.ExtentReporter.extent;
import static com.utility.ExtentReporter.extentLogger;
import static com.utility.ExtentReporter.fileName;
import static com.utility.ExtentReporter.filePath;
import static com.utility.ExtentReporter.getWebDriver;
import static com.utility.Utilities.*;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.MLShopPageObjects.Home_page; 
import com.MLShopPageObjects.Shopping_Cart;
import com.MLShopPageObjects.Shipping_Details;
import com.utility.ExtentReporter;

public class ShippingDetails extends BaseClass{

    private Home home = new Home();
    private ShoppingCart cart = new ShoppingCart();

    public void shippingPage_navigation()throws Exception {
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        home.addItemToCart("Jewelry", 1);
        cart.navigateShoppingCart();
        click(Shopping_Cart.Checkout_Btn, "Checkout");
        waitTime(2000);
    }
    public void shippingPageItemChecker(String type)throws Exception{
        String[] itemInfo = home.addItemToCart(type, 2);
        cart.navigateShoppingCart();
        click(Shopping_Cart.Checkout_Btn, "Checkout");
        waitTime(2000);
        WebElement shoppingCart = findElement(Shipping_Details.getProductDescriptions());
        List<WebElement> itemDescriptions = shoppingCart.findElements(Shipping_Details.getProductDescriptions());
        boolean itemFound = false;
        for (WebElement item : itemDescriptions) {
            if (item.getText().contains(itemInfo[0])) {
                itemFound = true;
                break;
            }
        }
        if (itemFound) {
        logger.info("Found item : " + itemInfo[0]);
            ExtentReporter.extentLoggerPass("", "Items are present in shipping details page");
        } else {
            ExtentReporter.extentLoggerFail("", "Failed to retrieve items are present in shipping details page");
        }
    }
    public void MLS_TC_98_Validate_shippingDetails_pageNavigation()throws Exception {
        HeaderChildNode("MLS_TC_98, To Validate shipping details navigation after clicking a product from Jewelry tab home page");       
        shippingPage_navigation();
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("ShippingLink"));
        if(verifyElementPresent(Shipping_Details.objProductsOrdered, "Product Ordererd Text")){
            ExtentReporter.extentLoggerPass("MLS_TC_98", "Successfully Validated Shipping Page Navigation");        
        }else{
            ExtentReporter.extentLoggerFail("MLS_TC_98", "Failed to Validate Shipping Page Navigation");
        }
    }
    public void MLS_TC_99_Validate_shippingDetails_itemsVisiblity_jewlery() throws Exception {
        HeaderChildNode("MLS_TC_99, To Validate shipping details jewelry items are present in shipping details page and is under mlshop jewelry store");
        shippingPageItemChecker("Jewelry");
        extentLogger("MLS_TC_99", "Successfully Validated Shipping items are present in shipping details page and is under mlshop");
    }
    public void MLS_TC_100_Validate_shippingDetails_itemsVisiblity_watch() throws Exception {
        HeaderChildNode("MLS_TC_100, To Validate shipping details watch items are present in shipping details page and is under mlshop jewelry store");
        shippingPageItemChecker("Watch");
        extentLogger("MLS_TC_100", "Successfully Validated Shipping watch are present in shipping details page and is under mlshop");
    }
    public void MLS_TC_124_Validate_shippingDetails_itemsVisiblity_amparito() throws Exception {
        HeaderChildNode("MLS_TC_124, To Validate shipping details amparito items are present in shipping details page and is under mlshop jewelry store");
        shippingPageItemChecker("Amparito");
        extentLogger("MLS_TC_124", "Successfully Validated Shipping amparito are present in shipping details page and is under mlshop");
    }
    public void MLS_TC_101_Validate_shippingDetails_accInfoFields() throws Exception {
        HeaderChildNode("MLS_TC_101, To Validate shipping details accInfoFields are present in shipping details page");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(3000);
    
        boolean requiredMessageDisplayed = verifyElementDisplayed(Shipping_Details.getIsRequired(), "Required Message");
        if (requiredMessageDisplayed) {
            ExtentReporter.extentLoggerFail("MLS_TC_101", "Fail to fetch acc info");
        } else {
            ExtentReporter.extentLoggerPass("MLS_TC_101", "Successfully fetched acc info");
        }
    }
    public void MLS_TC_125_Validate_shippingDetails_numberNotRegistered() throws Exception {
        HeaderChildNode("MLS_TC_125, To Validate Unregistered modal pop up on mobile number field ");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(3000); 
        if(verifyElementPresentAndClick(Shipping_Details.objUnregNum, getText(Shipping_Details.objUnregNum))){
            click(Home_page.objitem_productDetails_confirmBtn, "Confirm Btn");
            ExtentReporter.extentLoggerPass("MLS", "Successfully Validate Unregistered Phone Modal");
        }       
    }
    public void MLS_TC_126_Validate_shippingDetails_accInfoFields_fill() throws Exception {
        HeaderChildNode("MLS_TC_125, To Validate Unregistered modal pop up on mobile number field ");
    }

}
