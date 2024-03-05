package com.mlshop.test;

import org.testng.annotations.Test;

public class Registration extends BaseTest {
   @Test(priority = 1)
   public void navigateRegistration() throws Exception {
      registrationTC.navigateRegistration();
   }

   @Test(priority = 1)
   public void MLS_TC_10_Validate_InvalidNum_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_10_Validate_InvalidNum_RegistrationPage();
   }

   @Test(priority = 0)
   public void MLS_TC_11_Validate_InvalidFName_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_11_Validate_InvalidFName_RegistrationPage();
   }

   @Test(priority = 0)
   public void MLS_TC_12_Validate_InvalidLName_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_12_Validate_InvalidLName_RegistrationPage();
   }

   @Test(priority = 4)
   public void MLS_TC_15_Validate_FirstNameEmpty_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_15_Validate_FirstNameEmpty_RegistrationPage();
   }

   @Test(priority = 5)
   public void MLS_TC_16_Validate_LastNameEmpty_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_16_Validate_LastNameEmpty_RegistrationPage();
   }

   @Test(priority = 6)
   public void MLS_TC_17_Validate_ProvinceDropdown_Empty_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_17_Validate_ProvinceDropdown_Empty_RegistrationPage();
   }

   @Test(priority = 7)
   public void MLS_TC_18_Validate_CityTownDropdown_Empty_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_18_Validate_CityTownDropdown_Empty_RegistrationPage();
   }

   @Test(priority = 8)
   public void MLS_TC_19_Validate_StreetField_Empty_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_19_Validate_StreetField_Empty_RegistrationPage();
   }

   @Test(priority = 9)
   public void MLS_TC_20_Validate_OTPprompt_AfterRegister_RegistrationPage() throws Exception {
      registrationTC.MLS_TC_20_Validate_OTPprompt_AfterRegister_RegistrationPage();
   }
}
