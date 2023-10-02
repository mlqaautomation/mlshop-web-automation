package com.mlshop.test;

import org.testng.annotations.Test;

public class MLWalletWebScripts extends BaseTest{

    @Test(priority = 1)
    public void mlShopProfileNameAndDropDownValidation() throws Exception {
        mlWalletWeb.mlShopProfileNameAndDropDownValidation();
    }
    @Test(priority = 2)
    public void shopItemsProfilePageNavigation() throws Exception {
        mlWalletWeb.shopItemsProfilePageNavigation();
    }
    @Test(priority = 3)
    public void shopItemsPurchaseHistoryPageNavigation() throws Exception {
        mlWalletWeb.shopItemsPurchaseHistoryPageNavigation();
    }
    @Test(priority = 4)
    public  void shopItemsLogoutValidation() throws Exception {
        mlWalletWeb.shopItemsLogoutValidation();
    }
    @Test(priority = 5)
    public void shopItemsProfileSuccessfulLogin() throws Exception {
        mlWalletWeb.shopItemsProfileSuccessfulLogin();
    }
    @Test(priority = 6)
    public void shopItemsAvailableJewelryItemsValidation() throws Exception {
        mlWalletWeb.shopItemsAvailableJewelryItemsValidation();
    }
    @Test(priority = 7)
    public void shopItemsWatchItemsValidation() throws Exception {
        mlWalletWeb.shopItemsWatchItemsValidation();
    }
    @Test(priority = 8)
    public void shopItemsRingsProductTypePageNavigationValidation() throws Exception {
        mlWalletWeb.shopItemsRingsProductTypePageNavigationValidation();
    }
    @Test(priority = 9)
    public void shopItemsNecklacesAndPendantsProductTypePageNavigationValidation() throws Exception {
        mlWalletWeb.shopItemsNecklacesAndPendantsProductTypePageNavigationValidation();
    }
    @Test(priority = 10)
    public void shopItemsBraceletsAndBanglesProductTypePageNavigationValidation() throws Exception {
        mlWalletWeb.shopItemsBraceletsAndBanglesProductTypePageNavigationValidation();
    }
    @Test(priority = 11)
    public void shopItemsEarringsProductTypePageNavigationValidation() throws Exception {
        mlWalletWeb.shopItemsEarringsProductTypePageNavigationValidation();
    }
    @Test(priority = 12)
    public void shopItemsWatchProductTypePageNavigationValidation() throws Exception {
        mlWalletWeb.shopItemsWatchProductTypePageNavigationValidation();
    }

    @Test(priority = 1)
    public void shopItemsRingProductPurchaseScenario() throws Exception {
        mlWalletWeb.shopItemsRingProductPurchaseScenario();
    }
    @Test(priority = 1)
    public void shopItemsShippingDetailsPageUIValidation() throws Exception {
        mlWalletWeb.shopItemsShippingDetailsPageUIValidation();
    }


}
