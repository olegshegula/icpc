Story: Registration to icpc.org.ua
 
Narrative: 
In order to be able to manage user profile
As a user
I want to be able to set user settings

Scenario: As a user i want to be able to change my password log in with new credentials and back my old password
Given the user is signed in with stutwo@mailinator.com 123456
When user move to general info tab
When user enter current password 123456
When user enter new password 1234567
When user repeate new password 1234567
When user click change password button
Then user should see sucess message Your password has been successfully changed
Then user loged out
Given the user is signed in with stutwo@mailinator.com 1234567
Then user should see a page title Additional User - ICPC
Then the user changes the password back
Then user loged out

Scenario: As a user i want to see error message field when i don't enter any password fields and click reset password button
Given the user is signed in with stutwo@mailinator.com 123456
When user move to general info tab
When user click change password button
Then user should see error field message Password is incorrect

Scenario: As a user i want to see error message field when i don't enter any password fields except current password and click reset password button
Given the user is signed in with stutwo@mailinator.com 123456
When user move to general info tab
When user enter current password 123456
When user click change password button
Then user should see error field message Password length should be greater or equal than 6.

Scenario: As a user i want to see error message field when i don't enter any password fields except correct, new password and click reset password button
Given the user is signed in with stutwo@mailinator.com 123456
When user move to general info tab
When user enter current password 123456
When user enter new password 1234567
When user click change password button
Then user should see error field message Password is not confirmed.