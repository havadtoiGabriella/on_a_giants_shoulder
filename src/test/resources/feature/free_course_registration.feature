Feature: Free course registration test

  Background: User opens the free courses page
    Given I navigate to the main page
    And I accept the data handling dialog box
    And I navigate to the free courses page

  Scenario Outline: Register for '3 Steps To Spark Your Motivation And Take Action... ' course
    Given I choose 'Activate Your Motivation' course
    When I register for the '3 Steps To Spark Your Motivation' course with <registrationDataType>
    Then I should see the 'Activate Your Motivation' course video
    Examples:
      | registrationDataType |
      | USER                 |

  Scenario Outline: Register for 'Activate Your Motivation' course
    Given I choose 'Activate Your Motivation' course
    When I register for the 'Activate Your Motivation' course with <registrationDataType>
    Then I should see the 'Activate Your Motivation' course video
    Examples:
      | registrationDataType |
      | USER                 |

  Scenario Outline: Register for 'Hacking Procrastination 4-Day Workshop' course
    Given I choose 'Hacking Procrastination 4-Day Workshop' course
    When I register for the 'Hacking Procrastination' course with <registrationDataType>
    Then I should see the 'Hacking Procrastination' course video
    Examples:
      | registrationDataType |
      | USER                 |

  Scenario Outline: Register for 'Spark Your Learning Genius' course
    Given I choose 'Spark Your Learning Genius' course
    When I register for the 'Spark Your Learning Genius' course with <registrationDataType>
    Then I should see the 'Spark Your Learning Genius' course video
    Examples:
      | registrationDataType |
      | USER                 |

  Scenario Outline: Register for 'Supercharge Your Mental Ability with 3 Simple Principles' course
    Given I choose 'Spark Your Learning Genius' course
    When I register for the 'Supercharge Your Mental Ability' course with <registrationDataType>
    Then I should see the 'Spark Your Learning Genius' course video
    Examples:
      | registrationDataType |
      | USER                 |
