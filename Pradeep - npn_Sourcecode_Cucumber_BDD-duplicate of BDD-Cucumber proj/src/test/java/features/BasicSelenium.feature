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
Feature: As a user, i want to launch NPN Training website and verify the courses

  @WebSite @Base
  Scenario: Verify NPN Training Website
    Given LaunchChromeBrowser
    When Navigate To NPN Training Website
    Then Verify Whether NPN Training Website was launched or not
    
    @Courses @Regression
    Scenario: Verify NPN Training Website Courses
    Given LaunchChromeBrowser
    When Navigate To NPN Training Website
    And Navigate to Courses
    Then Verify Whether the courses are displayed or not

