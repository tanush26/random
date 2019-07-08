package com.ittraiing.selenium.page_objects;

import com.ittraiing.selenium.Hooks;
import com.ittraiing.selenium.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {

    public static  String searchedProduct;

    @FindBy(id ="searchTerm")
    private WebElement searchTxtBox;

    @FindBy(css = "button[type='submit']")
    private WebElement magnifierGlass;

    public void dosearch(String item) {
        searchedProduct=item;
        searchTxtBox.sendKeys(item);
        magnifierGlass.click();
    }


    public String getHomePageUrl(){
       return driver.getCurrentUrl();
    }
}
