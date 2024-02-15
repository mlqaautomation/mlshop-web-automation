package com.MLShopPageObjects;

import org.openqa.selenium.By;

public class Shopping_Cart {
    
    // Shopping Cart Upper Left Box
    public static By ShoppingCart_icon = By.xpath(
            "//div[contains(@class,'mb-3 shadow-2xl shadow-[#9B7F40] justify-center items-center 3sm:w-full 2sm:w-full sm:w-1/2')]");
    public static By MLJewelryStore_icon = By
            .xpath("//h3[contains(@class,'py-[5px] text-sm font-semibold 2sm:text-base 3sm:text-base sm:text-base')]");

    // Cart Item
    public static By Item_TickBox = By.xpath("//input[@type='checkbox']");
    public static By Item_ShoppingCart = By.xpath(
            "//div[contains(@class,'flex 2sm:flex-1 items-center 3sm:flex-1 3sm:items-start 2sm:items-start sm:flex-1 san:flex-col san:items-start')]");
    public static By Item_Price = By.xpath(
            "//p[contains(@class,'text-lg text-[#444444] text-[12px] font-semibold 2sm:text-sm 2sm:font-medium 3sm:text-[10px] md:text-[13px] 2sm:text-[13px] 3sm:font-medium sm:text-base 2sm:mt-2')]");
    public static By Item_DeleteIcon = By.xpath(
            "//button[contains(@class,'flex justify-center focus:outline-none text-white bg-[#845f00] hover:bg-red-900 focus:ring-4 focus:ring-red-300 font-medium rounded-[20px] text-sm px-5 py-2.5 mr-2 mb-2 dark:bg-red-600 dark:hover:bg-red-700 dark:focus:ring-red-900 self-baseline w-auto 3sms:w-[100%] 2sms:w-[100%] san:rounded-[20px] sm:self-center 3sm:self-center 2sm:self-center san:self-center')]");

    // Item Selected and Subtotal
    public static By Item_Selected = By.xpath("//*[contains(text(),'Item Selected : ')]");
    public static By Subtotal = By.xpath("//*[contains(text(),'subtotal')]/following-sibling::p");
    public static By Subtotal_count = By.xpath("//*[contains(text(),'subtotal')]/following-sibling::p");

    // Checkout Btn
    public static By Checkout_Btn = By.xpath("//button[@type='button']");
}
