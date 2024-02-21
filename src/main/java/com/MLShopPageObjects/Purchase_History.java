package com.MLShopPageObjects;

import org.openqa.selenium.By;

public class Purchase_History {

    // Item Header
    public static By ML_Logo = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]");
    public static By MLJewelry_Text = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]");

    // Item Details
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
    public static By Order_Details = By.xpath("//button[contains(@class, 'bg-red-500')]");
}
