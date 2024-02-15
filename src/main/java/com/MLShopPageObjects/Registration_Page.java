package com.MLShopPageObjects;

import org.openqa.selenium.By;

public class Registration_Page {

    // Upper Left Button: Back
    public static By BackBtn = By.xpath("//button[contains(@class,'flex flex-row gap-4')]");

    // Registration Icon & Text above form
    public static By RegIconText = By.xpath("//input[contains(@placeholder,'Mobile number')]");

    // Invalid Warnings
    public static By InvalidNum = By.xpath("//p[normalize-space()='Invalid Mobile Number.']");
    public static By InvalidF_Name = By.xpath("//p[normalize-space()='Invalid Firstname']");
    public static By InvalidL_Name = By.xpath("//p[normalize-space()='Invalid Lastname']");
    public static By Invalid_Email = By.xpath("//p[normalize-space()='Email is Invalid']");

    // Required Fields
    public static By F_NameReq = By.xpath("//p[normalize-space()='Firstname is Required']");
    public static By L_NameReq = By.xpath("//p[normalize-space()='Lastname is Required']");
    public static By EmailReq = By.xpath("//p[normalize-space()='Email is Required']");
    public static By ProvReq = By.xpath("//p[normalize-space()='Province is Required']");
    public static By CityReq = By.xpath("//p[normalize-space()='City is Required']");

    // Textboxes
    public static By MobileNum = By.xpath("//input[@placeholder='Mobile number']");
    public static By F_Name = By.xpath("//input[@placeholder='First Name']");
    public static By M_Name = By.xpath("//input[@placeholder='Middle Name ']");
    public static By L_Name = By.xpath("//input[@placeholder='Last Name ']");
    public static By Suffix = By.xpath("//input[@placeholder='Ex. Jr']");
    public static By Email = By.xpath("//input[@placeholder='Email']");
    public static By Street = By.xpath("//input[@placeholder='Street']");
    public static By ZipCode = By.xpath("//input[@placeholder='Zip Code']");

    // Selection
    public static By ProvDropDown = By.xpath("//select[@name='Country']");
    public static By ProveStateDropDown = By.xpath("//select[@name='Province State']");
    public static By CityTownDropDown = By.xpath("//select[contains(@name,'City/State')]");

    // Registration Button
    public static By RegisterBtn = By.xpath("//button[@type='submit']");
}