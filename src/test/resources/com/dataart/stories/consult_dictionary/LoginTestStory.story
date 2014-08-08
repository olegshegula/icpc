Scenario: Login as valid user
Given the user is on the Login page
When the user enters name: admin and password: admin and click the 'login' button
Then user should see a welcome message Welcome Ivan Petrov


Scenario: Login as valid user with incorrect password
Given the user is on the Login page
When the user enters name: admin and password: admin111 and click the 'login' button
Then user should see a flash message You have entered an invalid username or password!