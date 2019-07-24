Feature: My Standard Chartered bank account

Background: Launching of the bank loding page
Given Adi has done with browser conf
Then she launches the application in chrome browser

Scenario: Sign In for Adi
Given He click the sign-in link
Then He enters valid cred
And He clicks on submit

Scenario: Sign-up for guest user
Given Guest user clicks on sing-up link
When he provides all the mandatory data
Then He clicks on submit button & and id is created

Scenario: Adi wants to reset her password
Given She clicks on forget password link
Then She enters mobile number
And she recieves otp and provides the same
Then she is able to reset her password
