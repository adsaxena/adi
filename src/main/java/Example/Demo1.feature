Feature: My Validation on Mercury Tours
 Scenario Outline: customer  login
Given Application url is working
When user enters username "<user>"
And user enter password "<pass>"
Then he click on submit button
And verifies the login process
Then he chose to close the application

Examples: 
      | user  | pass   |
      | demo  | demo   |
      | mary  | jane   |
