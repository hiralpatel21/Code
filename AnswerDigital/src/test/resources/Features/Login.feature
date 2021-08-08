Feature: Automate Form Authentication
@login
Scenario: Verify the Valid Username and InValid Password
Given I am on home page
When I click on Form Authontication icon
And I enter valid Usename and invalid password for login
|UserName|tomsmith|
|password|SuperSecret!|
And i click on login button
Then I should see the Error Massage

@login-1
Scenario: Verify the InValid Username and Valid Password
Given I am on home page
When I click on Form Authontication icon
And I enter invalid Usename and valid password for login
|UserName|Hiral|
|password|SuperSecretPassword!|
And i click on login button
Then I should see the Error Massage

@login-2
Scenario: Verify the functionality with valid credentials
Given I am on home page
When I click on Form Authontication icon
And I enters valid credentials for login
|UserName|tomsmith|
|password|SuperSecretPassword!|
And i click on login button
Then I should see my Account page




