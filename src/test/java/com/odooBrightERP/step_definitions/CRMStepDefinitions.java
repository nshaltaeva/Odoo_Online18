package com.odooBrightERP.step_definitions;

import com.odooBrightERP.pages.CRMPage;
import com.odooBrightERP.pages.LoginPage;
import com.odooBrightERP.utulities.BrowserUtils;
import com.odooBrightERP.utulities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class CRMStepDefinitions {

    CRMPage crmPage = new CRMPage();
    LoginPage loginPage = new LoginPage();

    @Then("user click on {string} button")
    public void user_click_on_button(String string) {
        BrowserUtils.wait(2);
        if(string.equals("Create")){
            crmPage.clickOnCreateButton();
        }
    }

    @Then("user adds new information:")
    public void user_adds_new_information(List<Map<String,String>> dataTable) {
        System.out.println(dataTable);

    }
}
