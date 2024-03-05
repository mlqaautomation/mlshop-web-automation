package com.mlshop.test;

import org.testng.annotations.Test;

// this test class contains all mlshop purchasing workflows
// only for positive testing 

public class Purchase_happyPath extends BaseTest{

     @Test(priority =1)
    public void MLS_TC_109_Validate_purchaseVia_mlWallet()throws Exception{
        shippingDetailsTC.MLS_TC_109_Validate_purchaseVia_mlWallet();
    }
    @Test(priority = 2)
    public void MLS_TC_127_Validate_sucessPurhcase_wallet() throws Exception{
        shippingDetailsTC.MLS_TC_127_Validate_sucessPurhcase_wallet();
    }
    @Test(priority =3)
    public void MLS_TC_114_Validate_successPurchase_grabPay()throws Exception{
        shippingDetailsTC.MLS_TC_114_Validate_successPurchase_grabPay();
    }
    @Test(priority =4)
    public void MLS_TC_115_Validate_successPurchase_gCash()throws Exception{
        shippingDetailsTC.MLS_TC_115_Validate_successPurchase_gCash();
    }
    @Test(priority =5)
    public void MLS_TC_116_Validate_successPurchase_payMaya()throws Exception{
        shippingDetailsTC.MLS_TC_116_Validate_successPurchase_payMaya();
    }
    @Test(priority =6)
    public void MLS_TC_117_Validate_successPurchase_card()throws Exception{
        shippingDetailsTC.MLS_TC_117_Validate_successPurchase_card();
    }
    @Test(priority =7)
    public void MLS_TC_118_Validate_successPurchase_directOnlineBanking()throws Exception{
        shippingDetailsTC.MLS_TC_118_Validate_successPurchase_directOnlineBanking();
    }
    
}
