Scenario: As coordinator i want to be able to edit documents from the Guidance section
Given the user is on the Login page
When the user enters name: coord1@mailinator.com and password: 123456 and click the 'login' button
When user clicks on the Docs link and chooses Guidance item
Then user clicks on the Edit button near the first document in the list
Then user fills all fields with new correct information
Then user chooses Regulations item on dropdown list
Then user clicks on Save Document button
Then user can see document with new info in fields in the list