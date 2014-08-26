Story: Import from icpc.baylor.edu
 
Narrative: 
In order to be able to post news
As a user
I want to be able to add news under admin profile

Scenario: As admin i want to be able to add news and publish it
Given the user is signed in with admin@icpc.org.ua e3r4t5
When user go to news menu
When user click on add news button
When user enter the title
When user enter enter the body and click save news
When user click on publish button
And user go to news menu
Then user should see created news on the top of news page
