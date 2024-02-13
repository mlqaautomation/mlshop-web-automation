package com.MLShopPageObjects;

import org.openqa.selenium.By;
public  class Home_page{

    public static By objUser_icon= By.xpath("(//*[name()='svg'][contains(@class,'w-6 h-6')])[3]/parent::div");
    public static By objShoppingCart_itemNumber=By.xpath("(//a)[6]/child::p");
    public static By objShoppingCart_icon=By.xpath("(//a)[6]");
    public static By objContactUs=By.xpath("(//*[contains(text(),'Contact Us')])[1]");
    public static By objAbout=By.xpath("(//*[contains(text(),'About')])[1]");
    public static By objMlJewellers=By.xpath("//img[@loading='lazy']");
    public static By objWatchesTab=By.xpath("(//*[contains(text(),'Watches')])[1]");
    public static By objJewelryTab=By.xpath("(//*[contains(text(),'Jewelry')])[1]");
    public static By objAmparitoCollectionsTab=By.xpath("(//*[contains(text(),'Amparito')])[1]");

    public static By objUser_name=By.xpath("//p[contains(text(), \"Hi, \")]");
    public static By objProfile_option=By.xpath("//p[normalize-space()='Profile']");
    public static By objPurchaseHistory_option=By.xpath("//p[normalize-space()='Purchase History']");
    public static By objLogout_option=By.xpath("//p[normalize-space()='Logout']");
    
    //Watches Tab//
    //All brands drop down
    public static By objAllBrandsDropDown=By.xpath("//span[normalize-space()='All Brands']");
    //Clicked Drop Down: Brand Selection
    public static By objBrandsDropDownAllBrands=By.xpath("//div[contains(@class,'ml-5 mb-2 absolute z-30 w-full slide-in-top')]//span[contains(text(),'All Brands')]");
    public static By objBrandsDropDownRolex=By.xpath("//button[contains(@title,'Rolex')]");
    public static By objBrandsDropDownOmega=By.xpath("//span[normalize-space()='Omega']");
    public static By objBrandsDropDownTagHeuer=By.xpath("//span[normalize-space()='Tag Heuer']");
    public static By objBrandsDropDownSeiko=By.xpath("//span[normalize-space()='Seiko']");
    public static By objBrandsDropDownCasio=By.xpath("//span[normalize-space()='Casio']");

    //Drop Down: All Movements
    public static By objAllMovementDropDown=By.xpath("//span[normalize-space()='All Movements']");
    //Clicked Drop Down: All Movements
    public static By objAllMovementDropDownAllMovements=By.xpath("//div[@class='ml-5 mb-2 absolute z-30 w-full slide-in-top']//span[contains(text(),'All Movements')]");
    public static By objAllMovementDropDownAutomatic=By.xpath("//button[contains(@title,'Automatic')]");
    public static By objAllMovementDropDownQuartz=By.xpath("//button[@title='Quartz']");
    public static By objAllMovementDropDownOthers=By.xpath("//span[normalize-space()='Others']");

    //Drop Down: All Materials
    public static By objAllMaterialsDropDown=By.xpath("//button[contains(@title,'All Materials')]");
    //Clicked Drop Down: All Materials
    public static By objAllMaterialsDropDownAllMaterials=By.xpath("//div[contains(@class,'ml-5 mb-2 absolute z-30 w-full slide-in-top')]//span[contains(text(),'All Materials')]");
    public static By objAllMovementDropDownStainlessSteel=By.xpath("//span[normalize-space()='Stainless Steel']");
    public static By objAllMovementDropDownCeramicPolymer=By.xpath("//span[normalize-space()='Ceramic / Polymer']");
    public static By objAllMovementDropDownGold=By.xpath("//button[contains(@title,'Gold')]");

    //Drop Down: All Genders
    public static By objAllGendersDropDown=By.xpath("//span[normalize-space()='All Genders']");
    //Clicked Drop Down: All Genders
    public static By objAllGendersDropDownAllGenders= By.xpath("//div[@class='ml-5 mb-2 absolute z-30 w-full slide-in-top']//span[contains(text(),'All Genders')]");
    public static By objAllGendersDropDownLadies= By.xpath("//button[contains(@title,'Ladies')]");
    public static By objAllGendersDropDownMens= By.xpath("//button[contains(@title,'Mens')]");
    public static By oobjAllGendersDropDownUnisex= By.xpath("//button[contains(@title,'Unisex')]");

    //Drop Down: Sort By
    public static By objSortByDropDown= By.xpath("//span[normalize-space()='Sort by']");
    //Clicked Drop Down: Sort By
    public static By objSortByDropDownHighLow= By.xpath("//span[normalize-space()='High to Low']");
    public static By objSortByDropDownLowHigh= By.xpath("//span[normalize-space()='Low to High']");
    public static By objSortByDropDownNewOld= By.xpath("//span[normalize-space()='Newest to Oldest']");
    public static By objSortByDropDownOldNew= By.xpath("//span[normalize-space()='Oldest to Newest']");

    //Amparito and Jewelry Drop down Section//
    //Drop Down: All Types
    public static By objAllTypesDropDown= By.xpath("//span[normalize-space()='All Types']");
    //Clicked Drop Down: All Types
    public static By objAllTypesDropDownAllTypes= By.xpath("//div[@class='ml-5 mb-2 absolute z-30 w-full slide-in-top']//button[@title='All Types']");
    public static By objAllTypesDropDownRing= By.xpath("//button[@title='Ring']");
    public static By objAllTypesDropDownNecklace= By.xpath("//button[@title='Necklace']");
    public static By objAllTypesDropDownBracelets= By.xpath("//span[normalize-space()='Bracelets']");
    public static By objAllTypesDropDownEarrings= By.xpath("//button[@title='Earrings']");
    public static By objAllTypesDropDownPendant= By.xpath("//button[@title='Pendant']");
    public static By objAllTypesDropDownBrouch= By.xpath("//span[normalize-space()='Brouch']");
    public static By objAllTypesDropDownEngagement= By.xpath("//span[normalize-space()='Engagement']");

    //Drop Down: All Types
    public static By objAllGoldKaratsDropDown= By.xpath("//span[normalize-space()='All Gold Karats']");
    //Clicked Drop Down: All Types
    public static By objAllGoldKaratsDropDownAllGoldKarats= By.xpath("//div[@class='ml-5 mb-2 absolute z-30 w-full slide-in-top']//span[contains(text(),'All Gold Karats')]");
    public static By objAllGoldKaratsDropDown14K= By.xpath("//button[@title='14k']");
    public static By objAllGoldKaratsDropDown18K= By.xpath("//span[normalize-space()='18k']");

    //Drop Down: All Gold Colors
    public static By objAllGoldColorsDropDown= By.xpath("//span[normalize-space()='All Gold Colors']");
    //Clicked Drop Down: All Gold Colors
    public static By objAllGoldColorsDropDownAllGoldColors= By.xpath("//div[@class='ml-5 mb-2 absolute z-30 w-full slide-in-top']//span[contains(text(),'All Gold Colors')]");
    public static By objAllGoldColorsDropDownYG= By.xpath("//span[normalize-space()='Yellow Gold']");
    public static By objAllGoldColorsDropDownWG= By.xpath("//span[normalize-space()='White Gold']");
    public static By objAllGoldColorsDropDownRG= By.xpath("//span[normalize-space()='Rose Gold']");
    public static By objAllGoldColorsDropDownTT= By.xpath("//span[normalize-space()='Two - Tone']");
    public static By objAllGoldColorsDropDownTriT= By.xpath("//span[normalize-space()='Tri - Tone']");


    //Page Next
    public static By objPage1= By.xpath("//button[contains(@title,'1')]");
    public static By objPage2= By.xpath("//button[@title='2']");
    public static By objPage3= By.xpath("//button[@title='3']");
  
}