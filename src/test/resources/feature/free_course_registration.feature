Feature: Free course registration test

  Background: User opens the free courses page
    Given I navigate to the main page
    And I accept the data handling dialog box
    And I navigate to the free courses page

  Scenario: Register to 'Activate Your Motivation' course
    Given I choose 'Activate Your Motivation' course
    When I enter my name and e-mail address and select "Watch yesterday's broadcast now"
    Then I should see the course video

  Scenario: Register to 'Hacking Procrastination 4-Day Workshop' course
    Given I choose 'Hacking Procrastination 4-Day Workshop' course
    When I enter my name and e-mail address
    Then I should see the course video

  Scenario: Register to 'Spark Your Learning Genius' course
    Given I choose 'Spark Your Learning Genius' course
    When I enter my name and e-mail address and select "Watch yesterday's broadcast now"
    Then I should see the course video


