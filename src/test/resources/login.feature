Feature: Login

-This feature file is meant to test Login Functionality
-We will be peforming both positive and negative testing

Rules-
-User should be registered prior to performing login.
-User should be on login page.

Scenario: Login with Positive data
Given user is on login page
When user enters username and password
And clicks on Login 
Then homepage should be displayed.