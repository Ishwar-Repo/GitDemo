Feature: Application Login

#Common steps which are lies under pre-requisites and want to run before each scenario those 
#steps are we generally mentioned under Background keyword
#Scope of Background keyword = specific to the feature file in which it is defined.
Background:  
Given setup the entries in database
When launch the browser from config variables
And hit home page url of banking site

#-----------------------------------------------------------------------------------------
@RegressionTest
Scenario: Admin Page Default Login

Given User is on netbanking landing page
When User Login into application with username as "Admin" and password as "12345"
Then Home Page is displayed
And Cards are displyed

#-----------------------------------------------------------------------------------------
#Reusable
@MobileTest
Scenario: User Page Default Login

Given User is on netbanking landing page
When User Login into application with username as "User" and password as "98765"
Then Home Page is displayed
And Cards are displyed

#-----------------------------------------------------------------------------------------
#When we have to run the test mutiple times with diff. data sets go with "Scenario Outline" 
@SmokeTest @RegressionTest
Scenario Outline: Mortgage User Page Default Login

Given User is on netbanking landing page
When User Login into application with username as "<Username>" and password as "<Password>"
Then Home Page is displayed
And Cards are displyed

#Examples are used for parameterising the test (It is a part of Scenario Outline)
Examples:
|Username|Password|
|CreditUser|Password@123|
|DebitUser|Password@987|
|StockUser|Password@456|

#-----------------------------------------------------------------------------------------
#When we have to run the test with multiple data in one step then you'll go with below scenario
@SmokeTest
Scenario: User Page Default Login

Given User is on practice landing page
When User signup into application with 
|Ishwar|
|Suranje|
|ishwarsuranje@gmail.com|
|9877665544|
Then Home Page is displayed
And Cards are displyed