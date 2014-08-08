Scenario: register as a new user
Given the user is on the Login page
When the user click on registration link
And the user enter valid credentials into register form and submit
Then the user should see a welcome message 'Oleg Petrov'