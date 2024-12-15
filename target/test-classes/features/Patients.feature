Feature: Login Functionality


  @Dayview
  Scenario Outline: Going to dayview
    Given User is on login page
    Then User enters Username"<UserName>"
    Then User enters Password "<Password>"
    Then User clicked on login button
    Then the user goes to the dayview page
    Then the user clicks the load button
    
    Examples: 
      | UserName                   | Password         |
      | aditee.ranade@civica.co.uk | Aditeetest123456 |

      
  @Weekview
  Scenario Outline: Going to weekview
    Given User is on login page weekview
    Then User enters Username weekview"<UserName>"
    Then User enters Password weekview "<Password>"
    Then User clicked on login button weekview
    Given the user goes to the weekview page
     Then the user clicks the load button weekview
    
   Examples: 
      | UserName                   | Password         |
      | aditee.ranade@civica.co.uk | Aditeetest123456 |
      
      
      