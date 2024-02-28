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
import static com.utility.ExtentReporter.jiraID;
import static com.utility.ExtentReporter.platform;
import static com.utility.ExtentReporter.userType;
import static com.utility.ExtentReporter.version;
import static com.utility.Utilities.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MLShopPageObjects.Home_page; 
import com.MLShopPageObjects.Shopping_Cart;
import com.MLShopPageObjects.Shipping_Details;
import com.MLShopPageObjects.Login_page;
import com.MLShopPageObjects.Purchase_History;
import com.MLShopPageObjects.Paymongo;

import com.utility.ExtentReporter;
import com.utility.Utilities;

public class ShippingDetails extends BaseClass{

    private Home home = new Home();
    private ShoppingCart cart = new ShoppingCart();
    private Login login = new Login();
    private PurchaseHistory purchaseHistory = new PurchaseHistory();
    private Utilities utils = new Utilities();
    

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
        logger.info("Found item : " + itemInfo[0] + ", with Stock number:  " + itemInfo[1]);
            ExtentReporter.extentLoggerPass("", "Items are present in shipping details page");
        } else {
            ExtentReporter.extentLoggerFail("", "Failed to retrieve items are present in shipping details page");
        }
    }
    public void selectBranch(String prov, String city, String branch) throws Exception {
        selectByVisibleTextFromDD(Shipping_Details.objProv_State, prop.getproperty(prov));
        selectByVisibleTextFromDD(Shipping_Details.objCity_Town, prop.getproperty(city));
        selectByVisibleTextFromDD(Shipping_Details.objBranch_Name, prop.getproperty(branch));     
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
        waitTime(2000); 
        if(verifyElementPresentAndClick(Shipping_Details.objUnregNum, getText(Shipping_Details.objUnregNum))){
            click(Home_page.objitem_productDetails_confirmBtn, "Confirm Btn");
            ExtentReporter.extentLoggerPass("MLS", "Successfully Validate Unregistered Phone Modal");
        }       
    }
    public void MLS_TC_126_Validate_shippingDetails_accInfoFields_fill() throws Exception {
        HeaderChildNode("MLS_TC_125, To Validate Unregistered modal pop up on mobile number field ");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Unregistered_Number"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(2000);
        if(verifyElementPresent(Shipping_Details.objUnregNum, getText(Shipping_Details.objUnregNum))){
            click(Home_page.objitem_productDetails_confirmBtn, "Confirm Btn");
            ExtentReporter.extentLoggerPass("MLS_TC_125", "Successfully Validate Unregistered Phone Modal");
        }
    }
    public void MLS_TC_102_Validate_shippingDetails_accInfoFields_branchAddr() throws Exception {
        HeaderChildNode("MLS_TC_102, To Validate branch section label \"branch address:\" matches the selected address dropdown value  ");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(2000); 
        selectBranch("Province", "City", "Branch");
        String branchAddress = getText(Shipping_Details.objBranch_Address);
        String addressWithoutPrefix = branchAddress.replace("Branch Address: ", "").trim();
        assertionValidation(addressWithoutPrefix, prop.getproperty("Branch_Address"));
        ExtentReporter.extentLogger("MLS_TC_102", "Successfully Validated Branch Address");
    }
    public void MLS_TC_104_Validate_shippingDetails_paymentMethod_isClickable() throws Exception {
        HeaderChildNode("MLS_TC_104, To Validate shipping details payment method is clickable");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(3000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        List<WebElement> methodsList = findElements(Shipping_Details.getAllPaymentMethods());
        if (!methodsList.isEmpty()) {
            List<String> paymentKeywords = Arrays.asList("ML WALLET", "E-WALLET", "GRAB PAY","GCASH","PAYMAYA","VISA/MASTERCARD", "DIRECT ONLINE BANKING");
            boolean paymentMethodClicked = false;
            for (WebElement payment : methodsList) {
                String paymentText = payment.getText();
                for (String keyword : paymentKeywords) {
                    if (paymentText.contains(keyword)) {
                        clickByElement(payment, paymentText);                        
                        ExtentReporter.extentLoggerPass("MLS_TC_104", "Successfully Clicked Payment Method: " + paymentText);
                        paymentMethodClicked = true;
                        break;
                    }
                }if(!paymentMethodClicked) {
                    ExtentReporter.extentLoggerFail("MLS_TC_104", "Payment methods are not visible");  
                }
            }    
        }else{      
            ExtentReporter.extentLoggerFail("MLS_TC_104", "Payment methods are not visible");  
        }                   
    }
    public void MLS_TC_105_Validate_shippingDetails_paymentMethod_eWalletOptions_Visiblity() throws Exception {
        HeaderChildNode("MLS_TC_105, To Validate E-Wallet Options are present");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(3000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        List<WebElement> methodsList = findElements(Shipping_Details.getAllPaymentMethods());
        if (methodsList.isEmpty()) {
            ExtentReporter.extentLoggerFail("MLS_TC_105", "Payment methods are not visible");
            return;
        }
        boolean isPresent = false;
        for (WebElement payment : methodsList) {
            String paymentText = payment.getText();
            if (paymentText.contains("E-WALLET")) {
                clickByElement(payment, paymentText);  
                waitTime(1000);                 
                if(verifyElementPresent(Shipping_Details.E_Wallet_GrabPay, "GRAB PAY")
                && verifyElementPresent(Shipping_Details.E_Wallet_GCash, "Gcash")
                && verifyElementPresent(Shipping_Details.E_Wallet_PayMaya, "Paymaya")) {               
                    ExtentReporter.extentLoggerPass("MLS_TC_105", paymentText + ": Options are visible");
                    isPresent = true;
                    break; 
                }             
            }
        }
        if (!isPresent) {
            ExtentReporter.extentLoggerFail("MLS_TC_105", "Payment methods under E-WALLET are not visible");
        }
    }
    public void MLS_TC_106_Validate_shippingDetails_paymentConfirmation_popUp()throws Exception{
        HeaderChildNode("MLS_TC_106, To Validate place order using mlwallet as payment method will display modal popup payment confirmation");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(3000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        click(Shipping_Details.objPaymentMethodML_Wallet, "ML WALLET");
        waitTime(1000);
        click(Shipping_Details.objPlaceOrder, "Place Order btn");
        if(verifyElementPresent(Shipping_Details.objChargedModal_wallet, getText(Shipping_Details.objChargedModal_wallet))){
            ExtentReporter.extentLoggerPass("MLS_TC_106", "Charged Modal is Present");
            click(Shipping_Details.objProceed_btn, "Proceed btn");         
        }
    }
    public void MLS_TC_130_Validate_shippingDetails_totalPayment_chargedModal()throws Exception{
        HeaderChildNode("MLS_TC_106, To Validate place order using mlwallet as payment method will display modal popup payment confirmation");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(3000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        click(Shipping_Details.objPaymentMethodML_Wallet, "ML WALLET");
        waitTime(1000);
        String totalPayment = getText(Shipping_Details.objTotalPayment);
        click(Shipping_Details.objPlaceOrder, "Place Order btn");
        if(getText(Shipping_Details.objChargedModal_wallet).contains(totalPayment)){
            ExtentReporter.extentLoggerPass("MLS_TC_130", "Total Payment is correct : "+totalPayment);     
        }else{
            ExtentReporter.extentLoggerFail("MLS_TC_105", "Total Payment is incorrect");
        }
    }
    public void MLS_TC_107_Validate_shippingDetails_otp_Popup()throws Exception{
        HeaderChildNode("MLS_TC_107, To Validate otp after clicking proceed button in payment confirmation modal");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(3000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        click(Shipping_Details.objPaymentMethodML_Wallet, "ML WALLET");
        waitTime(1000);
        click(Shipping_Details.objPlaceOrder, "Place Order btn");
        verifyElementPresentAndClick(Shipping_Details.objProceed_btn, getText(Shipping_Details.objProceed_btn));
        if(verifyElementPresent(Login_page.objOTP_PleaseEnter, getText(Login_page.objOTP_PleaseEnter))){
            ExtentReporter.extentLoggerPass("MLS_TC_107", "OTP after clicking proceed button");         
        }
    }
    public void MLS_TC_108_Validate_shippingDetails_otp_popUpClose()throws Exception{
        HeaderChildNode("MLS_TC_108, To Validate exit button will close the otp modal");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(3000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        click(Shipping_Details.objPaymentMethodML_Wallet, "ML WALLET");
        waitTime(1000);
        click(Shipping_Details.objPlaceOrder, "Place Order btn");
        verifyElementPresentAndClick(Shipping_Details.objProceed_btn, getText(Shipping_Details.objProceed_btn));
        if(verifyElementPresent(Login_page.objOTP_PleaseEnter, getText(Login_page.objOTP_PleaseEnter))){
            verifyElementPresentAndClick(Login_page.objOTP_exit, "Exit btn");
            ExtentReporter.extentLoggerPass("MLS_TC_108", "Exit button closed the otp modal");         
        }
    }
    public void MLS_TC_109_Validate_purchaseVia_mlWallet()throws Exception{
        HeaderChildNode("MLS_TC_109, To Validate succesful pruchase using ml wallet sa payment method");
        purchase_via_wallet("Jewelry", false);
        ExtentReporter.extentLoggerPass("MLS_TC_109", "Successfull Purchase Item via MLWallet");
    }
    public void MLS_TC_110_Validate_Computation()throws Exception{
        HeaderChildNode("MLS_TC_110, To Validate correct computation of total payment");
        shippingPageItemChecker("Jewelry");
        typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), getText(Shipping_Details.objMobileNum_txtBox));
        waitTime(2000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();  
        verifyElementPresentAndClick(Shipping_Details.objPaymentMethodML_Wallet, "ML WALLET");
        waitTime(1000);
        if(isTotalCorrect()){
            ExtentReporter.extentLoggerPass(osName, "Correct computation of total payment");
        }else{
            ExtentReporter.extentLoggerFail(osName, "Incorrect computation of total payment");
        }
    }
    public void MLS_TC_113_Validate_successPurchase_historyDetails()throws Exception{
        HeaderChildNode("MLS_TC_112, To Validate purchase history after succesful shipping details of items");
        login.loginValid("Branch_Verified");
        if(isItemPurchased_inHistory("Jewelry")){
            ExtentReporter.extentLoggerPass("MLS_TC_112", "To Validate purchase history after succesful shipping details of items");
        }
    }
    public void MLS_TC_114_Validate_successPurchase_grabPay()throws Exception{
        HeaderChildNode("MLS_TC_114, To Validate successful purchase using e-wallet \"grab pay\" as payment method");
        login.loginValid("Branch_Verified"); 
        purchase_via_e_wallet("Jewelry", prop.getproperty("Grab"));
        
    }
    public void MLS_TC_115_Validate_successPurchase_gCash()throws Exception{
        HeaderChildNode("MLS_TC_115, To Validate successful purchase using e-wallet \"gcash\" as payment method");
        login.loginValid("Branch_Verified");
        purchase_via_e_wallet("Jewelry", prop.getproperty("Gcash"));
    }
    public void MLS_TC_116_Validate_successPurchase_payMaya()throws Exception{
        HeaderChildNode("MLS_TC_116, To Validate successful purchase using e-wallet \"paymaya\" as payment methods");
        login.loginValid("Branch_Verified");
        purchase_via_e_wallet("Jewelry", prop.getproperty("Paymaya"));
    }
    public void MLS_TC_117_Validate_successPurchase_card()throws Exception{
        HeaderChildNode("MLS_TC_116, To Validate successful purchase using e-wallet \"paymaya\" as payment methods");
        login.loginValid("Branch_Verified");
        purchase_via_e_wallet("Jewelry", prop.getproperty("Paymaya"));
    }
    public void MLS_TC_127_Validate_sucessPurhcase_wallet()throws Exception{
        HeaderChildNode("MLS_TC_116, To Validate successful purchase using e-wallet \"paymaya\" as payment methods");
        login.loginValid("Branch_Verified");
        purchase_via_wallet("Jewelry", true);
    }

    public boolean isTotalCorrect() throws Exception {
        double merchTotalValue = parseTotalValue(getText(Shipping_Details.objMerchandiseTotal));
        double servTotalValue = parseTotalValue(getText(Shipping_Details.objServiceTotal));
        double shipTotalValue = parseTotalValue(getText(Shipping_Details.objShippingTotal));
        double totalPaymentValue = parseTotalValue(getText(Shipping_Details.objTotalPayment));
        double expectedTotal = merchTotalValue + servTotalValue + shipTotalValue;
        logger.info("Expected total: "+ expectedTotal + ", actual: "+ totalPaymentValue);
        return expectedTotal == totalPaymentValue;
    }

    private double parseTotalValue(String total) {
        return Double.parseDouble(total.substring(1).trim());
    }

    public boolean isItemPurchased_inHistory(String type) throws Exception {
        String[] itemInfo = home.addItemToCart(type, 2);
        cart.navigateShoppingCart();
        verifyElementPresentAndClick(Shopping_Cart.Checkout_Btn, "Checkout");
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
            selectBranch("Province", "City", "Branch");
            scrollToBottomOfPageWEB();
            verifyElementPresentAndClick(Shipping_Details.objPaymentMethodML_Wallet, "ML WALLET");   
            waitTime(1000);        
            verifyElementPresentAndClick(Shipping_Details.objPlaceOrder, "Place Order btn");
            verifyElementPresentAndClick(Shipping_Details.objProceed_btn, getText(Shipping_Details.objProceed_btn));
            waitTime(3000);
            login.inputOTP();       
            verifyElementPresent(Shipping_Details.objSuccessCheckout_msg, getText(Shipping_Details.objSuccessCheckout_msg));
            verifyElementPresentAndClick(Login_page.objOkay_btn, "Okay button");
            waitTime(2000);
            WebElement allStockNumbers = findElement(Purchase_History.allStockNumber);
            List<WebElement> stockNumbers = allStockNumbers.findElements(Purchase_History.allStockNumber);
            boolean isItemInHistory = false;     
            for (WebElement stockNo : stockNumbers) {
                String stockNumber = stockNo.getText().trim().replaceFirst("STOCK NUMBER : ", "");
                String itemInfoStockNumber = itemInfo[1].trim().replaceFirst("STOCK NUMBER : ", "");     
                if (stockNumber.contains(itemInfoStockNumber)) {
                    isItemInHistory = true;
                    break;
                }
            }       
            String itemInfoStockNumber = itemInfo[1].trim().replaceFirst("STOCK NUMBER :", "");    
            if (isItemInHistory) {
                logger.info(itemInfo[0] + " with Stock number: " + itemInfoStockNumber + " is present in history page");            
                verifyElementPresentAndClick(Purchase_History.firstOrder_Details, "Firs Oreder Details btn");
                assertionValidation(" "+getText(Purchase_History.orderDetails_stockNo), itemInfoStockNumber);
                return true;
            } else {
                logger.info(itemInfoStockNumber + " not found");
                ExtentReporter.extentLoggerFail("", "not found");
                return false;
            }
        }       
        return false;
    }  
    public void purchase_via_wallet(String type, boolean isLogin)throws Exception{
        home.addItemToCart(type, 2);
        cart.navigateShoppingCart();
        verifyElementPresentAndClick(Shopping_Cart.Checkout_Btn, "Checkout");
        waitTime(2000);
        if(!isLogin){
            logger.info("<--Not logged in, inputting valid mobile number in field -->");
            typeWeb(Shipping_Details.objMobileNum_txtBox, prop.getproperty("Branch_Verified"), "Mobile Number");
        }        
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        verifyElementPresentAndClick(Shipping_Details.objPaymentMethodML_Wallet, "ML WALLET");     
        waitTime(1000); 
        isTotalCorrect();
        verifyElementPresentAndClick(Shipping_Details.objPlaceOrder, "Place Order btn");
        verifyElementPresentAndClick(Shipping_Details.objProceed_btn, getText(Shipping_Details.objProceed_btn));
        waitTime(3000);
        login.inputOTP();       
        verifyElementPresent(Shipping_Details.objSuccessCheckout_msg, getText(Shipping_Details.objSuccessCheckout_msg));
        verifyElementPresentAndClick(Login_page.objOkay_btn, "Okay button");     

    }
    public void purchase_via_e_wallet(String itemType, String eWalletType) throws Exception {
        home.addItemToCart(itemType, 2);
        cart.navigateShoppingCart();
        verifyElementPresentAndClick(Shopping_Cart.Checkout_Btn, "Checkout");
        waitTime(2000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        verifyElementPresentAndClick(Shipping_Details.objPaymentMethodE_Wallet, "E-WALLET");    
        waitTime(1000);
        String option;
        switch (eWalletType) {
            case "PAYMAYA":
                verifyElementPresentAndClick(Shipping_Details.E_Wallet_PayMaya, "PAY MAYA");
                option = prop.getproperty("Paymaya");
                break;
            case "GRAB PAY":
                verifyElementPresentAndClick(Shipping_Details.E_Wallet_GrabPay, "GRAB PAY");
                option = prop.getproperty("Grab");
                break;
            case "GCASH":
                verifyElementPresentAndClick(Shipping_Details.E_Wallet_GCash, "GCASH");
                option = prop.getproperty("Gcash");
                break;
            default:
                throw new IllegalArgumentException("Invalid e-wallet type: " + eWalletType);
        }  
        waitTime(1000);
        isTotalCorrect();
        verifyElementPresentAndClick(Shipping_Details.objPlaceOrder, "Place Order btn");
        verifyElementPresentAndClick(Shipping_Details.objProceed_btn, getText(Shipping_Details.objProceed_btn));
        waitTime(3000);
        login.inputOTP();

        handlePaymongoPayment_eWallet();
        purchaseHistory.navigatePurchaseHistory();
        if(option.contains(getText(Purchase_History.firstOrder_No))){
            logger.info("First Order Payment Method " + option.toString());
            ExtentReporter.extentLoggerPass("E-WALLET Payment Option: ", "Successfull Purchase");
        }
    }
    public void handlePaymongoPayment_eWallet() throws Exception {
    waitTime(5000);
    String currentWindowHandle = getWebDriver().getWindowHandle();
    utils.switchToNextTab();
    
    // Wait for the new tab to load
    WebDriverWait wait = new WebDriverWait(getWebDriver(), 10);
    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
    
    // Switch to the new tab
    Set<String> windowHandles = getWebDriver().getWindowHandles();
    for (String windowHandle : windowHandles) {
        if (!windowHandle.equals(currentWindowHandle)) {
            getWebDriver().switchTo().window(windowHandle);
            break;
        }
    }

    waitTime(5000);
    verifyElementPresent(Paymongo.objHeaderMerchant, "HEADER MERCHANT");
    verifyElementPresentAndClick(Paymongo.objContinue_btn, "Continue btn");
    verifyElementPresentAndClick(Paymongo.objTickBox, "Policy Checkbox");
    verifyElementPresentAndClick(Paymongo.objComplete, "Complete btn");
    verifyElementPresentAndClick(Paymongo.objAuth_btn, "Auth btn");
    
    // Switch back to the original tab
    getWebDriver().switchTo().window(currentWindowHandle);
}
    public void purchase_via_card(String itemType)throws Exception {
        home.addItemToCart(itemType, 2);
        cart.navigateShoppingCart();
        verifyElementPresentAndClick(Shopping_Cart.Checkout_Btn, "Checkout");
        waitTime(2000);
        selectBranch("Province", "City", "Branch");
        scrollToBottomOfPageWEB();
        verifyElementPresentAndClick(Shipping_Details.objPaymentMethodVisaMasterCard, "VISA/MASTERCARD");
        waitTime(1000);
        verifyElementPresentAndClick(Shipping_Details.objPlaceOrder, "Place Order btn");
        verifyElementPresentAndClick(Shipping_Details.objProceed_btn, getText(Shipping_Details.objProceed_btn));
        waitTime(3000);
        login.inputOTP();       
    }
    public void handlePaymongoPayment_card()throws Exception {
        waitTime(5000);       
        utils.switchToNextTab();
        waitTime(5000);      
        verifyElementPresent(Paymongo.objHeaderMerchant, "HEADER MERCHANT"); 
        verifyElementPresentAndClick(Paymongo.objContinue_btn, "Continue btn"); 
        typeWeb(Paymongo.objCardNumtxtBox, prop.getproperty("CTPWD"), "Car Number");
        typeWeb(Paymongo.objExpiryM, prop.getproperty("CTPWD"), "Expiry MM");
        typeWeb(Paymongo.objExpiryY, prop.getproperty("CTPWD"), "Expiry YY");
        typeWeb(Paymongo.objCVCtxtBox, prop.getproperty("CTPWD"), "CVC");
        verifyElementPresentAndClick(Paymongo.objTickBox, "Policy Checkbox");
        verifyElementPresentAndClick(Paymongo.objComplete, "Complete btn");
        verifyElementPresentAndClick(Paymongo.objAuth_btn, "Auth btn");
        utils.switchToPreviousTab();
    }
}
