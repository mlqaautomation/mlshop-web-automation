package com.MLShopPageObjects;

import org.openqa.selenium.By;
public class Profile_page {
    public static By objProfile_container = By.xpath("(//div[@class='profile-wrapper w-full h-auto my-[127px] flex sm:flex-col sm:items-center 2sm:my-[30px] 3sm:my-[30px] 2sm:flex-col 2sm:items-center 3sm:flex-col 3sm:items-center'])[1]");
    public static By objProfile_fullName = By.xpath("(//div[@class='font-bold text-[18px] break-all'])[1]");
    public static By objProfile_userTIer= By.xpath("(//div[@class='font-semibold'])[1]");
    public static By objProfile_userStatus= By.xpath("//div[@class='status flex justify-center mr-5']");
    public static By objProfile_fullName2= By.xpath("//h3[normalize-space()='Full Name']/following-sibling::p");
    public static By objProfile_email= By.xpath("//h3[normalize-space()='Email Address']/following-sibling::p");
    public static By objProfile_mobileNo= By.xpath("//h3[normalize-space()='Mobile No.']/following-sibling::p");
}

