package com.business.mlshop;
import static com.utility.ExtentReporter.CTCurrentTime;
import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.ExtentReporter.ReportName;
import static com.utility.ExtentReporter.buildVersion;
import static com.utility.ExtentReporter.extentLogger;
import static com.utility.ExtentReporter.extentLoggerPass;
import static com.utility.ExtentReporter.getWebDriver;
import static com.utility.Utilities.*;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.MLShopPageObjects.Home_page; 
import com.MLShopPageObjects.Profile_page;
import com.utility.ExtentReporter;
public class PurchaseHistory extends BaseClass{

    public void navigatePurchaseHistory() throws Exception{
        scrollToTopOfPageWEB();
        verifyElementPresentAndClick(Home_page.objUser_name, getText(Home_page.objUser_name));
        verifyElementPresentAndClick(Home_page.objPurchaseHistory_option, getText(Home_page.objPurchaseHistory_option));
        
    }
}
