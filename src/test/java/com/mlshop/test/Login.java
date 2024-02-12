package com.mlshop.test;

import org.testng.annotations.Test;

public class Login extends BaseTest{

    // @Test(priority = 1)
    // public void MLS_TC_01_ValidateUserIcon_Redirection() throws Exception {
    //     loginTC.MLS_TC_01_ValidateUserIcon_Redirection();
    // }
    @Test(priority = 2)
    public void MLS_TC_02_ValidateErrorPrompt_MobileNumber_Field()throws Exception{
        loginTC.MLS_TC_02_ValidateErrorPrompt_MobileNumber_Field();
    }
}
