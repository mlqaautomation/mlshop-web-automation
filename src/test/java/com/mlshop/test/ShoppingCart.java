package com.mlshop.test;

import org.testng.annotations.Test;

public class ShoppingCart extends BaseTest{
    @Test(priority = 1)
    public void MLS_TC_90_Validate_shopping_cart_navigation()throws Exception{
        shoppingCartTC.MLS_TC_90_Validate_shopping_cart_navigation();
    }
    @Test(priority = 2)
    public void MLS_TC_91_Validate_shopping_cart_items()throws Exception{
        shoppingCartTC.MLS_TC_91_Validate_shopping_cart_items();
    }
    @Test(priority = 3)
    public void MLS_TC_92_Validate_shopping_cart_increment()throws Exception{
        shoppingCartTC.MLS_TC_92_Validate_shopping_cart_increment();
    }
    @Test(priority = 4)
    public void MLS_TC_93_Validate_shopping_cart_removeItem()throws Exception{
        shoppingCartTC.MLS_TC_93_Validate_shopping_cart_removeItem();
    }
    @Test(priority = 5)
    public void MLS_TC_94_Validate_shopping_cart_modalPopup()throws Exception{
        shoppingCartTC.MLS_TC_94_Validate_shopping_cart_modalPopup();
    }
    @Test(priority = 6)
    public void MLS_TC_95_Validate_shopping_cart_cancelRemove()throws Exception{
        shoppingCartTC.MLS_TC_95_Validate_shopping_cart_cancelRemove();
    }
    @Test(priority = 7)
    public void MLS_TC_96_Validate_shopping_cart_decrementFunction()throws Exception{
        shoppingCartTC.MLS_TC_96_Validate_shopping_cart_decrementFunction();
    }
    @Test(priority = 8)
    public void MLS_TC_97_Validate_shopping_cart_incrementFunction()throws Exception{
        shoppingCartTC.MLS_TC_97_Validate_shopping_cart_incrementFunction();
    }
}
