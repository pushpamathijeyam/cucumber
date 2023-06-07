@forget
Feature: To validate forgetten password functionality in fb

  @sanity
  Scenario: to validate  forgotten password  using invalid mobile number
    Given user have to be in fb login page
    And user  have to click forgotten password
    When user have to enter invalid mobile number
      | phone number | 987654321o     |
      | username     | ammu           |
      | email        | ammu@gmail.com |
      | password     |        8987544 |
    And user have to click search button
    Then user have to be in identity account page
