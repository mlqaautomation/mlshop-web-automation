package com.MLShopPageObjects;

import org.openqa.selenium.By;

public class Login_page {
    public static By objLogin_btn=By.xpath(" //button[normalize-space()='Login']"); 
    public static By objMobileNumber_field=By.xpath("//input[@id='OTP']"); 
    public static By objVerify_mobile_number=By.xpath("//h3[normalize-space()='Please verify your mobile number']");
    public static By objMobileNumber_errorPrompt=By.xpath("//p[@class=' text-xs mt-1 text-red-500']");
    public static By objReturnOTP(int val){
        return By.xpath("(//div[@class=' px-4 h-[4rem] w-[4rem] 2sm:h-[2rem] 2sm:w-[2rem] 3sm:w-[1rem] 3sm:h-[2rem] border-rose-400 border flex justify-center items-center text-[#333333]'])["+val+"]");
    }
    public static By objOTP_PleaseEnter=By.xpath("//p[normalize-space()='Please enter the One Time Pin (OTP)']");
    public static By objOTP_Result=By.xpath("//p[@class='text-center']");
    public static By objConfirm_btn=By.xpath("//button[normalize-space()='Confirm']");
    public static By objOkay_btn=By.xpath("//button[normalize-space()='Okay']");
    public static By objCancel_btn=By.xpath("//button[normalize-space()='Cancel']");
    public static By objProceed_btn=By.xpath("//button[normalize-space()='Proceed']");
    public static By objAccNotFound=By.xpath("//p[contains(text(), \"Account not found\")]");
}
