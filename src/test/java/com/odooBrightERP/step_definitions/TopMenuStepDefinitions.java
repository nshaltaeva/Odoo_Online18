package com.odooBrightERP.step_definitions;


import com.odooBrightERP.pages.CRMPage;
import com.odooBrightERP.pages.LoginPage;
import com.odooBrightERP.utulities.BrowserUtils;
import io.cucumber.java.en.Then;

public class TopMenuStepDefinitions {

    LoginPage loginPage = new LoginPage();
    CRMPage crmPage = new CRMPage();


    @Then("user navigates to {string} module")
    public void user_navigates_to_module(String module) {
        System.out.println(module);
        loginPage.navigateTo(module);
        BrowserUtils.wait(3);
        crmPage.clickOnCRMModule();
    }



}
