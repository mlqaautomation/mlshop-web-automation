package com.MLShopPageObjects;

import org.openqa.selenium.By;
public class Shipping_Details {

     // ?
    public static By objMlShoppingDetailsPage = By.xpath(
    "//*[@class=' max-w-[1200px] w-full h-[80px] flex justify-between px-[20px] m-auto z-999']/following-sibling::div[2]");

    // Headers
    public static By objSelectP_Up_Branch_Header = By.xpath("//*[contains(text(),'Select Pick Up Branch')]");
    public static By objMlShopProductHeader = By.xpath("(//div/p[2])[1]");
    public static By objAcct_Info_Header = By.xpath("//h3[@class='px-[14px] py-[5px] font-bold text-[#444444]']");

    // Products Ordered
    public static By objProductsOrdered = By.xpath("(//*[contains(text(),'Products Ordered')])[1]");
    public static By objTotalProductOrder = By.xpath("//div[@class='flex-1 px-5 text-right']/child::p");
    public static By objQuantity = By.xpath("//*[contains(text(),'Quantity')]");
    public static By objItemSubtotal = By.xpath("//*[contains(text(),'Item Subtotal')]");
    public static By objServiceFee = By.xpath("//*[contains(text(),'Service Fee')]");
    public static By objShippingFee = By.xpath("//*[contains(text(),'Shipping Fee')]");
    public static By getProductDescriptions(){
        return By.xpath("(//p[@class='font-semibold text-[#333333] '])");
    }
    public static By getProductQuantities(int index){
        return By.xpath("(//td[contains(@class, 'whitespace-nowrap' )][1])["+index+"]");
    }
    public static By getProductPrice(int index){
        return By.xpath("(//td[contains(@class, 'whitespace-nowrap' )][2])["+index+"]");
    }
    public static By getIsRequired(){
        return By.xpath("//*[contains(text(),'is Required')]");
    }
    public static By objUnregNum = By.xpath("//p[normalize-space()='Unregistered mobile phone.']");
    // Account Information Box
    public static By objMobileNum_txt = By.xpath("//*[contains(text(),'Mobile Number')]");
    public static By objMobileNum_txtBox = By.xpath("//input[contains(@placeholder,'Mobile number')]");
    public static By objF_Name_txt = By.xpath("//*[contains(text(),'First Name')]");
    public static By objF_Name_txtBox = By.xpath("//input[@placeholder='First Name']");
    public static By objL_Name_txt = By.xpath("//*[contains(text(),'Last Name')]");
    public static By objL_Name_txtBox = By.xpath("//input[@placeholder='Lastname ']");
    public static By objL_Email_txt = By.xpath(
            "//div[contains(@class,'email w-[20%] py-[10px] 2sm:w-[100%] 3sm:w-[100%]')]//div[contains(@class,'w-full')]//p[contains(@class,'font-bold text-[12px] text-[#333333]')]");
    public static By objL_Email_txtBox = By.xpath("//input[contains(@placeholder,'Email')]");
    public static By objL_ZipCode_txt = By.xpath("//*[contains(text(),'Zipcode')]");
    public static By objL_ZipCode_txtBox = By.xpath("//input[contains(@placeholder,'Zip Code')]");
    public static By objL_Street_txt = By.xpath("//*[contains(text(),'Street')]");
    public static By objL_Street_txtBox = By.xpath("//input[@placeholder='Street']");
    // Drop Down
    public static By objF_Country_txt = By.xpath("//*[contains(text(),'Country')]");
    public static By objF_Country_DragDown = By.xpath("//select[@name='Country']");
    public static By objF_ProvState_txt = By.xpath("//*[contains(text(),'Province/State')]");
    public static By objF_ProvState_DragDown = By.xpath(
            "//select[contains(@class,'border border-gray-400 rounded-[5px] font-normal px-[5px] py-[2px] w-full disabled:bg-gray-300 focus:outline-none')]");
    public static By objF_CityTown_txt = By.xpath(
            "//div[contains(@class,'city w-[32%] py-[10px] 2sm:w-[100%] 3sm:w-[100%]')]//p[contains(@class,'font-bold text-[12px] text-[#333333]')]");
    public static By objF_CityTown_DragDown = By
            .xpath("//div[contains(@class,'city w-[32%] py-[10px] 2sm:w-[100%] 3sm:w-[100%]')]//select");

    // Select Pick Up Branch Box
    public static By objServiceFeeDetails = By.xpath("//*[@class='flex flex-wrap']/child::div[1]");
    public static By objProv_State = By.xpath(
            "//div[contains(@class,'state w-[30%] py-[10px] pl-[20px] 2sm:w-[100%] 2sm:pl-0 3sm:pl-0 3sm:w-[100%]')]//select[contains(@name,'Province State')]");
    public static By objCity_Town = By
            .xpath("//div[@class='city w-[30%] py-[10px] 2sm:w-[100%] 3sm:w-[100%]']//select");
    public static By objBranch_Name = By.xpath("//select[@name='Branch Name']");
    public static By objBranch_Address = By.xpath("(//p[contains(@class,'text-[#444444] px-5 py-2')])[1]");
    // Payment Method Selection
    public static By getAllPaymentMethods(){
        return By.xpath("(//button[contains(@class,'p-1 hover:scale-100')])");
    }
    public static By objPaymentMethodML_Wallet = By.xpath("//*[contains(text(),'ML WALLET')]");
    public static By objChargedModal_wallet = By.xpath("(//p[@class='text-center'])[1]");
    public static By objProceed_btn = By.xpath("//button[normalize-space()='Proceed']");
    public static By objCancel_btn = By.xpath("//button[normalize-space()='Cancel");
    public static By objPaymentMethodE_Wallet = By.xpath("//*[contains(text(),'E-WALLET')]");
    // E-Wallet Selection
    public static By E_Wallet_GrabPay = By.xpath("//*[contains(text(),'GRAB PAY')]");
    public static By E_Wallet_GCash = By.xpath("//*[contains(text(),'GCASH')]");
    public static By E_Wallet_PayMaya = By.xpath("//*[contains(text(),'PAYMAYA')]");
    // E-Wallet Selection
    public static By objPaymentMethodVisaMasterCard = By.xpath("//*[contains(text(),'VISA/MASTERCARD')]");
    public static By objPaymentMethodOnlineBanking = By.xpath("//*[contains(text(),'DIRECT ONLINE BANKING')]");

    // Shipping Calculation
    public static By objTotalItemPurchased = By.xpath("//*[contains(text(),'Total Purchased Item')]");
    public static By objMerchandiseTotal = By.xpath("//*[contains(text(),'Merchandise Total')]/parent::div/following-sibling::div[2]");
    public static By objServiceTotal = By.xpath("//*[contains(text(),'Service Total')]/parent::div/following-sibling::div[2]");
    public static By objShippingTotal = By.xpath("//*[contains(text(),'Shipping Total')]/parent::div/following-sibling::div[2]");
    public static By objTotalPayment = By.xpath("//*[contains(text(),'Total Payment')]/parent::div/following-sibling::div[2]");

    // Lower Right Buttons
    public static By objPlaceOrder = By.xpath("//*[contains(text(),'Place Order')]");
    public static By objContinueShopping = By.xpath("//div[@class='hover:border-red-400 border-2 p-2 rounded-md']");

    public static By objSuccessCheckout_msg = By.xpath("//p[normalize-space()='Successfully checkout items. Thank you!']");

}
