package com.business.mlshop;

import static com.utility.ExtentReporter.CTCurrentTime;
import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.ExtentReporter.ReportName;
import static com.utility.ExtentReporter.buildVersion;
import static com.utility.ExtentReporter.extentLogger;
import static com.utility.ExtentReporter.extentLoggerFail;
import static com.utility.ExtentReporter.extentLoggerPass;
import static com.utility.ExtentReporter.getWebDriver;
import static com.utility.Utilities.*;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.MLShopPageObjects.Home_page; 
import com.MLShopPageObjects.Profile_page;
import com.utility.ExtentReporter;
public class Home extends BaseClass{

    protected Login login = new Login();

    public void MS_TC_25_ValidateUserName_DropDown()throws Exception{
        HeaderChildNode("MS_TC_25, To Validate the \"Hi, <user first name>\" drop down menu options");
        login.loginValid(prop.getproperty("Branch_Verified"));
        if(verifyElementPresentAndClick(Home_page.objUser_name, "User Name")){          
            logger.info("Current user: "+getText(Home_page.objUser_name));       
            if(verifyElementPresent(Home_page.objProfile_option, "Proifle") && verifyElementPresent(Home_page.objPurchaseHistory_option, "Purchase History") 
            && verifyElementPresent(Home_page.objLogout_option,"Logout")){
                extentLogger("MS_TC_25", "To Validate the \"Hi, <user first name>\" drop down menu options");
            }           
        }
    }
    public void MLS_TC_26_ValidateProfile_Navigation()throws Exception{
        HeaderChildNode("MLS_TC_26, To Validate profile page navigation from user drop down menu");
        login.loginValid(prop.getproperty("Branch_Verified"));
        if(verifyElementPresentAndClick(Home_page.objUser_name, "User Name")){          
            logger.info("Current user: "+getText(Home_page.objUser_name));       
            verifyElementPresentAndClick(Home_page.objProfile_option, "Profile");
            if(verifyElementPresent(Profile_page.objProfile_fullName2, getText(Profile_page.objProfile_fullName2))){
                verifyElementPresent(Profile_page.objProfile_email, getText(Profile_page.objProfile_email));
                verifyElementPresent(Profile_page.objProfile_mobileNo, getText(Profile_page.objProfile_mobileNo));
                verifyElementPresent(Profile_page.objProfile_userTIer, getText(Profile_page.objProfile_userTIer));
                verifyElementPresent(Profile_page.objProfile_userStatus, getText(Profile_page.objProfile_userStatus));
                extentLogger("MLS_TC_26", "To Validate profile page navigation from user drop down menu");
            }
        }
    }
    public void MLS_TC_27_ValidatePurchaseHistory_Navigation() throws Exception {
        HeaderChildNode("MLS_TC_27, To Validate purchase history page navigation from user drop down menu");
        login.loginValid(prop.getproperty("Branch_Verified"));
        logger.info("Current user: " + getText(Home_page.objUser_name));
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objUser_name, getText(Home_page.objUser_name));
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objPurchaseHistory_option, "Purchase History");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("PurchaseHistoryLink"));
        extentLogger("MLS_TC_27", "To Validate purchase history page navigation from user drop down menu");
    }

    public void MLS_TC_28_ValidateLogout()throws Exception{
        HeaderChildNode("MLS_TC_28, To Validate logout functionality from user drop down menu");
        login.loginValid(prop.getproperty("Branch_Verified"));
        if(verifyElementPresentAndClick(Home_page.objUser_name, "User Name")){          
            logger.info("Current user: "+getText(Home_page.objUser_name));       
            verifyElementPresentAndClick(Home_page.objLogout_option, "Logout");  
            extentLogger("MLS_TC_28", "To Validate logout functionality from user drop down menu");         
        }
    }  

    public void MLS_TC_29_ValidateFilter_AllTypes()throws Exception{
        HeaderChildNode("MLS_TC_29, To Validate filter for all types of jewelry");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDownAllTypes, "All Types List");    
        filterItems("All");
        extentLogger("MLS_TC_29", "To Validate filter for all types of jewelry"); 
    }
    public void MLS_TC_30_ValidateFilter_Ring()throws Exception{
        HeaderChildNode("MLS_TC_30, To Validate jewelry type \"Ring\" will display all types of jewelry");    
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDownRing, "Ring Types list"); 
        waitTime(1000);
        filterItems("Ring");
        extentLoggerPass("MLS_TC_29", "To Validate jewelry type \"Ring\" will display all types of jewelry"); 
    }
    public void MLS_TC_31_ValidateFilter_Necklace()throws Exception{
        HeaderChildNode("MLS_TC_31, To Validate jewelry type \"Necklace\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDownNecklace, "Necklace Types list"); 
        waitTime(1000);
        filterItems("Necklace");
        extentLoggerPass("MLS_TC_31", "To Validate jewelry type \"Necklace\" will display all types of jewelry"); 
    }
    public void MLS_TC_32_ValidateFilter_Bracelets()throws Exception{
        HeaderChildNode("MLS_TC_32, To Validate jewelry type \"Braclets\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDownBracelets, "Bracelets Types list"); 
        waitTime(1000);
        filterItems("Braclets");
        extentLoggerPass("MLS_TC_30", "To Validate jewelry type \"Braclets\" will display all types of jewelry"); 
    }
    public void MLS_TC_33_ValidateFilter_Earrings()throws Exception{
        HeaderChildNode("MLS_TC_33, To Validate jewelry type \"Earrings\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDownEarrings, "Earrings Types list"); 
        waitTime(1000);
        filterItems("Earrings");
        extentLoggerPass("MLS_TC_33", "To Validate jewelry type \"Earrings\" will display all types of jewelry"); 
    }
    public void MLS_TC_34_ValidateFilter_Pendant()throws Exception{
        HeaderChildNode("MLS_TC_34, To Validate jewelry type \"Pendant\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDownPendant, "Pendant Types list"); 
        waitTime(1000);
        filterItems("Pendant");
        extentLoggerPass("MLS_TC_34", "To Validate jewelry type \"Pendant\" will display all types of jewelry"); 
    }
    public void MLS_TC_35_ValidateFilter_Brouch()throws Exception{
        HeaderChildNode("MLS_TC_35, To Validate jewelry type \"Brouch\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDownBrouch, "Brouch Types list"); 
        waitTime(1000);
        filterItems("Brouch");
        extentLoggerPass("MLS_TC_35", "To Validate jewelry type \"Brouch\" will display all types of jewelry"); 
    }
    public void MLS_TC_36_ValidateFilter_Engagement()throws Exception{
        HeaderChildNode("MLS_TC_36, To Validate jewelry type \"Engagement\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        verifyElementPresentAndClick(Home_page.objAllTypesDropDownEngagement, "Engagement Types list"); 
        waitTime(1000);
        filterItems("Engagement");
        //extentLoggerPass("MLS_TC_36", "To Validate jewelry type \"BroEngagementuch\" will display all types of jewelry"); 
    }
    public void MLS_TC_37_ValidateFilter_AllGoldKarat()throws Exception{
        HeaderChildNode("MLS_TC_37, To Validate jewelry type \"All Gold Karat\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDown, "All Gold Karat Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDownAllGoldKarats, "All Gold Karat Types list"); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_37", "To Validate jewelry type \"All Gold Karat\" will display all types of jewelry");
    }
    public void MLS_TC_38_ValidateFilter_14Karat()throws Exception{
        HeaderChildNode("MLS_TC_38, To Validate jewelry type \"14 Karat\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDown, "All Gold Karat Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDown14K, getText(Home_page.objAllGoldKaratsDropDown14K)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_38", "To Validate jewelry type \"14 Karat\" will display all types of jewelry");
    }
    public void MLS_TC_39_ValidateFilter_18Karat()throws Exception{
        HeaderChildNode("MLS_TC_39, To Validate jewelry type \"18 Karat\" will display all types of jewelry");
        
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDown, "All Gold Karat Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDown18K, getText(Home_page.objAllGoldKaratsDropDown18K)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_39", "To Validate jewelry type \"18 Karat\" will display all types of jewelry");
    }
    public void MLS_TC_40_ValidateFilter_AllGoldColors()throws Exception{
        HeaderChildNode("MLS_TC_40, To Validate jewelry type \"All Gold Colors\" will display all gold color jewelries");
        
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDownAllGoldColors, getText(Home_page.objAllGoldColorsDropDownAllGoldColors)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_40", "To Validate jewelry type \"All Gold Colors\" will display all gold color jewelries");
    }
    public void MLS_TC_41_ValidateFilter_YellowGold()throws Exception{
        HeaderChildNode("MLS_TC_41, To Validate jewelry type \"Yellow Gold\" will display yellow gold jewelries");
        
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDownYG, getText(Home_page.objAllGoldColorsDropDownYG)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_41", "To Validate jewelry type \"Yellow Gold\" will display yellow gold jewelries");
    }
    public void MLS_TC_42_ValidateFilter_WhiteGold()throws Exception{
        HeaderChildNode("MLS_TC_42, To Validate jewelry type \"White Gold\" will display yellow gold jewelries");
        
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDownWG, getText(Home_page.objAllGoldColorsDropDownWG)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_42", "To Validate jewelry type \"White Gold\" will display yellow gold jewelries");
    }
    public void MLS_TC_43_ValidateFilter_RoseGold()throws Exception{
        HeaderChildNode("MLS_TC_43, To Validate jewelry type \"Rose Gold\" will display yellow gold jewelries");
        
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDownRG, getText(Home_page.objAllGoldColorsDropDownRG)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_43", "To Validate jewelry type \"Rose Gold\" will display yellow gold jewelries");
    }
    public void MLS_TC_44_ValidateFilter_TwoTone()throws Exception{
        HeaderChildNode("MLS_TC_44, To Validate jewelry type \"Two - Tone\" will display yellow gold jewelries");
        
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDownTT, getText(Home_page.objAllGoldColorsDropDownTT)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_44", "To Validate jewelry type \"Two - Tone\" will display yellow gold jewelries");
    }
    public void MLS_TC_45_ValidateFilter_TriTone()throws Exception{
        HeaderChildNode("MLS_TC_45, To Validate jewelry type \"Tri- Tone\" will display tri-tone jewelries");
        
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDownTriT, getText(Home_page.objAllGoldColorsDropDownTriT)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_45", "To Validate jewelry type \"Tri- Tone\" will display tri-tone jewelries");
    }
    public void MLS_TC_46_ValidateFilter_AllGenders()throws Exception{
        HeaderChildNode("MLS_TC_46, To Validate jewelry type by \"All Genders\" filter will display all genders jewelries");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Gender Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDownAllGenders, getText(Home_page.objAllGendersDropDownAllGenders)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_46", "To Validate jewelry type \"Tri - Tone\" will display yellow gold jewelries");
    }
    public void MLS_TC_47_ValidateFilter_Ladies()throws Exception{
        HeaderChildNode("MLS_TC_47, To Validate jewelry type by \"Ladies\" filter will display ladies jewelries");

        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Gender Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDownLadies, getText(Home_page.objAllGendersDropDownLadies)); 
        waitTime(1000);
        filterItems("Ladies");
        extentLoggerPass("MLS_TC_47", "To Validate jewelry type by \"Ladies\" filter will display ladies jewelries");
    }
    public void MLS_TC_48_ValidateFilter_Mens()throws Exception{
        HeaderChildNode("MLS_TC_48, To Validate jewelry type by \"Ladies\" filter will display mens jewelries");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Gender Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDownMens, getText(Home_page.objAllGendersDropDownMens)); 
        waitTime(1000);
        filterItems("Mens");
        extentLoggerPass("MLS_TC_48", "To Validate jewelry type by \"Ladies\" filter will display mens jewelries");
    }
    public void MLS_TC_49_ValidateFilter_Unisex()throws Exception{
        HeaderChildNode("MLS_TC_49, To Validate jewelry type by \"Unisex\" filter will display unisex jewelries");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Gender Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDownUnisex, getText(Home_page.objAllGendersDropDownUnisex)); 
        waitTime(1000);
        filterItems("Unisex");
        extentLoggerPass("MLS_TC_49", "To Validate jewelry type by \"Unisex\" filter will display unisex jewelries");
    }
    public void MLS_TC_50_ValidateFilter_HightoLow()throws Exception{
        HeaderChildNode("MLS_TC_50, To Validate jewelry type by price \"High to Low\" will filter high to low");
        verifyElementPresentAndClick(Home_page.objSortByDropDown, "Sort By Drop Down");
        verifyElementPresentAndClick(Home_page.objSortByDropDownHighLow, getText(Home_page.objSortByDropDownHighLow)); 
        waitTime(1000);
        String firstPrice = getText(Home_page.objitemPrice_byIndex(1));
        double fprice = convertPriceStringToDouble(firstPrice);
        String secondPrice = getText(Home_page.objitemPrice_byIndex(2));
        double sprice = convertPriceStringToDouble(secondPrice);
        logger.info("firstPrice: " + firstPrice + ", secondPrice: " + secondPrice);
        if(fprice >= sprice){
            extentLoggerPass("MLS_TC_50", "First price is " + firstPrice + " is greater than second price" + secondPrice);
        }
        else{
            extentLoggerFail("MLS_TC_50", "High to low filtering is not working");
        }
    }
    public void MLS_TC_51_ValidateFilter_LowtoHigh()throws Exception{
        HeaderChildNode("MLS_TC_51, To Validate jewelry type by price \"High to Low\" will filter high to low");
        verifyElementPresentAndClick(Home_page.objSortByDropDown, "Sort By Drop Down");
        verifyElementPresentAndClick(Home_page.objSortByDropDownLowHigh, getText(Home_page.objSortByDropDownLowHigh)); 
        waitTime(1000);
        String firstPrice = getText(Home_page.objitemPrice_byIndex(1));
        double fprice = convertPriceStringToDouble(firstPrice);
        String secondPrice = getText(Home_page.objitemPrice_byIndex(2));
        double sprice = convertPriceStringToDouble(secondPrice);
        logger.info("firstPrice: " + firstPrice + ", secondPrice: " + secondPrice);
        if(fprice <= sprice){
            extentLoggerPass("MLS_TC_51", "First price is " + firstPrice + " is less than second price" + secondPrice);
        }
        else{
            extentLoggerFail("MLS_TC_51", "Low to high filtering is not working");
        }
    }
    public void MLS_TC_52_ValidateFilter_NewestOldest()throws Exception{
        HeaderChildNode("MLS_TC_52, To Validate jewelry type by price \"Newest to Oldest\" will filter newest to oldest");   
        verifyElementPresentAndClick(Home_page.objSortByDropDown, "Sort By Drop Down");
        verifyElementPresentAndClick(Home_page.objSortByDropDownNewOld, getText(Home_page.objSortByDropDownNewOld)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_52", "To Validate jewelry type by price \"High to Low\" will filter high to low");
    }
    public void MLS_TC_53_ValidateFilter_OldestNewest()throws Exception{
        HeaderChildNode("MLS_TC_53, To Validate jewelry type by price \"Oldest to Newest\" will filter oldest to newest");     
        verifyElementPresentAndClick(Home_page.objSortByDropDown, "Sort By Drop Down");
        verifyElementPresentAndClick(Home_page.objSortByDropDownOldNew, getText(Home_page.objSortByDropDownOldNew)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_53", "To Validate jewelry type by price \"Oldest to Newest\" will filter oldest to newest");
    }
    public void MLS_TC_57_ValidateFilter_WatchAllBrand()throws Exception{
        HeaderChildNode("MLS_TC_57, To Validate Brand Filter function \"All brands\" will display all types of brand");     
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
        verifyElementPresentAndClick(Home_page.objBrandsDropDownAllBrands, getText(Home_page.objBrandsDropDownAllBrands)); 
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_57", "To Validate Brand Filter function \"All brands\" will display all types of brand");
    }
    public void MLS_TC_58_ValidateFilter_RolexBrand()throws Exception{
        HeaderChildNode("MLS_TC_58, To Validate Brand Filter function \"Rolex\" will display rolex watch");       
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
        verifyElementPresentAndClick(Home_page.objBrandsDropDownRolex, getText(Home_page.objBrandsDropDownRolex)); 
        waitTime(1000);
        filterWatch("Rolex");
        extentLoggerPass("MLS_TC_58", "To Validate Brand Filter function \"Rolex\" will display rolex watch");
    }
    public void MLS_TC_59_ValidateFilter_OmegaBrand()throws Exception{
        HeaderChildNode("MLS_TC_59, To Validate Brand Filter function \"Omega\" will display Omega watch");       
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
        verifyElementPresentAndClick(Home_page.objBrandsDropDownOmega, getText(Home_page.objBrandsDropDownOmega)); 
        waitTime(1000);
        filterWatch("Omega");
        extentLoggerPass("MLS_TC_59", "To Validate Brand Filter function \"Omega\" will display Omega watch");
    }
    public void MLS_TC_60_ValidateFilter_TagHeuer()throws Exception{
        HeaderChildNode("MLS_TC_60, To Validate Brand Filter function \"Tag Heuer\" will display Tag Heuer watch");       
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
        verifyElementPresentAndClick(Home_page.objBrandsDropDownTagHeuer, getText(Home_page.objBrandsDropDownTagHeuer)); 
        waitTime(1000);
        filterWatch("Tag Heuer");
        extentLoggerPass("MLS_TC_60", "To Validate Brand Filter function \"Tag Heuer\" will display Tag Heuer watch");
    }
    
    public void MLS_TC_61_ValidateFilter_Seiko() throws Exception {
        HeaderChildNode("MLS_TC_61, To Validate Brand Filter function \"Seiko\" will display Seiko watch");       
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
        verifyElementPresentAndClick(Home_page.objBrandsDropDownSeiko, getText(Home_page.objBrandsDropDownSeiko));
        waitTime(1000);
        filterWatch("Seiko");
        extentLoggerPass("MLS_TC_61", "To Validate Brand Filter function \"Seiko\" will display Seiko watch");
    }
    public void MLS_TC_62_ValidateFilter_Casio() throws Exception {
        HeaderChildNode("MLS_TC_62, To Validate Brand Filter function \"Casio\" will display Casio watch");        
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
        verifyElementPresentAndClick(Home_page.objBrandsDropDownCasio, getText(Home_page.objBrandsDropDownCasio));
        waitTime(1000);
        filterWatch("Casio");
        extentLoggerPass("MLS_TC_62", "To Validate Brand Filter function \"Casio\" will display Casio watch");
    }
    public void MLS_TC_63_ValidateFilter_AllMovements_watch() throws Exception {
        HeaderChildNode("MLS_TC_63, To Validate Movements Filter function \"All Movements\" will display all watch");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllMovementDropDown, "All Movements Drop Down");
        verifyElementPresentAndClick(Home_page.objAllMovementDropDownAllMovements, getText(Home_page.objAllMovementDropDownAllMovements));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_63", "To Validate Movements Filter function \\\"All Movements\\\" will display all watch");
    }
    public void MLS_TC_64_ValidateFilter_Automatic_watch() throws Exception {
        HeaderChildNode("MLS_TC_64, To Validate Movements Filter function \"Automatic\" will display all watch");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllMovementDropDown, "All Movements Drop Down");
        verifyElementPresentAndClick(Home_page.objAllMovementDropDownAutomatic, getText(Home_page.objAllMovementDropDownAutomatic));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_64", "To Validate Movements Filter function \\\"Automatic\\\" will display all watch");
    }
    public void MLS_TC_65_ValidateFilter_Quartz_watch() throws Exception {
        HeaderChildNode("MLS_TC_65, To Validate Movements Filter function \"Quartz\" will display all watch");  
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllMovementDropDown, "All Movements Drop Down");
        verifyElementPresentAndClick(Home_page.objAllMovementDropDownQuartz, getText(Home_page.objAllMovementDropDownQuartz));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_65", "To Validate Movements Filter function \\\"Quartz\\\" will display all watch");
    }
    public void MLS_TC_66_ValidateFilter_Others_watch() throws Exception {
        HeaderChildNode("MLS_TC_66, To Validate Movements Filter function \"Others\" will display all watch");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllMovementDropDown, "All Movements Drop Down");
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objAllMovementDropDownOthers, getText(Home_page.objAllMovementDropDownOthers));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_66", "To Validate Movements Filter function \\\"Others\\\" will display all watch");
    }
    public void MLS_TC_67_ValidateFilter_allMaterials_watch() throws Exception {
        HeaderChildNode("MLS_TC_67, To Validate Material Filter function \"All Materials\" will display all materials watch");  
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllMaterialsDropDown, "All Materials Drop Down");
        verifyElementPresentAndClick(Home_page.objAllMaterialsDropDownAllMaterials, getText(Home_page.objAllMaterialsDropDownAllMaterials));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_67", "To Validate Material Filter function \\\"All Materials\\\" will display all materials watch");
    }
    public void MLS_TC_68_ValidateFilter_Stainless_watch() throws Exception {
        HeaderChildNode("MLS_TC_68, To Validate Material Filter function \"Stainless\" will display all stainless watch");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllMaterialsDropDown, "All Materials Drop Down");
        verifyElementPresentAndClick(Home_page.objAllMovementDropDownStainlessSteel, getText(Home_page.objAllMovementDropDownStainlessSteel));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_68", "To Validate Material Filter function \\\"Stainless\\\" will display all stainless watch");
    }
    public void MLS_TC_69_ValidateFilter_Ceramic_Polymer_watch() throws Exception {
        HeaderChildNode("MLS_TC_69, To Validate Material Filter function \"Ceramic/Polymer\" will display all cyramic / polymer watch");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllMaterialsDropDown, "All Materials Drop Down");
        verifyElementPresentAndClick(Home_page.objAllMovementDropDownCeramicPolymer, getText(Home_page.objAllMovementDropDownCeramicPolymer));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_69", "To Validate Material Filter function \\\"Ceramic/Polymer\\\" will display all cyramic / polymer watch");
    }
    public void MLS_TC_70_ValidateFilter_Gold_watch() throws Exception {
        HeaderChildNode("MLS_TC_70, To Validate Material Filter function \"Goldl\" will display all gold watch");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllMaterialsDropDown, "All Materials Drop Down");
        verifyElementPresentAndClick(Home_page.objAllMovementDropDownGold, getText(Home_page.objAllMovementDropDownGold));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_70", "To Validate Material Filter function \\\"Goldl\\\" will display all gold watch");
    }
    public void MLS_TC_71_ValidateFilter_allGenders_watch() throws Exception {
        HeaderChildNode("MLS_TC_71, To Validate watch type by \"All Genders\" filter will display all watches");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Materials Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDownAllGenders, getText(Home_page.objAllGendersDropDownAllGenders));
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_71", "To Validate watch type by \"All Genders\" filter will display all watches");
    }
    public void MLS_TC_72_ValidateFilter_Ladies_watch() throws Exception {
        HeaderChildNode("MLS_TC_72, To Validate watch type by \"Ladies\" filter will display ladies watches");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Genders Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDownLadies, getText(Home_page.objAllGendersDropDownLadies));
        waitTime(1000);
        filterWatch("Ladies");
        extentLoggerPass("MLS_TC_72", "To Validate watch type by \"Ladies\" filter will display ladies watches");
    }
    public void MLS_TC_73_ValidateFilter_Mens_watch() throws Exception {
        HeaderChildNode("MLS_TC_73, To Validate watch type by \"Men's\" filter will display men's watches");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Genders Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDownMens, getText(Home_page.objAllGendersDropDownMens));
        waitTime(1000);
        filterWatch("Mens");
        extentLoggerPass("MLS_TC_73", "To Validate watch type by \"Men's\" filter will display men's watches");
    }
    public void MLS_TC_74_ValidateFilter_Unisex_watch() throws Exception {
        HeaderChildNode("MLS_TC_74, To Validate watch type by \"Unisex\" filter will display unisex watches");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Genders Drop Down");
        verifyElementPresentAndClick(Home_page.objAllGendersDropDownUnisex, getText(Home_page.objAllGendersDropDownUnisex));
        waitTime(1000);
        filterWatch("Unisex");
        extentLoggerPass("MLS_TC_74", "To Validate watch type by \"Unisex\" filter will display unisex watches");
    }

    public void MLS_TC_79_ValidateProduct_jewelry() throws Exception {
        HeaderChildNode("MLS_TC_79, To Validate product details in Jewelry tab home page");
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objJewelryTab, "Jewelry tab");
        if(verifyElementPresent(Home_page.objitem_byIndex(1), getText(Home_page.objitemName_byIndex(1)))){
            ExtentReporter.extentLoggerPass("MLS_TC_79", "To Validate product details in Jewelry tab home page");
        }
    }

    public void MLS_TC_80_ValidateProduct_amaparito() throws Exception {
        HeaderChildNode("MLS_TC_80, To Validate product details in Amparito Collections tab home page");
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objAmparitoCollectionsTab, "Amparito Collections tab");
        if(verifyElementPresent(Home_page.objitem_byIndex(1), getText(Home_page.objitemName_byIndex(1)))){
            ExtentReporter.extentLoggerPass("MLS_TC_79", "To Validate product details in Jewelry tab home page");
        }     
    }  

    public void MLS_TC_81_ValidateProduct_watch() throws Exception {
        HeaderChildNode("MLS_TC_81, To Validate product details in Watches tab home page");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        if(verifyElementPresent(Home_page.objitem_byIndex(1), getText(Home_page.objitemName_byIndex(1)))){
            ExtentReporter.extentLoggerPass("MLS_TC_81", "To Validate product details in Watches tab home page");
        }     
    }
    public void MLS_TC_82_ValidateProduct_jewelryDetails() throws Exception {
        HeaderChildNode("MLS_TC_82, To Validate product details navigation after verifyElementPresentAndClicking a product from Jewelry tab home page");
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objJewelryTab, "Jewelry tab");
        if(verifyElementPresentAndClick(Home_page.objitem_byIndex(1), getText(Home_page.objitemName_byIndex(1)))){
            verifyElementPresent(Home_page.objitem_productDetails_title, getText(Home_page.objitem_productDetails_title));
            verifyElementPresent(Home_page.objitem_productDetails_descriptions, getText(Home_page.objitem_productDetails_descriptions));
            verifyElementPresent(Home_page.objitem_productDetails_stockNumber, getText(Home_page.objitem_productDetails_stockNumber));
            verifyElementPresent(Home_page.objitem_productDetails_prices, getText(Home_page.objitem_productDetails_prices));
            verifyElementPresent(Home_page.objitem_productDetails_spec_goldKarat, getText(Home_page.objitem_productDetails_spec_goldKarat));
            verifyElementPresent(Home_page.objitem_productDetails_spec_goldColor, getText(Home_page.objitem_productDetails_spec_goldColor));
            verifyElementPresent(Home_page.objitem_productDetails_spec_stone, getText(Home_page.objitem_productDetails_spec_stone));
            verifyElementPresent(Home_page.objitem_productDetails_spec_stoneColor, getText(Home_page.objitem_productDetails_spec_stoneColor));
            verifyElementPresent(Home_page.objitem_productDetails_spec_size, getText(Home_page.objitem_productDetails_spec_size));
            verifyElementPresent(Home_page.objitem_productDetails_spec_itemWeight, getText(Home_page.objitem_productDetails_spec_itemWeight));
            ExtentReporter.extentLoggerPass("MLS_TC_82", "To Validate product details navigation after verifyElementPresentAndClicking a product from Jewelry tab home page");
        }
    }
    public void MLS_TC_83_ValidateProduct_amparitoDetails() throws Exception {
        HeaderChildNode("MLS_TC_83, To Validate product details navigation after verifyElementPresentAndClicking a product from Jewelry tab home page");
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objAmparitoCollectionsTab, "Amparito tab");
        if(verifyElementPresentAndClick(Home_page.objitem_byIndex(1), getText(Home_page.objitemName_byIndex(1)))){
            verifyElementPresent(Home_page.objitem_productDetails_title, getText(Home_page.objitem_productDetails_title));
            verifyElementPresent(Home_page.objitem_productDetails_descriptions, getText(Home_page.objitem_productDetails_descriptions));
            verifyElementPresent(Home_page.objitem_productDetails_stockNumber, getText(Home_page.objitem_productDetails_stockNumber));
            verifyElementPresent(Home_page.objitem_productDetails_prices, getText(Home_page.objitem_productDetails_prices));
            verifyElementPresent(Home_page.objitem_productDetails_spec_goldKarat, getText(Home_page.objitem_productDetails_spec_goldKarat));
            verifyElementPresent(Home_page.objitem_productDetails_spec_goldColor, getText(Home_page.objitem_productDetails_spec_goldColor));
            verifyElementPresent(Home_page.objitem_productDetails_spec_stone, getText(Home_page.objitem_productDetails_spec_stone));
            verifyElementPresent(Home_page.objitem_productDetails_spec_stoneColor, getText(Home_page.objitem_productDetails_spec_stoneColor));
            verifyElementPresent(Home_page.objitem_productDetails_spec_size, getText(Home_page.objitem_productDetails_spec_size));
            verifyElementPresent(Home_page.objitem_productDetails_spec_itemWeight, getText(Home_page.objitem_productDetails_spec_itemWeight));
            ExtentReporter.extentLoggerPass("MLS_TC_83", "To Validate product details navigation after verifyElementPresentAndClicking a product from Jewelry tab home page");
        }
    }
    public void MLS_TC_84_ValidateProduct_watchDetails() throws Exception {
        HeaderChildNode("MLS_TC_84, To Validate product details navigation after verifyElementPresentAndClicking a product from Jewelry tab home page");
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watches tab");
        waitTime(1000);
        if(verifyElementPresentAndClick(Home_page.objitem_byIndex(1), getText(Home_page.objitemName_byIndex(1)))){
            verifyElementPresent(Home_page.objitem_productDetails_title, getText(Home_page.objitem_productDetails_title));
            verifyElementPresent(Home_page.objitem_productDetails_descriptions, getText(Home_page.objitem_productDetails_descriptions));
            verifyElementPresent(Home_page.objitem_productDetails_stockNumber, getText(Home_page.objitem_productDetails_stockNumber));
            verifyElementPresent(Home_page.objitem_productDetails_prices, getText(Home_page.objitem_productDetails_prices));
            verifyElementPresent(Home_page.objitem_productDetails_spec_material, getText(Home_page.objitem_productDetails_spec_material));
            verifyElementPresent(Home_page.objitem_productDetails_spec_movement, getText(Home_page.objitem_productDetails_spec_movement));
            verifyElementPresent(Home_page.objitem_productDetails_spec_watchsize, getText(Home_page.objitem_productDetails_spec_watchsize));
            verifyElementPresent(Home_page.objitem_productDetails_spec_notes, getText(Home_page.objitem_productDetails_spec_notes));
            ExtentReporter.extentLoggerPass("MLS_TC_84", "To Validate product details navigation after verifyElementPresentAndClicking a product from Jewelry tab home page");
        }
    }
    public void MLS_TC_85_ValidateJewelry_addToCart() throws Exception {
        HeaderChildNode("MLS_TC_85, To Validate successful add item modal pop to shopping cart from jewelry tab");    
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objJewelryTab, "Jewelry tab");
        verifyElementPresentAndClick(Home_page.objitemName_byIndex(1), getText(Home_page.objitemName_byIndex(1)));
        waitTime(2000);
        verifyElementPresentAndClick(Home_page.objitem_productDetails_addToCart_btn, getText(Home_page.objitem_productDetails_addToCart_btn));
        if(verifyElementPresent(Home_page.objitem_productDetails_successAddModal, getText(Home_page.objitem_productDetails_successAddModal))){
            ExtentReporter.extentLoggerPass("MLS_TC_85", "To Validate successful add item modal pop to shopping cart from jewelry tab");
        }      
    }
    public void MLS_TC_86_ValidateAmparito_addToCart() throws Exception {
        HeaderChildNode("MLS_TC_86, To Validate successful add item modal pop to shopping cart from amparito collections tab");       
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objAmparitoCollectionsTab, "Amparito tab");
        verifyElementPresentAndClick(Home_page.objitemName_byIndex(1), getText(Home_page.objitemName_byIndex(1)));
        waitTime(2000);
        verifyElementPresentAndClick(Home_page.objitem_productDetails_addToCart_btn, getText(Home_page.objitem_productDetails_addToCart_btn));    
        if(verifyElementPresent(Home_page.objitem_productDetails_successAddModal, getText(Home_page.objitem_productDetails_successAddModal))){
            ExtentReporter.extentLoggerPass("MLS_TC_86", "To Validate successful add item modal pop to shopping cart from amparito collections tab");
        }     
    }
    public void MLS_TC_87_ValidateWatch_addToCart() throws Exception {
        HeaderChildNode("MLS_TC_87, To Validate successful add item modal pop to shopping cart from watches tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objitemName_byIndex(1), getText(Home_page.objitemName_byIndex(1)));
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objitem_productDetails_addToCart_btn, getText(Home_page.objitem_productDetails_addToCart_btn));
        waitTime(1000);
        if(verifyElementPresent(Home_page.objitem_productDetails_successAddModal, getText(Home_page.objitem_productDetails_successAddModal))){
            ExtentReporter.extentLoggerPass("MLS_TC_87", "To Validate successful add item modal pop to shopping cart from watches tab");
        }     
    }
    public void MLS_TC_89_ValidateItem_alreadyInCart() throws Exception {
        HeaderChildNode("MLS_TC_89, To Validate successful add item modal pop to shopping cart from watches tab");
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objWatchesTab, "Watch tab");
        waitTime(3000);
        verifyElementPresentAndClick(Home_page.objitemName_byIndex(1), getText(Home_page.objitemName_byIndex(1)));
        waitTime(1000);
        verifyElementPresentAndClick(Home_page.objitem_productDetails_addToCart_btn, getText(Home_page.objitem_productDetails_addToCart_btn));
        waitTime(1000);
        if(verifyElementPresent(Home_page.objitem_productDetails_successAddModal, getText(Home_page.objitem_productDetails_successAddModal))){
            verifyElementPresentAndClick(Home_page.objitem_productDetails_confirmBtn , "Confirm Btn");
            waitTime(1000);
            verifyElementPresentAndClick(Home_page.objitem_productDetails_addToCart_btn, "Add to cart");
            verifyElementPresent(Home_page.objitem_productDetails_alreadyInCart, getText(Home_page.objitem_productDetails_alreadyInCart));
            ExtentReporter.extentLoggerPass("MLS_TC_89", "To Validate successful add item modal pop to shopping cart from watches tab");
        }     
    }
    
    public String[] addItemToCart(String type, int index) throws Exception {
        String tabName;
        waitTime(2000);
        switch (type) {
            case "Jewelry":
                tabName = "Jewelry tab";
                verifyElementPresentAndClick(Home_page.objJewelryTab, tabName);
                break;
            case "Amparito":
                tabName = "Amparito tab";
                verifyElementPresentAndClick(Home_page.objAmparitoCollectionsTab, tabName);
                break;
            case "Watch":
                tabName = "Watches tab";
                verifyElementPresentAndClick(Home_page.objWatchesTab, tabName);
                break;
            default:
                ExtentReporter.extentLoggerFail("Type", "Failed to find items");
                return null; // Exit the method if the type is not recognized
        }    
        waitTime(1000);
        String itemName = getText(Home_page.objitemName_byIndex(index));  
        verifyElementPresentAndClick(Home_page.objitemName_byIndex(index), itemName);  
        waitTime(2000);
        String itemStockNumber = getText(Home_page.objitem_productDetails_stockNumber);
        verifyElementPresentAndClick(Home_page.objitem_productDetails_addToCart_btn, "Add to Cart btn");    
        verifyElementPresentAndClick(Home_page.objitem_productDetails_confirmBtn, "Confirm btn");
        return new String[]{itemName, itemStockNumber};
    }

    public void filterItems(String filter) throws Exception {
        List<WebElement> itemCard = getWebDriver().findElements(Home_page.objitem_all);
        int iterationCount = 0;  // Counter to track iterations

        if (!itemCard.isEmpty()) {  // Check if itemCard is not empty
            for (WebElement card : itemCard) {
                WebElement item = card.findElement(Home_page.objitem_titles);
                WebElement description = card.findElement(Home_page.objitem_descriptions);
                String itemName = item.getText();
                
                if (filter.equals("All") || 
                    itemName.contains(filter) || 
                    description.getText().contains("14k") || 
                    description.getText().contains("18k") ||
                    description.getText().contains("Yellow Gold") ||
                    description.getText().contains("White Gold") ||
                    description.getText().contains("Rose Gold") ||
                    description.getText().contains("Two - Tone") ||
                    description.getText().contains("Tri - Tone")) {
                    verifyElementPresent(item, itemName);
                    verifyElementPresent(description, description.getText());
                    iterationCount++;
                }
                
                // Break the loop if the counter reaches 1
                if (iterationCount == 1) {
                    logger.info("---Breaking Filter Loop---");
                    break;
                }
            }
            
            // Log a message if the filter didn't match any items
            if (iterationCount == 0) {
                logger.info("No items matching the filter: " + filter);
            }
        } else {
            ExtentReporter.extentLoggerFail("Filter", "Failed to find items");
            logger.info("itemCard is empty. No items to filter.");
        }
    }
    public void filterWatch(String filter) throws Exception {
        List<WebElement> itemCard = getWebDriver().findElements(Home_page.objitem_allWatches);
        int iterationCount = 0;  // Counter to track iterations
    
        for (WebElement card : itemCard) {
            WebElement item = card.findElement(Home_page.objitem_watches_titles);
            WebElement description = card.findElement(Home_page.objitem_watches_descriptions);
            String itemName = item.getText();
            String descriptionText = description.getText();
    
            if (filter.equals("All") ||
                    itemName.contains(filter) ||
                    descriptionText.contains("Automatic") ||
                    descriptionText.contains("Quartz") ||
                    descriptionText.contains("Others") ||
                    descriptionText.contains("Stainless Steel") ||
                    descriptionText.contains("Gold")){
                verifyElementPresent(item, itemName);
                verifyElementPresent(description, descriptionText);
                iterationCount++;
                // Break the loop if the counter reaches 1
                if (iterationCount == 1) {
                    logger.info("---Breaking Filter Loop---");
                    break;
                }
            }
        }
        // Log a message if the filter didn't match any items
        if (iterationCount == 0) {
            ExtentReporter.extentLoggerFail("Filter", "Failed to find items");
            logger.info("No items matching the filter: " + filter);
        }
    }
    public static double convertPriceStringToDouble(String priceString) {
    // Remove non-numeric characters except for the decimal separator
    String cleanedString = priceString.replaceAll("[^\\d.]", "");

    // Parse the cleaned string into a double
    try {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        return format.parse(cleanedString).doubleValue();
    } catch (ParseException ex) {
        // Handle the exception (e.g., log an error message or throw a custom exception)
        // Return a default value or rethrow the exception, depending on your requirements
        return 0.0;
        }
    }
}
