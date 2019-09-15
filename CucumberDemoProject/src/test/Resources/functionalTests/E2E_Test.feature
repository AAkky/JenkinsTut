Feature: Login test
Scenario: Flipkart login scenarios

Given User is in Toolsqa home page
When User clicks on my Account link
Then User is navigated Register page
When User enters username "Anjeet"
And User enters password "123456789~a"
And User enters email "kumaranjeet01@gmail.com"
And Clicks on clicks on register Button
Then User is successfully registered
