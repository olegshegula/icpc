Story: Manage QA functionality for icpc.baylor.edu
 
Narrative: 
In order to be able to manage QA functionality
As a user
I want to be able to manage QA functionality, manage tags, create questions...

Scenario: As admin i want to be able to create Tag
Given the user is signed in with admin@icpc.org.ua e3r4t5
Given the user is on the QA page
When user click on manage tabs button
When user click on create tab button
When user enter title field
When user enter description field
When user click save button
Then user should see a new tag with name and description

Scenario: As admin i want to be able to delete Tag
Given the user is signed in with admin@icpc.org.ua e3r4t5
Given the user is on the QA page
When user click on manage tabs button
Then user click on delete button and should see that tag is deleted

Scenario: As admin i want to be able to cteate Tag without description
Given the user is signed in with admin@icpc.org.ua e3r4t5
Given the user is on the QA page
When user click on manage tabs button
When user click on create tab button
When user enter title field
When user click save button
Then user should see a new tag with name

Scenario: As admin i want to be able to edit Tag
Given the user is signed in with admin@icpc.org.ua e3r4t5
Given the user is on the QA page
When user click on manage tabs button
When user click on create tab button
When user enter title field
When user enter description field
When user click save button
When user click edit button
When user enter title field
When user enter description field
When user click save button
Then user should see a new tag with name and description

Scenario: As admin i want to be able to see warrning when i cteate Tag without title and description 
Given the user is signed in with admin@icpc.org.ua e3r4t5
Given the user is on the QA page
When user click on manage tabs button
When user click on create tab button
When user click save button
Then user should see warrning message Name cannot be blank.

Scenario: As admin i want to be able to see warrning when i cteate Tag without title and with description 
Given the user is signed in with admin@icpc.org.ua e3r4t5
Given the user is on the QA page
When user click on manage tabs button
When user click on create tab button
When user enter description field
When user click save button
Then user should see warrning message Name cannot be blank.