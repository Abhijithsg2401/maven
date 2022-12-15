package com.nest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nest.utilities.PageUtility;

public class HomePage {
	WebDriver driver;

    @FindBy(linkText="Employee")
    private WebElement clickEmployee;

    @FindBy(linkText="Add Employee")
    private WebElement clickAddEmployee;

    @FindBy(linkText="List Employee")
    private WebElement clickListEmployee;

    @FindBy(linkText="Logout")
    private WebElement clickLogout;

 

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

     public void addEmployee(){

            PageUtility.hoverEg(driver, clickEmployee);
            PageUtility.clickBtn(driver, clickAddEmployee);

        }
     public void applyFigure(){

            PageUtility.hoverEg(driver, clickAddEmployee);

        }

     public void logoutClick()
     {
         PageUtility.clickBtn(driver, clickLogout);
     }

}
