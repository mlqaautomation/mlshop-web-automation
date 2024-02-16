package com.business.mlshop;

import static com.utility.ExtentReporter.HeaderChildNode;
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
    public void MLS_TC_27_ValidatePurchaseHistory_Navigation()throws Exception{
        HeaderChildNode("MLS_TC_27, To Validate purchase history page navigation from user drop down menu");
        login.loginValid(prop.getproperty("Branch_Verified"));
        if(verifyElementPresentAndClick(Home_page.objUser_name, "User Name")){          
            logger.info("Current user: "+getText(Home_page.objUser_name));       
            verifyElementPresentAndClick(Home_page.objPurchaseHistory_option, "Pruchase History");
            assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("PurchaseHistoryLink"));
            extentLogger("MLS_TC_27", "To Validate purchase history page navigation from user drop down menu");         
        }
    }  

    public void MLS_TC_28_ValidateLogout()throws Exception{
        HeaderChildNode("MLS_TC_28, To Validate logout functionality from user drop down menu");
        login.loginValid(prop.getproperty("Branch_Verified"));
        if(verifyElementPresentAndClick(Home_page.objUser_name, "User Name")){          
            logger.info("Current user: "+getText(Home_page.objUser_name));       
            verifyElementPresentAndClick(Home_page.objLogout_option, "Logout");
            assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
            extentLogger("MLS_TC_28", "To Validate logout functionality from user drop down menu");         
        }
    }  

    public void MLS_TC_29_ValidateFilter_AllTypes()throws Exception{
        HeaderChildNode("MLS_TC_29, To Validate filter for all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        click(Home_page.objAllTypesDropDownAllTypes, "All Types List");    
        filterItems("All");
        extentLogger("MLS_TC_29", "To Validate filter for all types of jewelry"); 
    }
    public void MLS_TC_30_ValidateFilter_Ring()throws Exception{
        HeaderChildNode("MLS_TC_30, To Validate jewelry type \"Ring\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        click(Home_page.objAllTypesDropDownRing, "Ring Types list"); 
        waitTime(1000);
        filterItems("Ring");
        extentLoggerPass("MLS_TC_29", "To Validate jewelry type \"Ring\" will display all types of jewelry"); 
    }
    public void MLS_TC_31_ValidateFilter_Necklace()throws Exception{
        HeaderChildNode("MLS_TC_31, To Validate jewelry type \"Necklace\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        click(Home_page.objAllTypesDropDownNecklace, "Necklace Types list"); 
        waitTime(1000);
        filterItems("Necklace");
        extentLoggerPass("MLS_TC_31", "To Validate jewelry type \"Necklace\" will display all types of jewelry"); 
    }
    public void MLS_TC_32_ValidateFilter_Bracelets()throws Exception{
        HeaderChildNode("MLS_TC_32, To Validate jewelry type \"Braclets\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        click(Home_page.objAllTypesDropDownBracelets, "Bracelets Types list"); 
        waitTime(1000);
        filterItems("Braclets");
        extentLoggerPass("MLS_TC_30", "To Validate jewelry type \"Braclets\" will display all types of jewelry"); 
    }
    public void MLS_TC_33_ValidateFilter_Earrings()throws Exception{
        HeaderChildNode("MLS_TC_33, To Validate jewelry type \"Earrings\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        click(Home_page.objAllTypesDropDownEarrings, "Earrings Types list"); 
        waitTime(1000);
        filterItems("Earrings");
        extentLoggerPass("MLS_TC_33", "To Validate jewelry type \"Earrings\" will display all types of jewelry"); 
    }
    public void MLS_TC_34_ValidateFilter_Pendant()throws Exception{
        HeaderChildNode("MLS_TC_34, To Validate jewelry type \"Pendant\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        click(Home_page.objAllTypesDropDownPendant, "Pendant Types list"); 
        waitTime(1000);
        filterItems("Pendant");
        extentLoggerPass("MLS_TC_34", "To Validate jewelry type \"Pendant\" will display all types of jewelry"); 
    }
    public void MLS_TC_35_ValidateFilter_Brouch()throws Exception{
        HeaderChildNode("MLS_TC_35, To Validate jewelry type \"Brouch\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        click(Home_page.objAllTypesDropDownBrouch, "Brouch Types list"); 
        waitTime(1000);
        filterItems("Brouch");
        extentLoggerPass("MLS_TC_35", "To Validate jewelry type \"Brouch\" will display all types of jewelry"); 
    }
    public void MLS_TC_36_ValidateFilter_Engagement()throws Exception{
        HeaderChildNode("MLS_TC_36, To Validate jewelry type \"Engagement\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllTypesDropDown, "All Types Drop Down");
        click(Home_page.objAllTypesDropDownEngagement, "Engagement Types list"); 
        waitTime(1000);
        filterItems("Engagement");
        //extentLoggerPass("MLS_TC_36", "To Validate jewelry type \"BroEngagementuch\" will display all types of jewelry"); 
    }
    public void MLS_TC_37_ValidateFilter_AllGoldKarat()throws Exception{
        HeaderChildNode("MLS_TC_37, To Validate jewelry type \"All Gold Karat\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDown, "All Gold Karat Drop Down");
        click(Home_page.objAllGoldKaratsDropDownAllGoldKarats, "All Gold Karat Types list"); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_37", "To Validate jewelry type \"All Gold Karat\" will display all types of jewelry");
    }
    public void MLS_TC_38_ValidateFilter_14Karat()throws Exception{
        HeaderChildNode("MLS_TC_38, To Validate jewelry type \"14 Karat\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDown, "All Gold Karat Drop Down");
        click(Home_page.objAllGoldKaratsDropDown14K, getText(Home_page.objAllGoldKaratsDropDown14K)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_38", "To Validate jewelry type \"14 Karat\" will display all types of jewelry");
    }
    public void MLS_TC_39_ValidateFilter_18Karat()throws Exception{
        HeaderChildNode("MLS_TC_39, To Validate jewelry type \"18 Karat\" will display all types of jewelry");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldKaratsDropDown, "All Gold Karat Drop Down");
        click(Home_page.objAllGoldKaratsDropDown18K, getText(Home_page.objAllGoldKaratsDropDown18K)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_39", "To Validate jewelry type \"18 Karat\" will display all types of jewelry");
    }
    public void MLS_TC_40_ValidateFilter_AllGoldColors()throws Exception{
        HeaderChildNode("MLS_TC_40, To Validate jewelry type \"All Gold Colors\" will display all gold color jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        click(Home_page.objAllGoldColorsDropDownAllGoldColors, getText(Home_page.objAllGoldColorsDropDownAllGoldColors)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_40", "To Validate jewelry type \"All Gold Colors\" will display all gold color jewelries");
    }
    public void MLS_TC_41_ValidateFilter_YellowGold()throws Exception{
        HeaderChildNode("MLS_TC_41, To Validate jewelry type \"Yellow Gold\" will display yellow gold jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        click(Home_page.objAllGoldColorsDropDownYG, getText(Home_page.objAllGoldColorsDropDownYG)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_41", "To Validate jewelry type \"Yellow Gold\" will display yellow gold jewelries");
    }
    public void MLS_TC_42_ValidateFilter_WhiteGold()throws Exception{
        HeaderChildNode("MLS_TC_42, To Validate jewelry type \"White Gold\" will display yellow gold jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        click(Home_page.objAllGoldColorsDropDownWG, getText(Home_page.objAllGoldColorsDropDownWG)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_42", "To Validate jewelry type \"White Gold\" will display yellow gold jewelries");
    }
    public void MLS_TC_43_ValidateFilter_RoseGold()throws Exception{
        HeaderChildNode("MLS_TC_43, To Validate jewelry type \"Rose Gold\" will display yellow gold jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        click(Home_page.objAllGoldColorsDropDownRG, getText(Home_page.objAllGoldColorsDropDownRG)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_43", "To Validate jewelry type \"Rose Gold\" will display yellow gold jewelries");
    }
    public void MLS_TC_44_ValidateFilter_TwoTone()throws Exception{
        HeaderChildNode("MLS_TC_44, To Validate jewelry type \"Two - Tone\" will display yellow gold jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        click(Home_page.objAllGoldColorsDropDownTT, getText(Home_page.objAllGoldColorsDropDownTT)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_44", "To Validate jewelry type \"Two - Tone\" will display yellow gold jewelries");
    }
    public void MLS_TC_45_ValidateFilter_TriTone()throws Exception{
        HeaderChildNode("MLS_TC_45, To Validate jewelry type \"Tri- Tone\" will display tri-tone jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGoldColorsDropDown, "All Gold Colors Drop Down");
        click(Home_page.objAllGoldColorsDropDownTriT, getText(Home_page.objAllGoldColorsDropDownTriT)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_45", "To Validate jewelry type \"Tri- Tone\" will display tri-tone jewelries");
    }
    public void MLS_TC_46_ValidateFilter_AllGenders()throws Exception{
        HeaderChildNode("MLS_TC_46, To Validate jewelry type by \"All Genders\" filter will display all genders jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Gender Drop Down");
        click(Home_page.objAllGendersDropDownAllGenders, getText(Home_page.objAllGendersDropDownAllGenders)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_46", "To Validate jewelry type \"Tri - Tone\" will display yellow gold jewelries");
    }
    public void MLS_TC_47_ValidateFilter_Ladies()throws Exception{
        HeaderChildNode("MLS_TC_47, To Validate jewelry type by \"Ladies\" filter will display ladies jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Gender Drop Down");
        click(Home_page.objAllGendersDropDownLadies, getText(Home_page.objAllGendersDropDownLadies)); 
        waitTime(1000);
        filterItems("Ladies");
        extentLoggerPass("MLS_TC_47", "To Validate jewelry type by \"Ladies\" filter will display ladies jewelries");
    }
    public void MLS_TC_48_ValidateFilter_Mens()throws Exception{
        HeaderChildNode("MLS_TC_48, To Validate jewelry type by \"Ladies\" filter will display mens jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Gender Drop Down");
        click(Home_page.objAllGendersDropDownMens, getText(Home_page.objAllGendersDropDownMens)); 
        waitTime(1000);
        filterItems("Mens");
        extentLoggerPass("MLS_TC_48", "To Validate jewelry type by \"Ladies\" filter will display mens jewelries");
    }
    public void MLS_TC_49_ValidateFilter_Unisex()throws Exception{
        HeaderChildNode("MLS_TC_49, To Validate jewelry type by \"Unisex\" filter will display unisex jewelries");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objAllGendersDropDown, "All Gender Drop Down");
        click(Home_page.objAllGendersDropDownUnisex, getText(Home_page.objAllGendersDropDownUnisex)); 
        waitTime(1000);
        filterItems("Unisex");
        extentLoggerPass("MLS_TC_49", "To Validate jewelry type by \"Unisex\" filter will display unisex jewelries");
    }
    public void MLS_TC_50_ValidateFilter_HightoLow()throws Exception{
        HeaderChildNode("MLS_TC_50, To Validate jewelry type by price \"High to Low\" will filter high to low");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objSortByDropDown, "Sort By Drop Down");
        click(Home_page.objSortByDropDownHighLow, getText(Home_page.objSortByDropDownHighLow)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_50", "To Validate jewelry type by price \"High to Low\" will filter high to low");
    }
    public void MLS_TC_51_ValidateFilter_LowtoHigh()throws Exception{
        HeaderChildNode("MLS_TC_51, To Validate jewelry type by price \"High to Low\" will filter high to low");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objSortByDropDown, "Sort By Drop Down");
        click(Home_page.objSortByDropDownLowHigh, getText(Home_page.objSortByDropDownLowHigh)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_51", "To Validate jewelry type by price \"High to Low\" will filter high to low");
    }
    public void MLS_TC_52_ValidateFilter_NewestOldest()throws Exception{
        HeaderChildNode("MLS_TC_52, To Validate jewelry type by price \"Newest to Oldest\" will filter newest to oldest");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objSortByDropDown, "Sort By Drop Down");
        click(Home_page.objSortByDropDownNewOld, getText(Home_page.objSortByDropDownNewOld)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_52", "To Validate jewelry type by price \"High to Low\" will filter high to low");
    }
    public void MLS_TC_53_ValidateFilter_OldestNewest()throws Exception{
        HeaderChildNode("MLS_TC_53, To Validate jewelry type by price \"Oldest to Newest\" will filter oldest to newest");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        verifyElementPresentAndClick(Home_page.objSortByDropDown, "Sort By Drop Down");
        click(Home_page.objSortByDropDownOldNew, getText(Home_page.objSortByDropDownOldNew)); 
        waitTime(1000);
        filterItems("All");
        extentLoggerPass("MLS_TC_53", "To Validate jewelry type by price \"Oldest to Newest\" will filter oldest to newest");
    }
    public void MLS_TC_57_ValidateFilter_WatchAllBrand()throws Exception{
        HeaderChildNode("MLS_TC_57, To Validate Brand Filter function \"All brands\" will display all types of brand");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
        waitTime(1000);
        click(Home_page.objWatchesTab, "Watch Tab");
        waitTime(1000);
        click(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
        click(Home_page.objBrandsDropDownAllBrands, getText(Home_page.objBrandsDropDownAllBrands)); 
        waitTime(1000);
        filterWatch("All");
        extentLoggerPass("MLS_TC_57", "To Validate Brand Filter function \"All brands\" will display all types of brand");
    }
    // public void MLS_TC_58_ValidateFilter_RolexBrand()throws Exception{
    //     HeaderChildNode("MLS_TC_58, To Validate Brand Filter function \"Rolex\" will display rolex watch");
    //     assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
    //     waitTime(1000);
    //     click(Home_page.objWatchesTab, "Watch Tab");
    //     waitTime(1000);
    //     click(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
    //     click(Home_page.objBrandsDropDownRolex, getText(Home_page.objBrandsDropDownRolex)); 
    //     waitTime(1000);
    //     filterWatch("All");
    //     extentLoggerPass("MLS_TC_58", "To Validate Brand Filter function \"Rolex\" will display rolex watch");
    // }
    // public void MLS_TC_59_ValidateFilter_OmegaBrand()throws Exception{
    //     HeaderChildNode("MLS_TC_59, To Validate Brand Filter function \"Omega\" will display Omega watch");
    //     assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
    //     waitTime(1000);
    //     click(Home_page.objWatchesTab, "Watch Tab");
    //     waitTime(1000);
    //     click(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
    //     click(Home_page.objBrandsDropDownOmega, getText(Home_page.objBrandsDropDownOmega)); 
    //     waitTime(1000);
    //     filterWatch("All");
    //     extentLoggerPass("MLS_TC_59", "To Validate Brand Filter function \"Omega\" will display Omega watch");
    // }
    // public void MLS_TC_60_ValidateFilter_TagHeuer()throws Exception{
    //     HeaderChildNode("MLS_TC_60, To Validate Brand Filter function \"Tag Heuer\" will display Tag Heuer watch");
    //     assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("Link"));
    //     waitTime(1000);
    //     click(Home_page.objWatchesTab, "Watch Tab");
    //     waitTime(1000);
    //     click(Home_page.objAllBrandsDropDown, "All Brands Drop Down");
    //     click(Home_page.objBrandsDropDownOmega, getText(Home_page.objBrandsDropDownOmega)); 
    //     waitTime(1000);
    //     filterWatch("All");
    //     extentLoggerPass("MLS_TC_60", "To Validate Brand Filter function \"Tag Heuer\" will display Tag Heuer watch");
    // }
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
                    descriptionText.contains("14k") ||
                    descriptionText.contains("18k") ||
                    descriptionText.contains("Yellow Gold") ||
                    descriptionText.contains("White Gold") ||
                    descriptionText.contains("Rose Gold") ||
                    descriptionText.contains("Two - Tone") ||
                    descriptionText.contains("Tri - Tone")
            ) {
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
            logger.info("No items matching the filter: " + filter);
        }
    }
}
