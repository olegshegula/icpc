Scenario: As user i want to be able to see E-mail confirmation message when i register with correct credentials are taken form CSV file
Given the user is on the Registration page
When enter all correct credentials form file source
Then user should see the Resend email button