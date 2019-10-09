@run
  Feature:Giftrete Registration

    Scenario: Valid Registration
      Given I navigate to Giftrete website
      When I click on create account
      And I click on register button
      And I enter first name in the name textbox
      And I enter last name in the last name field
      And I enter an email
      And I enter mobile number "+447985461549"
      And I enter password
      And I confirm password
      Then I bypasses capcha and click on the register link button
      And error message is displayed for none use of capcha