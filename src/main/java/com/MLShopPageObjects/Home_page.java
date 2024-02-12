package com.MLShopPageObjects;

import org.openqa.selenium.By;
public  class Home_page{

    public static By obj_user_icon = By.xpath("/html/body/div[3]/div[5]/div/div[2]/child::div[1]");
    public static By obj_shoppingCart_itemNumber=By.xpath("//a[@href=\"/cart\"]/child::p");
    //a[@href="/cart"]/child::p
    //a[@href="/cart"]/child::*[local-name() = 'svg' and namespace-uri() = 'http://www.w3.org/2000/svg']
}