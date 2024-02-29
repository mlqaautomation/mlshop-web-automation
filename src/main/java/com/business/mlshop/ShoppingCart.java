package com.business.mlshop;

import static com.utility.ExtentReporter.CTCurrentTime;
import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.ExtentReporter.ReportName;
import static com.utility.ExtentReporter.buildVersion;
import static com.utility.ExtentReporter.extentLogger;
import static com.utility.ExtentReporter.getWebDriver;
import static com.utility.Utilities.*;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.MLShopPageObjects.Home_page; 
import com.MLShopPageObjects.Shopping_Cart;
import com.utility.ExtentReporter;

public class ShoppingCart extends BaseClass{

    private Home home = new Home();

    public void navigateShoppingCart()throws Exception{
        verifyElementPresentAndClick(Home_page.objShoppingCart_icon, "Shopping Cart");     
    }
    public void MLS_TC_90_Validate_shopping_cart_navigation()throws Exception{
        HeaderChildNode("MLS_TC_90, To Validate Shopping Cart page navigation");
        navigateShoppingCart();
        ExtentReporter.extentLoggerPass("MLS_TC_90", "To Validate Shopping Cart page navigation");
    }
    public void MLS_TC_91_Validate_shopping_cart_items() throws Exception {
        HeaderChildNode("MLS_TC_91, To Validate Shopping Cart items");     
        String[] itemInfo = home.addItemToCart("Jewelry", 1);
        navigateShoppingCart();
        WebElement shoppingCart = findElement(Shopping_Cart.item_allDescription);
        if (shoppingCart != null) {
            List<WebElement> itemDescriptions = shoppingCart.findElements(Shopping_Cart.item_allDescription);
            boolean itemFound = false;    
            for (WebElement item : itemDescriptions) {
                if (item.getText().contains(itemInfo[0])) {
                    itemFound = true;
                    break;
                }
            }
            if (itemFound) {
                logger.info("item found: " + itemInfo[0]);
                ExtentReporter.extentLoggerPass("MLS_TC_91", "Item found in shopping cart: " +  itemInfo[0]);
            } else {
                logger.info("item not found: " + itemInfo[0]);
                ExtentReporter.extentLoggerFail("MLS_TC_91", "Item description does not match");
            }
        } else {
            ExtentReporter.extentLoggerFail("MLS_TC_91", "Failed to retrieve items");
        }
    }
    public void MLS_TC_92_Validate_shopping_cart_increment() throws Exception {
        HeaderChildNode("MLS_TC_92, To Validate Shopping Cart total number of products is incremented after adding an item to cart");   
        String prevCount = getText(Home_page.objShoppingCart_itemNumber);
        home.addItemToCart("Jewelry", 1);
        String currentCount = getText(Home_page.objShoppingCart_itemNumber);
        assertNotEquals(currentCount, prevCount);
        ExtentReporter.extentLoggerPass("MLS_TC_92", "Successfully validated shopping cart number");
    }
    public void MLS_TC_93_Validate_shopping_cart_removeItem() throws Exception {
        HeaderChildNode("MLS_TC_93, To Validate removing items from shopping cart");     
        home.addItemToCart("Jewelry", 1);
        navigateShoppingCart();
        verifyElementPresentAndClick(Shopping_Cart.Item_deleteIcon(1), "Garbage btn");
        verifyElementPresentAndClick(Shopping_Cart.modal_yes, "Yes btn");
        if(verifyElementDisplayed(Shopping_Cart.item_nameDescription(1), "Item")){
            ExtentReporter.extentLoggerFail("MLS_TC_93", "Failed to delete items in shopping cart");        
        }else{
            ExtentReporter.extentLoggerPass("MLS_TC_93", "Successfully validated delete items in shopping cart");
        }
    }
    public void MLS_TC_94_Validate_shopping_cart_modalPopup()throws Exception{
        HeaderChildNode("MLS_TC_94, To Validate modal popup confirmation button for removing item");     
        home.addItemToCart("Jewelry", 1);
        navigateShoppingCart();
        verifyElementPresentAndClick(Shopping_Cart.Item_deleteIcon(1), "Garbage btn");    
        if(verifyElementPresent(Shopping_Cart.modal_msg, getText(Shopping_Cart.modal_msg))){
            ExtentReporter.extentLoggerPass("MLS_TC_94", "Successfully validated modal pop up for remove item");
        }else{
            ExtentReporter.extentLoggerFail("MLS_TC_94", "Modal popup is not visible");
        }
    }
    public void MLS_TC_95_Validate_shopping_cart_cancelRemove()throws Exception{
        HeaderChildNode("MLS_TC_95, To Validate removing items from shopping cart");     
        home.addItemToCart("Jewelry", 1);
        navigateShoppingCart();
        verifyElementPresentAndClick(Shopping_Cart.Item_deleteIcon(1), "Garbage btn");
        verifyElementPresentAndClick(Shopping_Cart.modal_cancel, "Cancel btn");    
        if(verifyElementDisplayed(Shopping_Cart.item_nameDescription(1), "Item")){
            ExtentReporter.extentLoggerPass("MLS_TC_95", "Successfully validated delete items in shopping cart");      
        }else{
            ExtentReporter.extentLoggerPass("MLS_TC_93", "Successfully validated delete items in shopping cart");
        }
    }
    public void MLS_TC_96_Validate_shopping_cart_decrementFunction()throws Exception{
        HeaderChildNode("MLS_TC_96, To Validate uncheck functionality will  decrement the total \"item selected\" and subtotal");     
        home.addItemToCart("Jewelry", 1);
        navigateShoppingCart();
        String prevTotal = getText(Shopping_Cart.Item_Selected);
        String prevSubtotal = getText(Shopping_Cart.Subtotal_count);          
        verifyElementPresentAndClick(Shopping_Cart.item_checkBox(1), "Checkbox");  
        waitTime(1000); 
        String currentTotal = getText(Shopping_Cart.Item_Selected);
        String currentSubtotal = getText(Shopping_Cart.Subtotal_count);     
        assertNotEquals(prevTotal, currentTotal);
        assertNotEquals(prevSubtotal, currentSubtotal);
        ExtentReporter.extentLoggerPass("MLS_TC_96", "Successfully validated decrement value for item selected");      
    }
    public void MLS_TC_97_Validate_shopping_cart_incrementFunction()throws Exception{
        HeaderChildNode("MLS_TC_97, To Validate check functionality will  increment the total \"item selected\" and subtotal");     
        home.addItemToCart("Jewelry", 1);
        navigateShoppingCart();    
        verifyElementPresentAndClick(Shopping_Cart.item_checkBox(1), "Checkbox");  
        waitTime(1000); 
        String prevTotal = getText(Shopping_Cart.Item_Selected);
        String prevSubtotal = getText(Shopping_Cart.Subtotal_count);    
        verifyElementPresentAndClick(Shopping_Cart.item_checkBox(1), "Checkbox");  
        waitTime(1000);  
        String currentTotal = getText(Shopping_Cart.Item_Selected);
        String currentSubtotal = getText(Shopping_Cart.Subtotal_count);     
        assertNotEquals(prevTotal, currentTotal);
        assertNotEquals(prevSubtotal, currentSubtotal);
        ExtentReporter.extentLoggerPass("MLS_TC_97", "Successfully validated increment value for item selected and subtotal");      
    }

    //tc for 
}
