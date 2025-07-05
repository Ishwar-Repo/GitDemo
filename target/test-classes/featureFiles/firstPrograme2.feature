Feature: Application Login

#//Flow of execution in Cucumber BDD Framework : Before -> Background -> Scenario -> After

#Common steps which are lies under pre-requisites and want to run before each scenario those 
#steps are we generally mentioned under background keyword
#Scope of Background keyword = specific to the feature file in which it is defined.
Background: 
When launch the browser from config variables
And hit home page url of banking site

#-----------------------------------------------------------------------------------------
#Reusable
@RegressionTest @NetBanking
Scenario: User Page Default Login

Given User is on netbanking landing page
When User Login into application with username as "User" and password as "98765"
Then Home Page is displayed
And Cards are displyed

#-----------------------------------------------------------------------------------------
#When we have to run the test mutiple times with diff. data sets go with "Scenario Outline" 
@SmokeTest @RegressionTest @Mortgage
Scenario Outline: Mortgage User Page Default Login

Given User is on netbanking landing page
When User Login into application with username as "<Username>" and password as "<Password>"
Then Home Page is displayed
And Cards are displyed

#-----------------------------------------------------------------------------------------
#Examples are used for parameterising the test (It is a part of Scenario Outline)
Examples:
|Username|Password|
|CreditUser|Password@123|
|DebitUser|Password@987|
|StockUser|Password@456|

