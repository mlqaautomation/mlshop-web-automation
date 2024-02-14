package com.business.mlshop;

import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.ExtentReporter.extentLogger;
import static com.utility.ExtentReporter.getWebDriver;
import static com.utility.Utilities.*;


import com.MLShopPageObjects.Home_page; 
public class Home extends BaseClass{
    Login login;
    public void MS_TC_25_ValidateUserName_LoggedIn()throws Exception{
        HeaderChildNode("MS_TC_25, To Validate User Name is logged in");
        login.loginValid(prop.getproperty("Branch_Verified"));
        if(verifyElementPresent(Home_page.objUser_name, "User Name")){
            logger.info("Current user: "+getText(Home_page.objUser_name));
            extentLogger("MS_TC_25", "To Validate User Name is logged in");
        }
    }
}
