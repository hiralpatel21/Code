Feature: Automate key process on menu
@key
Scenario: Verify the Valid Username and InValid Password
Given I am on home page
When I click on key process icon
And  I enter for "<keyword>" keyword
Then I should see the "<keyword>" related results
Examples:
|keyword|
|Shirts|
|Yellow|
|Polos|