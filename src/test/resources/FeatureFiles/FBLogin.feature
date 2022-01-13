@Login
Feature: To validate Login functionality using Facebook Application

  Background: 
    Given User have to enter facebook login by google chrome

  @Sanity @Smoke
  Scenario: 
    To validate login by using valid email and invalid password

    When User have to enter  invalid email and invalid password
      #| username         | email           |
      #| ajay@gmail.com   | housing.com     |
      #| jerome@gmail.com | kannamma        |
      #| chinnadurai      | sagayamary      |
      #| roselin mary     | shyam ravindhar |
    And User have to click login button
    Then User have to reach invalid login credentials page

  @Smoke @Regression
  Scenario: 
    To validate login by using invalid email and invalid password

    When User have to enter  invalid email and invalid password
    And User have to click login button
    Then User have to reach invalid login credentials page
    #Examples: 
      #| username         | password         |
      #| arun@gmail.com   | 83yr289ry9       |
      #| febin@gmail.com  | gfuguiwtruwgruq  |
      #| roobi@gmail.com  | hdgjgfidg        |
      #| riyaz@gmail.com  | ud877f8gecqw     |
      #| vdhvha@gmail.com | hhasbcjka2       |
      #| gdsag@gmail.com  | 8384328ggdksdaag |
