Scenario: As user i want to be able to register and log in to new accout
Given the user is on the Registration page
When user enter all correct credentials
And user click Sign up
When user check his emailbox myicpctest@gmail.com 123myicpctest and click on the confirmation link
Then user should see the E-mail confirmation message Email verified successfully!
Given the user is on the Login page
When the user enters name: myicpctest@gmail.com and password: 123myicpctest and click the 'login' button
Then user should see a page title Additional User - ICPC