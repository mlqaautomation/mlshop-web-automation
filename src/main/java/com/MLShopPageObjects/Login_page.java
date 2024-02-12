package com.MLShopPageObjects;

import org.openqa.selenium.By;

public class Login_page {
    public static By objLogin_btn=By.xpath(" //button[normalize-space()='Login']"); 
    public static By objMobileNumber_field=By.xpath("//input[@id='OTP']"); 
    public static By objVerify_mobile_number=By.xpath("//h3[normalize-space()='Please verify your mobile number']");
    public static By objMobileNumber_errorPrompt=By.xpath("//p[@class=' text-xs mt-1 text-red-500']");


    //(//div[@class=' px-4 h-[4rem] w-[4rem] 2sm:h-[2rem] 2sm:w-[2rem] 3sm:w-[1rem] 3sm:h-[2rem] border-rose-400 border flex justify-center items-center text-[#333333]'])[2]
}
