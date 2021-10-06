#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login feature
  Login


  
  Scenario Outline: Title of your scenario outline
    Given User launches the salesforce website  
    When user enters username <value>  in step
   	When user enters password <value>  in step
   	Then click on login button    
		Then Verify User Login

    Examples: 
      | username  | password | 
    	| kk 				|     5 			| 
      | kk2 		|     7 		| 
