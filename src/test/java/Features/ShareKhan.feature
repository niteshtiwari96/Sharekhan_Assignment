Feature: Sherkhan Application

As a user
In order to explore the features of Sharekhan
I want to visit www.sharekhan.com

@MobileTest
Scenario: User is Verify MainMenu button And MainMenu popup
Given ShareKhan website is open in the browser
Then the website is launched successfully
When user clicks on main menu button
Then main menu popup is displayed