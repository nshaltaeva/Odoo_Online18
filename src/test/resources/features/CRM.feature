Feature: User in CRM module

  @CRMmodule
  Scenario: Create new Opportunity
    Given user is on the login page
    Then user logs in as sales manager
    Then user navigates to "CRM" module
    And user verifies that "Pipeline - Odoo" page title is displayed
    And user click on "Create" button
    Then user adds new information:
      | Opportunity Title | Customer       | Expected Revenue        | Priority  |
      | Iphone cases      | John Snow      | 15.00                   | ***       |



