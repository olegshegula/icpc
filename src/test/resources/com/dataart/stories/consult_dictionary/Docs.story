Scenario: As user i want to be able to get to Guidance Docs page when I click on Docs dropdown menu and choose appropriate link
Given the user is on the Login page
When user clicks on the Docs link and chooses Guidance item
Then user is on the Guidance Docs page

Scenario: As user i want to be able to get to Regulation Docs page when I click on Docs dropdown menu and choose appropriate link
Given the user is on the Login page
When user clicks on the Docs link and chooses Regulations item
Then user is on the Regulations Docs page

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

Scenario: As coordinator i want to be able to upload documents to the Regulations section
Given the user is on the Login page
When the user enters name: coord1@mailinator.com and password: 123456 and click the 'login' button
When user clicks on the Docs link and chooses Regulations item
Then user clicks on the Upload Doc button
Then user fills all the fields
Then user chooses file and uploads it
Then user is able to see document in the list