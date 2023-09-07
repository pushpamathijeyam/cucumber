@login
Feature: To validate login functionality in fb

  Background: 
    Given User have to be in fb login page

  @smoke @sanity
  Scenario: To validate login using invalid email and valid password
    When Enter  invalid email and valid password
      | Name    | phoneno    | email             | password   |
      | ammu    | 9876543210 | jeyam@gmail.com   | amm890     |
      | jegan   | 8825663423 | werrt@w.com   | jegan345   |
      | murugan | 8765433221 | murugan@gmail.com | murugan456 |
    And click login button
    Then invalid credentils page

  @smoke
  Scenario: To validate login using email and password
    When Enter valid email and invalid password
    And click login button
    Then invalid credentils page

  @reg @smoke
  Scenario: To validate login using email and password
    When Enter  invalid email and invalid password
    And click login button
    Then invalid credentils page
  #Scenario Outline: To validate login using email and password
    #Given User have to be in fb login page
    #When Enter  "<email>" and"<password>"
    #And click login button
    #Then invalid credentils page
#
    #Examples: 
      #| email  | password |
      #| ammu   | 74856131 |
      #| 748596 | akila    |
      #| ammu   | simeon   |
