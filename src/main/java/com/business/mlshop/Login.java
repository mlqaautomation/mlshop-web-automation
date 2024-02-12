package com.business.mlshop;

import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.ExtentReporter.extentLogger;
import static com.utility.ExtentReporter.getWebDriver;
import static com.utility.Utilities.assertionValidation;
import static com.utility.Utilities.*;


import com.MLShopPageObjects.Home_page; 
import com.MLShopPageObjects.Login_page;

import io.restassured.http.Header; 
public class Login extends BaseClass{

    //create method for login
    public void navigateLoginPage() throws Exception {
        waitTime(2000);
        //click on user icon
        click(Home_page.objUser_icon, "User icon");     
        //validate if user is in login page by using assertion validation 
        waitTime(2000);
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("LoginLink"));
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
}
