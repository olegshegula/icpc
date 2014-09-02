Scenario: As user i want to be able to be sent to Login page when trying to ask question under Guest
Given the user is on the Login page
When user clicks on the QA link
Then user is on the QA page
Then user clicks on the Ask Question button
Then user is sent to Login page