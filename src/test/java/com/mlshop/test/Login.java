package com.mlshop.test;

import org.testng.annotations.Test;

public class Login extends BaseTest{

    // @Test(priority = 1)
    // public void MLS_TC_01_ValidateUserIcon_Redirection() throws Exception {
    //     loginTC.MLS_TC_01_ValidateUserIcon_Redirection();
    // }
    // @Test(priority = 2)
    // public void MLS_TC_02_ValidateErrorPrompt_MobileNumber_Field()throws Exception{
    //     loginTC.MLS_TC_02_ValidateErrorPrompt_MobileNumber_Field();
    // }
    // @Test(priority = 3)
    // public void MLS_TC_05_ValidateErorrPrompt_()throws Exception{
    //     loginTC.MLS_TC_05_ValidateErorrPrompt_();
    // }
    @Test(priority = 4)
    public void MLS_TC_06_ValidateLogin_Function()throws Exception{
        loginTC.MLS_TC_06_ValidateLogin_Function();
    }
//     @Test(priority = 5)
//     public void MLS_TC_08_ValidateLogin_RegisterRedirection()throws Exception{
//         loginTC.MLS_TC_08_ValidateLogin_RegisterRedirection();
//     }
//    @Test(priority = 6)
//     public void MLS_TC_09_ValidateLogin_CancelRegister()throws Exception{
//         loginTC.MLS_TC_09_ValidateLogin_CancelRegister();
//     }
   
}
