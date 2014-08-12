Scenario: Login as valid user
Given the user is on the Login page
When the user enters name: admin@icpc.org.ua and password: e3r4t5 and click the 'login' button
Then user should see a page title Additional User - ICPC
Then user loged out

Scenario: As user i want to be able to see error message when i login without any credentials	
Given the user is on the Login page
When the user click the login button
Then user should see invalid flash message Email or password is invalid

Scenario: As user i want to be able to see error message when i login with wrong credentials
Given the user is on the Login page
When the user enters name: admin@icpc.org.ua and password: e3r4 and click the 'login' button
Then user should see invalid flash message Email or password is invalid

Scenario: As user i want to be able to see error message when i login with correct email and without password
Given the user is on the Login page
When the user enters name: admin@icpc.org.ua and click the 'login' button
Then user should see invalid flash message Email or password is invalid

Scenario: As user i want to be able to see error message when i login with correct password and without email 
Given the user is on the Login page

When the user enters password: e3r4t5 and click the 'login' button
Then user should see invalid flash message Email or password is invalid

When the user enters name: admin@icpc.org.u and click the 'login' button
Then user should see invalid flash message Email or password is invalid

Scenario: As user i want to be able to see registration page if i click on "Register now" link
Given the user is on the Login page
When the user click on the Register now link
Then user should see a page title Signup Auth - ICPC

Scenario: As user i want to be able to choose russian version of the site
Given the user is on the Login page
When the user click on the swich language button and choose ru
Then user should see the header Всеукраинская студенческая олимпиада по программированию 

Scenario: As user i want to be able to choose english version of the site
Given the user is on the Login page
When the user click on the swich language button and choose en
Then user should see the header Ukranian Collegiate Programming Contest

Scenario: As user i want to be able to choose ukrainian version of the site
Given the user is on the Login page
When the user click on the swich language button and choose uk
Then user should see the header Всеукраїнська студентська олімпіада з програмування