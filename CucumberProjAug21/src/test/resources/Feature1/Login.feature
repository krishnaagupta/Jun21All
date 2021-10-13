
Feature: Login
  #
	#testcase 2
  @tag1
  Scenario: Valid username and password
    Given User is on "LoginPage"
    When User enters value into text box "Username" "kkg22@tekarch.com"
    And  User enters value into text box "Password" "august21"
    Then User click on "Login" Button
    Given User is on "HomePage"
 
 
      #testcase 1
    @tag2
  Scenario: Valid username and  blank password
    Given User is on "LoginPage"
    When User enters value into text box "Username" "kkg22@tekarch.com"
    And  User enters value into text box "Password" ""
    Then User click on "Login" Button
    Then "Error1" to be Displayed
    
    
    
      #	#TestCase4a
   @tag2
	Scenario: Wrong username and  Wrong password
	  Given User is on "LoginPage"
	  When User enters value into text box "Username" "kkg22@tekarch.com"
	 	Then User click on "forgotPassword" Button
	 	When User enters value into text box "usernameforgotme" "kkg22@tekarch.com"
	 	Then User click on "continueButton" Button
	 	Then link is displayed 
	 	
          #testcase 4b
    @tag2
  Scenario: Wrong username and  Wrong password
    Given User is on "LoginPage"
    When User enters value into text box "Username" "123"
    And  User enters value into text box "Password" "22131"
    Then User click on "Login" Button
  	Then "Error1" to be Displayed
   
   #TestCase3-RememberMe
   @tag2
  Scenario: Remember Me
    Given User is on "LoginPage"
    When User enters value into text box "Username" "kkg22@tekarch.com"
    And  User enters value into text box "Password" "august21"
   	Then User click on "Rememberme" Checkbox
   	Then User click on "Login" Button
 	 	Given User is on HomePage and goes to "usermenu" clicks "Logout"
 	 	Then "Userrememberme" to be Displayed
   	
  #  #TestCase my test case for data table
   @tag2

  
  	
    