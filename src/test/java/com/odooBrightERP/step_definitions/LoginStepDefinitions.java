package com.odooBrightERP.step_definitions;

import com.odooBrightERP.pages.BasePage;
import com.odooBrightERP.pages.LoginPage;
import com.odooBrightERP.utulities.ConfigurationReader;
import com.odooBrightERP.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as sales manager")
    public void user_logs_in_as_sales_manager() {
        String username = ConfigurationReader.getProperty("sales.manager.username60");
        String password = ConfigurationReader.getProperty("sales.manager.password");
        loginPage.login(username, password);
    }

//    @Then("user verifies that {string} page subtitle is displayed")
//    public void user_verifies_that_page_subtitle_is_displayed(String string) {
//        System.out.println(string);
//        Assert.assertEquals(string, BasePage.getPageTitle());
//        System.out.println("Verifying page title: " + string);
//    }

    @Then("user verifies that {string} page title is displayed")
    public void user_verifies_that_page_title_is_displayed(String string) {
        System.out.println(string);
        Assert.assertEquals(string, loginPage.getPageTitle());
        System.out.println("Verifying page title: " + string);
    }

    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("Login with "+string+" username and "+string2+" password.");
        loginPage.login(string, string2);
    }
}
