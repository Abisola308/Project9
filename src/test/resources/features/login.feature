@run
  Feature: Valid login

    Scenario: A registered user should be able to login with a valid details
      Given I navigate to www.giftrete.com
      When I click the login button
      And I fill my emailaddress in the emailaddress field "ogunnaikebisola@yahoo.com"
      And I enter my password in the password field
      And I click sign in button
      Then I should be logged in
