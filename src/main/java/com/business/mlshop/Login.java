package com.business.mlshop;

import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.ExtentReporter.extentLogger;
import static com.utility.ExtentReporter.getWebDriver;
import static com.utility.Utilities.*;


import com.MLShopPageObjects.Home_page; 
import com.MLShopPageObjects.Login_page;

public class Login extends BaseClass{

    //create method for login
    public void navigateLoginPage() throws Exception {
        waitTime(2000);
        //click on user icon
        click(Home_page.objUser_icon, "User icon");     
        //validate if user is in login page by using assertion validation 
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("LoginLink"));
    }

    //create method for input valid otp
    public void inputOTP()throws Exception {
        int staticOTP = 1;
        for(int i = 1; i<= 6 ; i++) {
            type(Login_page.objReturnOTP(i), String.valueOf(staticOTP), "OTP field");       
        }
    }
    
    public void loginValid(String account)throws Exception{
        logger.info(account);
        navigateLoginPage();
        typeWeb(Login_page.objMobileNumber_field, prop.getproperty("Branch_Verified"), "Mobile Number");
        click(Login_page.objLogin_btn, "Login Button");      
        waitTime(4000);
        inputOTP(); 
        waitTime(2000);
        assertionValidation(getText(Login_page.objOTP_Result), prop.getproperty("SuccessLogin"));
        click(Login_page.objOkay_btn, "Okay Button");
    }
    

    //MLS_TC_01
    public void MLS_TC_01_ValidateUserIcon_Redirection() throws Exception {
        HeaderChildNode("MLS_TC_01, To Validate \"User\" icon redirects to login page");
        navigateLoginPage();
        logger.info("MLS_TC_01, Successfully validated user icon redirect  to login page");
        extentLogger("MLS_TC_01", "Successfully validated user icon redirect  to login page");        
    }


    public void MLS_TC_02_ValidateErrorPrompt_MobileNumber_Field()throws Exception{
        HeaderChildNode("MLS_TC_02, To validate the error message prompt for an empty mobile number field on the login page.");
        navigateLoginPage();
        click(Login_page.objLogin_btn, "Login Button");
        waitTime(2000);
        assertionValidation(getText(Login_page.objMobileNumber_errorPrompt), prop.getproperty("MobileIsRequired"));
        typeWeb(Login_page.objMobileNumber_field, prop.getproperty("InvalidMobileNumber"), "Mobile Number");
        click(Login_page.objLogin_btn, "Login Button");
        assertionValidation(getText(Login_page.objMobileNumber_errorPrompt), prop.getproperty("MobileIsInvalid"));
        logger.info("MLS_TC_02, Successfully the error message prompt for an empty mobile number field on the login page");
        extentLogger("MLS_TC_02", "Successfully the error message prompt for an empty mobile number field on the login page");       
    }

    public void MLS_TC_05_ValidateErorrPrompt_() throws Exception {
        HeaderChildNode("MLS_TC_05, To Validate confirm button in the \"invalid OTP\" modal redirects to login page");
        navigateLoginPage();
        typeWeb(Login_page.objMobileNumber_field, prop.getproperty("NonStatic_Number"), "Mobile Number");
        click(Login_page.objLogin_btn, "Login Button");
        assertionValidation(getText(Login_page.objOTP_PleaseEnter), prop.getproperty("PlsEnterOTP"));
        waitTime(5000);
        inputOTP(); 
        assertionValidation(getText(Login_page.objOTP_Result), prop.getproperty("InvalidOTPErr"));
        click(Login_page.objConfirm_btn, "Confirm Button");
        if(verifyElementPresent(Login_page.objLogin_btn, "Login Button")){
            logger.info("MLS_TC_05, Successfully Validated confirm button in the \\\"invalid OTP\\\" modal redirects to login page");
            extentLogger("MLS_TC_05", "Successfully Validated confirm button in the \\\"invalid OTP\\\" modal redirects to login page"); 
        }            
    }
    public void MLS_TC_06_ValidateLogin_Function() throws Exception{
        HeaderChildNode("MLS_TC_06, To validate the login functionality using a valid registered number.");   
        loginValid(prop.getproperty("Branch_Verified"));
        if(verifyElementPresent(Home_page.objUser_name, "User name")){
            logger.info("Current user: "+getText(Home_page.objUser_name));         
            logger.info("MLS_TC_06, Successfully validated the login functionality using a valid registered number.");
            extentLogger("MLS_TC_06", "Successfully validated the login functionality using a valid registered number.\"");
        }
    }
    public void MLS_TC_08_ValidateLogin_RegisterRedirection() throws Exception{
        HeaderChildNode("MLS_TC_08, To Validate proceed button in the \"account not found\" modal redirects to registration page");
        navigateLoginPage();
        typeWeb(Login_page.objMobileNumber_field, prop.getproperty("Unregistered_Number"), "Mobile Number");
        click(Login_page.objLogin_btn, "Login Button");
        assertionValidation(getText(Login_page.objAccNotFound), prop.getproperty("AccNotFound"));
        click(Login_page.objProceed_btn, "Proceed Button");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("RegisterLink"));
      
        logger.info("MLS_TC_08, Successfully validated  proceed button in the \\\"account not found\\\" modal redirects to registration page");
        extentLogger("MLS_TC_06", "Successfully validated  proceed button in the \\\"account not found\\\" modal redirects to registration page");
    }
    public void MLS_TC_09_ValidateLogin_CancelRegister() throws Exception{
        HeaderChildNode("MLS_TC_09, To Validate cancel button in the \"account not found \"modal redirects to login page");
        navigateLoginPage();
        typeWeb(Login_page.objMobileNumber_field, prop.getproperty("Unregistered_Number"), "Mobile Number");
        click(Login_page.objLogin_btn, "Login Button");
        assertionValidation(getText(Login_page.objAccNotFound), prop.getproperty("AccNotFound"));
        click(Login_page.objCancel_btn, "Cancel Button");
        if(verifyElementPresent(Login_page.objLogin_btn, "Login Button")){
            logger.info("MLS_TC_09, Successfully validated  cancel button in the \"account not found \"modal redirects to login page");
            extentLogger("MLS_TC_09", "Successfully validated  cancel button in the \"account not found \"modal redirects to login page");
        }
    }
}
