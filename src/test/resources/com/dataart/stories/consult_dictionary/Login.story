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




Scenario: As user i want to be able to get to the DA site when i click on the link
Given the user is on the Login page
When the user click on the DA link
Then user should be sent to DataArt page

Scenario: As user i want to be able to get to the GitHub's project page when i click on the link
Given the user is on the Login page
When the user click on the GitHub link
Then user should be sent to GitHub's project page

Scenario: As user i want to be able to get to the Twitter's project page when i click on the link
Given the user is on the Login page
When the user click on the Twitter link
Then user should be sent to Twitter's project page

Scenario: As user i want to see that email address of project is correct
Given the user is on the Login page
Then user should see correct project's email

Scenario: As user i want to see links News, Docs, Teams, Results, QA on the Login page 
Given the user is on the Login page
Then user should see the News link
Then user should see the Docs link
Then user should see the Teams link
Then user should see the Results link
Then user should see the QA link

Scenario: As user i want to be able to get to News page when I click on appropriate link
Given the user is on the Login page
When user clicks on the News link
Then user is on the News page

Scenario: As user i want to be able to get to Teams page when I click on appropriate link
Given the user is on the Login page
When user clicks on the Teams link
Then user is on the Teams page

Scenario: As user i want to be able to get to Results page when I click on appropriate link
Given the user is on the Login page
When user clicks on the Results link
Then user is on the Results page

Scenario: As user i want to be able to get to QA page when I click on appropriate link
Given the user is on the Login page
When user clicks on the QA link
Then user is on the QA page

Scenario: As user i want to be able to be sent to Login page when trying to ask question under Guest
Given the user is on the Login page
When user clicks on the QA link
Then user is on the QA page
Then user clicks on the Ask Question button
Then user is sent to Login page



Scenario: As user i want to be able to get to Regulation Docs page when I click on Docs dropdown menu and choose appropriate link
Given the user is on the Login page
When user clicks on the Docs link and chooses Regulations item
Then user is on the Regulations Docs page

Scenario: As user i want to be able to get to Guidance Docs page when I click on Docs dropdown menu and choose appropriate link
Given the user is on the Login page
When user clicks on the Docs link and chooses Guidance item
Then user is on the Guidance Docs page

Scenario: As user i want to be able to download document in Regulation docs menu
Given the user is on the Login page
When user clicks on the Docs link and chooses Regulations item
Then user clicks on the top document's title
Then user is able to download that document

Scenario: As user i want to be able to download document in Guidance docs menu
Given the user is on the Login page
When user clicks on the Docs link and chooses Guidance item
Then user clicks on the top document's title
Then user is able to download that document