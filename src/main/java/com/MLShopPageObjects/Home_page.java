package com.MLShopPageObjects;

import org.openqa.selenium.By;
public  class Home_page{

    public static By objUser_icon= By.xpath("(//*[name()='svg'][contains(@class,'w-6 h-6')])[3]/parent::div");
    public static By objShoppingCart_itemNumber=By.xpath("(//a)[6]/child::p");
    public static By objShoppingCart_icon=By.xpath("(//a)[6]");
    public static By objContactUs=By.xpath("(//a)");
    public static By objAbout=By.xpath("(//a)");
    public static By objMlJewellers=By.xpath("(//a)");
    public static By objWatchesTab=By.xpath("(//a)");
    public static By objJewelryTab=By.xpath("(//a)");
    public static By objAmparitoCollectionsTab=By.xpath("(//a)");
}