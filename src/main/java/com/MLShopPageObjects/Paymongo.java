package com.MLShopPageObjects;

import org.openqa.selenium.By;
public class Paymongo {
     // Header of Paymongo page
     public static By objHeaderMerchant = By.xpath("//label[@for='merchant-name']");
     public static By objRef_Num = By.xpath("//label[@for='reference-number']");
 
     // Value Box
     public static By objLeftContainer = By.xpath("//div[@class='--px-2xl']");
     public static By objRightContainer = By.xpath("//div[@class='checkout-payment']");
 
     // Payment section
     public static By objPay_txt = By.xpath("//h3[@class='-shade800 --m-0']");
     public static By objTotal_amt = By.xpath("//span[@class='amount --m-0']");
     public static By objItemNameColumn = By.xpath("//h5[normalize-space()='ITEM NAME']");
     public static By objQTYColumn = By.xpath("//h5[normalize-space()='QTY']");
     public static By objPriceColumn = By.xpath("//h5[normalize-space()='PRICE']");
     public static By objjItemPriceP_UnitColumn = By
             .xpath("//h5[@class='-shade600 text --xs']//span[contains(text(),'₱')]");
     public static By objPrice_amt = By.xpath("//h4[@class='-shade800']//span[contains(text(),'₱')]");
     public static By totalPrice = By.xpath("//h4[@class='-shade700 --pr-xl']");
 
     // Right Payment Section
     public static By objPaymentMethod = By.xpath("//span[normalize-space()='Choose your payment method']");
     public static By objBack_btn = By.xpath("//span[normalize-space()='Back']");
     public static By objContinue_btn = By.xpath("//span[normalize-space()='Continue']");
 
     // Payment Method: GrabPay, G-Cash, Payamaya, Direct Online Banking
     public static By objSel_PaymethodGrabPay = By.xpath("//button[normalize-space()='GRABPAY']");
     public static By objSel_PaymethodGcash = By.xpath("// button[normalize-space()='GCASH']");
     public static By objSel_PaymethodPayamaya = By.xpath("// button[normalize-space()='MAYA']");
     public static By objSel_PaymethodD_OnlineBanking = By.xpath("//button[normalize-space()='BPI ONLINE']");
     public static By objSel_PaymethodVisaMastercard = By.xpath("//button[normalize-space()='CREDIT OR DEBIT CARD']");
     // =
     public static By objSelectionBox = By.xpath("//div[@class='accordion accordion--active']");
     public static By objE_walletsLogo = By.xpath("//img[@alt='/static/media/ewallets.dc32b421.svg']");
     public static By objE_walletsTxt = By.xpath("//h4[@class='accordion__label__title -shade800']");
     public static By objE_walletChoice = By.xpath("//span[@class='accordion__label__subtitle -shade700']");
     public static By objPaymentClose = By.xpath("//div[@class='accordion accordion--active']//*[name()='svg']");
     public static By objE_walletBox = By.xpath("//div[@class='payment-method payment-method--active']");
     public static By objE_walletRadiobtn = By.xpath("//input[@type='radio']");
     public static By objPayment_Select = By.xpath("//p[@class='--mb-0']");
     // =
 
     // GrabPay, G-Cash, Payamaya, Direct Online Banking text
     public static By objCust_Infotxt = By.xpath("//h4[normalize-space()='Customer Information']");
     public static By objContact_Infotxt = By.xpath("///h4[normalize-space()='Contact Information']");
     public static By objNametxt = By.xpath("//label[normalize-space()='Name']");
     public static By objEmailAddtxt = By.xpath("//label[normalize-space()='Email address']");
     public static By objMobileNum = By.xpath("//label[normalize-space()='Mobile number (optional)']");
     // GrabPay, G-Cash, Payamaya, Direct Online textbox
     public static By objtxtBoxName = By.xpath("//input[@id='name']");
     public static By objErrorMessageName = By.xpath("//span[@class='error-message']");
     public static By objEmailIcon = By.xpath("//label[@for='email']//span[@class='input__prefix']//*[name()='svg']");
     public static By objtxtBoxEmail = By.xpath("//input[@id='email']");
     public static By objFillEmail = By.xpath("//span[normalize-space()='Email address is required.']");
     public static By objErrorMessageEmail = By
             .xpath("//span[normalize-space()='Email address has an invalid format.']");
     public static By objPhoneNumIcon = By.xpath(
             "//span[contains(text(),'+63')]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]");
     public static By objtxtBoxNum = By.xpath("//input[@id='phone']");
     // Visa or Mastercard
     public static By objEmailAddtxtVM = By.xpath("//label[normalize-space()='Email address']");
     public static By objtxtBoxEmailVM = By.xpath("//input[@id='email']");
     public static By objFillEmailVM = By.xpath("//span[normalize-space()='Email address is required.']");
     public static By objErrorMessageEmailVM = By
             .xpath("//span[normalize-space()='Email address has an invalid format.']");
     public static By objMobileNumVM = By.xpath("//label[normalize-space()='Mobile number (optional)']");
     public static By objPhoneNumIconVM = By.xpath(
             "//span[contains(text(),'+63')]//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]");
     public static By objtxtBoxNumVM = By.xpath("//input[@id='phone']");
 
     // Visa or Mastercard: Card Information
     public static By objCardNum = By.xpath("//div[normalize-space()='Card number']");
     public static By objCardNumtxtBox = By.xpath("//input[@id='cardNumber']");
     public static By objExpiry = By.xpath("//div[contains(text(),'Expiry')]");
     public static By objExpiryM = By.xpath("//input[@id='expMonth']");
     public static By objExpiryY = By.xpath("//input[@id='expYear']");
     public static By objCVC = By.xpath("//div[contains(text(),'CVC')]");
     public static By objCVCtxtBox = By.xpath("//input[@id='cvc']");
     public static By objNameOnCard = By.xpath("//label[normalize-space()='Name on card']");
     public static By objNameOnCardtxtBox = By.xpath("//input[@id='name']");
     public static By objNameOnCardErrorMessage = By.xpath("//span[normalize-space()='Name is required.']");
 
     // Visa or Mastercard: Billing Information
     public static By objAddress1 = By.xpath("// label[normalize-space()='Address Line 1']");
     public static By objAddress1txtBox = By.xpath("// input[@id='line1']");
     public static By objAddress1ErrorMessage = By.xpath("// span[@class='error-message']");
     public static By objAddress2 = By.xpath("// label[normalize-space()='Address Line 2 (optional)']");
     public static By objAddress2txtBox = By.xpath("// input[@id='line2']");
     public static By objCity = By.xpath("// label[normalize-space()='City']");
     public static By objCitytxtBox = By.xpath("// input[@id='city']");
     public static By objCityErrorMessage = By.xpath("// span[normalize-space()='City is required.']");
     public static By objStateProv = By.xpath("// label[normalize-space()='State/Province']");
     public static By objStateProvtxtBox = By.xpath("// input[@id='state']");
     public static By objStateProvtxtBoxErrorMessage = By
             .xpath("// span[normalize-space()='State/Province is required.']");
     public static By objPostalCode = By.xpath("// label[normalize-space()='Postal code']");
     public static By objPostalCodetxtBox = By.xpath("// input[@id='postalCode']");
     public static By objPostalCodeErrorMessage = By.xpath("// span[normalize-space()='Postal code is required.']");
     public static By objCountry = By.xpath("// label[normalize-space()='Country']");
     public static By objCountryDropDownBox = By.xpath("// input[@id='country']");
     public static By objCountryDropDownButton = By.xpath("// div[@class='select__status-icon-container']");
 
     // Privacy tick box for all types of payment within paymongo
     public static By objPolicy = By.xpath("//div[@class='privacy-policy-checkbox__wrapper']");
     public static By objTickBox = By.xpath("//input[@id='privacy-policy']");
     public static By objErrorMessagePrivacy = By.xpath("//p[@class='privacy-policy-checkbox__error-message']");
     // BTN
     public static By objBack = By.xpath("// button[@class='button default --mr-xs button--primary']");
     public static By objContinuePayment = By.xpath("// span[normalize-space()='Complete payment']");
 
     // Extra Directory for Direct Online Banking
     public static By objAccessPrompt = By.xpath("//span[@class='f-sm']");
     public static By objPayAs = By.xpath("//span[normalize-space()='Paying']");
     public static By objTotalAmt = By.xpath("//span[normalize-space()='A total amount of']");
     public static By objBackToLogin = By.xpath("//button[@type='button']");
 
     // Payment Method Visa/Mastercard
 
     // Paymongo after payment page
     public static By objAuth_btn = By.xpath("//button[@class='ant-btn ant-btn-primary']");
     public static By objFail_btn = By.xpath("//button[2]");
     public static By objExpire_btn = By.xpath("//button[3]");
 
     // Footer
     public static By objFooter1 = By.xpath("//footer[@class='footer']");
     public static By objFooterimg1 = By.xpath("//img[@alt='Shield Check']");
     public static By objFooter2 = By.xpath("//span[contains(text(),'Safe • Secure • Simple')]");
     public static By objFooterimg2 = By.xpath("//img[@alt='PayMongo Logo']");

}
