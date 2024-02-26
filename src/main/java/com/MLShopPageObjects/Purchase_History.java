package com.MLShopPageObjects;

import org.openqa.selenium.By;

public class Purchase_History {

    // Item Header
    public static By ML_Logo = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]");
    public static By MLJewelry_Text = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]");

    // Item Details
    public static By firstOrder_No = By.xpath("(//*[contains(text(),'Order No: ')]/child::span[5])[1]");
    public static By Order_No = By.xpath("//*[contains(text(),'Order No: ')]");
    public static By OrderNo_div1 = By.xpath("//*[contains(text(),'Order No: ')]/child::span[1]");
    public static By OrderNo_div2 = By.xpath("//*[contains(text(),'Order No: ')]/child::span[3]");
    public static By OrderNo_div3 = By.xpath("//*[contains(text(),'Order No: ')]/child::span[5]");
    // STATUS
    public static By Status_Pending = By.xpath("//span[@class='text-red-600 font-semibold' and text()='PENDING']");
    public static By Status_Expired = By.xpath("//span[@class='text-red-600 font-semibold' and text()='EXPIRED']");
    public static By Status_ToReceive = By.xpath("//span[@class='text-red-600 font-semibold' and text()='TO RECEIVE']");
    // STATUS
    public static By Prod_Name = By.xpath("//*[contains(text(),'Product Name')]");
    public static By Stock_No = By.xpath("//*[contains(text(),'Stock Number')]");
    public static By ItemPrice = By.xpath("//*[contains(text(),'Price:')][1]");
    public static By Sub_Price = By.xpath("//*[contains(text(),'SubTotal Price : ')]");
    public static By Order_Total = By.xpath("//*[contains(text(),'Order Total : ')]");
    public static By firstOrder_Details = By.xpath("(//button[contains(text(),'Order Details')])[1]");

    public static By allStockNumber = By.xpath("(//*[contains(text(),'Stock Number')]/child::span)");
    public static By allProductName = By.xpath("(//*[contains(text(),'Product Name')]/child::span)");

    //ORDER DETAILS
    public static By orderDetails_stockNo = By.xpath("//*[contains(text(),'Stock No')]/parent::div/following-sibling::div[2]/child::p");
    public static By orderDetails_prodName = By.xpath("//*[contains(text(),'Name')]/parent::div/following-sibling::div[2]/child::p");
}
