Scenario: As user i want to be able to see E-mail confirmation message when i register with correct credentials	
Given the user is on the Registration page
When enter all correct credentials
And user click Sign up
Then user should see the E-mail confirmation message You have signed up successfully. We have sent an email confirmation link to your email.

Scenario: As user i want to be able to see 7 warrning message about blank fields when i register without any credentials
Given the user is on the Registration page
When user click Sign up 
Then user should see 7 warrning messages about blank fields