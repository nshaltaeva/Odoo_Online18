package com.odooBrightERP.pages;

import com.odooBrightERP.utulities.BrowserUtils;
import com.odooBrightERP.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMPage extends BasePage {

    @FindBy(xpath="//button[@accesskey='c']")
    public WebElement createButton;

   @FindBy(xpath = "//input[@name='name']")
    public WebElement opportunityTitleInputBox;

    @FindBy(id = "o_field_input_36")
    public WebElement CustomerDropdownBox;

    public CRMPage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void clickOnCreateButton(){
        BrowserUtils.waitForVisibility(createButton,15);
        BrowserUtils.waitForClickablility(createButton,15);
        createButton.click();
    }






}
