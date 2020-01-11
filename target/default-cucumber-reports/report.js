$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CRM.feature");
formatter.feature({
  "name": "User in CRM module",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create new Opportunity",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CRMmodule"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as sales manager",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_sales_manager()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"CRM\" module",
  "keyword": "Then "
});
formatter.match({
  "location": "TopMenuStepDefinitions.user_navigates_to_module(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that \"Pipeline - Odoo\" page title is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_verifies_that_page_title_is_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on \"Create\" button",
  "keyword": "And "
});
formatter.match({
  "location": "CRMStepDefinitions.user_click_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds new information:",
  "rows": [
    {
      "cells": [
        "Opportunity Title",
        "Customer",
        "Expected Revenue",
        "Priority"
      ]
    },
    {
      "cells": [
        "Iphone cases",
        "John Snow",
        "15.00",
        "***"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CRMStepDefinitions.user_adds_new_information(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});