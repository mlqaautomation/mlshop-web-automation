package com.business.mlshop;

import com.MLShopPageObjects.Login_page;
import com.MLShopPageObjects.Registration_Page;
import static com.utility.ExtentReporter.HeaderChildNode;
import static com.utility.ExtentReporter.extentLoggerFail;
import static com.utility.ExtentReporter.extentLoggerPass;
import static com.utility.ExtentReporter.getWebDriver;
import static com.utility.Utilities.assertionValidation;
import static com.utility.Utilities.click;
import static com.utility.Utilities.typeWeb;
import static com.utility.Utilities.verifyElementPresent;
import static com.utility.Utilities.verifyElementPresentAndClick;
import static com.utility.Utilities.waitTime;

public class Registration extends BaseClass{
    Login login = new Login();

    public void navigateRegistration()throws Exception{
        login.navigateLoginPage();
        typeWeb(Login_page.objMobileNumber_field, prop.getproperty("Unregistered_Number"), "Mobile Number Field");
        verifyElementPresentAndClick(Login_page.objLogin_btn, "Login Button");
        verifyElementPresentAndClick(Login_page.objProceed_btn, "Proceed Button");
        assertionValidation(getWebDriver().getCurrentUrl(), prop.getproperty("RegisterLink"));
    }

    //Invalid Mobile Number Validation
    public void MLS_TC_10_Validate_InvalidNum_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_10, To Verify the error prompt message when mobile number field is invalid");
        navigateRegistration();
        typeWeb(Registration_Page.MobileNum, prop.getproperty("InvalidMobileNumber"), "Mobile Number* ");
            if(verifyElementPresent(Registration_Page.InvalidNum, "Invalid Number")){
                extentLoggerPass("MLS_TC_10","Successfully validated the number field is invalid.");
                logger.info("MLS_TC_10, Successfully validated the number field is invalid.");
            }
            else{
                extentLoggerFail("MLS_TC_10", "Failed to validate Invalid Number error message");
                logger.info("MLS_TC_10, Has not successfully validated the number field is invalid.");
         }

    //First Name Field Invalid Validation
    }
    public void MLS_TC_11_Validate_InvalidFName_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_11, To Validate the error prompt message when first name field is invalid");
        navigateRegistration();
        typeWeb(Registration_Page.F_Name, prop.getproperty("InvalidNameTest"), "First Name");
            if(verifyElementPresent(Registration_Page.InvalidF_Name, "Invalid First Name")){
            extentLoggerPass("MLS_TC_11","Successfully validated the first name field is invalid.");
            logger.info("MLS_TC_11, Successfully validated the first name field is invalid.");
            }
            else{
                extentLoggerFail("MLS_TC_11", "Failed to validate Invalid First Name message");
                logger.info("MLS_TC_11, Has not successfully validated the first name field is invalid.");
            }
    }

    //Last Name Field Invalid Validation
    public void MLS_TC_12_Validate_InvalidLName_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_12, To Validate the error prompt message when last name field is invalid");
        navigateRegistration();
        typeWeb(Registration_Page.L_Name, prop.getproperty("InvalidLastNameTest"), "Last Name");
            if(verifyElementPresent(Registration_Page.InvalidL_Name, "Invalid Last Name")){
            extentLoggerPass("MLS_TC_12","Successfully validated the last name field is invalid.");
            logger.info("MLS_TC_12, Successfully validated the last name field is invalid.");
            }
            else{
                extentLoggerFail("MLS_TC_12", "Failed to validate Invalid Last Name message");
                logger.info("MLS_TC_12, Has not successfully validated the last name field is invalid.");
            }
        }
    //First Name Field Empty Validation
    public void MLS_TC_15_Validate_FirstNameEmpty_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_15, To validate the Firstname Required prompt message when input field is empty");
        navigateRegistration();
        typeWeb(Registration_Page.F_Name, "", "First Name");
        if(verifyElementPresent(Registration_Page.L_NameReq, "Firstname is Required")){
            extentLoggerPass("MLS_TC_15","Successfully validated the first name field is empty.");
            logger.info("MLS_TC_15, Successfully validated the first name field is Empty.");
            }
            else{
                extentLoggerFail("MLS_TC_15", "Failed to validate First name required message");
                logger.info("MLS_TC_15, Has not successfully validated the First name field is empty.");
            }
    }

    //Last Name Field Empty Validation
    public void MLS_TC_16_Validate_LastNameEmpty_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_16, To validate the Lastname Required prompt message when input field is empty");
        navigateRegistration();
        typeWeb(Registration_Page.L_Name, "", "Last Name");
        if(verifyElementPresent(Registration_Page.L_NameReq, "Lastname is Required")){
            extentLoggerPass("MLS_TC_16","Successfully validated the Last name field is empty.");
            logger.info("MLS_TC_16, Successfully validated the Last name field is Empty.");
            }
            else{
                extentLoggerFail("MLS_TC_16", "Failed to validate Last name required message");
                logger.info("MLS_TC_16, Has not successfully validated the Last name field is empty.");
            }
    }

    //Province Drop Down Validation
    public void MLS_TC_17_Validate_ProvinceDropdown_Empty_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_17, To Validate the error prompt message when province dropdown is empty");
        navigateRegistration();
        click(Registration_Page.ProveStateDropDown, "");
        waitTime(2000);
        if(verifyElementPresent(Registration_Page.ProveStateDropDown, "Province is Required")){
            extentLoggerPass("MLS_TC_17","Successfully validated the error prompt message when province dropdown is empty");
            logger.info("MLS_TC_17, Successfully validated the error prompt message when province dropdown is empty");
            }
            else{
                extentLoggerFail("MLS_TC_17", "Failed to validate the error prompt message when province dropdown is empty");
                logger.info("MLS_TC_17, Has not successfully validate the error prompt message when province dropdown is empty.");
            }
        }
    
    // City/Town Drop Down Validation
    public void MLS_TC_18_Validate_CityTownDropdown_Empty_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_18, To Validate the error prompt message when City/Town dropdown is empty");
        navigateRegistration();
        click(Registration_Page.CityTownDropDown, "");
        waitTime(2000);
        if(verifyElementPresent(Registration_Page.CityTownDropDown, "City is Required")){
            extentLoggerPass("MLS_TC_18","Successfully validated the error prompt message when City/Town dropdown is empty");
            logger.info("MLS_TC_18, Successfully validated the error prompt message when City/Town dropdown is empty");
            }
            else{
                extentLoggerFail("MLS_TC_18", "Failed to validate the error prompt message when City/Town dropdown is empty");
                logger.info("MLS_TC_18, Has not successfully validate the error prompt message when City/Town dropdown is empty.");
            }
        }
    
    //Street Field is Empty Validation
    public void MLS_TC_19_Validate_StreetField_Empty_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_19, To Validate the error prompt message when street field is empty");
        navigateRegistration();
        click(Registration_Page.Street, "");
        waitTime(2000);
        if(verifyElementPresent(Registration_Page.Street, "Street is Required")){
            extentLoggerPass("MLS_TC_19","Successfully validated the error prompt message when Street field is empty");
            logger.info("MLS_TC_19, Successfully Validated the error prompt message when street field is empty");
            }
            else{
                extentLoggerFail("MLS_TC_19", "Failed to Validate the error prompt message when street field is empty");
                logger.info("MLS_TC_19, Has not successfully Validated the error prompt message when street field is empty");
            }
        }

    //Incomplete
    //Street Field is Empty Validation
    public void MLS_TC_20_Validate_OTPprompt_AfterRegister_RegistrationPage()throws Exception{
        HeaderChildNode("MLS_TC_19, To Validate the error prompt message when street field is empty");
        navigateRegistration();
        typeWeb(Registration_Page.MobileNum, prop.getproperty("MobileNumberTest"), "Mobile Number");
        typeWeb(Registration_Page.F_Name, prop.getproperty("FirstNameTest"), "First Name");
        typeWeb(Registration_Page.M_Name, prop.getproperty("MiddleNameTest"), "Middle Name");
        typeWeb(Registration_Page.L_Name, prop.getproperty("LastNameTest"), "Last Name");
        typeWeb(Registration_Page.Suffix, prop.getproperty("SuffixTest"), "Suffix");
        typeWeb(Registration_Page.Email, prop.getproperty("EmailTest"), "Email");
        typeWeb(Registration_Page.Street, prop.getproperty("StreetNameTest"), "Street");
        typeWeb(Registration_Page.ZipCode, prop.getproperty("ZipCodeTest"), "Zipcode");
        click(Registration_Page.RegisterBtn, "Successfuly Prompt OTP after register");
    }
}

