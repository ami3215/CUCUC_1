Feature: Testing OrangeHRM #Goal
1)Valid Case
2)Invalid Case
Scenario Outline: To test the login functionality with valid and invalid datas
@PositiveTesting
Scenario: To test login functionality using valid data
Given I should be on the login page
And Enter the UserName "Admin"
And Enter the Password "admin123"
When Click on Login button
Then I should see the title as "OrangeHRM"
Examples:
|Admin|admin123|
|Admin|Admin123|
@NegativeTesting
Scenario: To test login functionality using invalid data
Given I should be on the login page
And Enter the UserName "admin"
And Enter the Password "admin234"
When Click on Login button
Then I should see the title as "OrangeHRM"