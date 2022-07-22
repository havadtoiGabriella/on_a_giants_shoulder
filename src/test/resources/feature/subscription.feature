Feature: Subscription test

  Background: User opens the subscribe panel
    Given I navigate to the main page
    And I accept the data handling dialog box
    And I click on the Subscribe button

  Scenario: Subscribe to 'Learn faster' newsletter
    Given I choose 'Learn faster' newsletter
    When I enter my e-mail address for 'Learn faster'
    Then I should get a successful subscription message for learn faster

  Scenario: Subscribe to 'Stop procrastinating' newsletter
    Given I choose 'Stop procrastinating' newsletter
    When I enter my e-mail address for 'Stop procrastinating'
    Then I should get a successful subscription message for stop procrastinating

  Scenario: Subscribe to 'Reach your goals' newsletter
    Given I choose 'Reach your goals' newsletter
    When I enter my e-mail address for 'Reach your goals'
    Then I should get a successful subscription message for reach your goals

  Scenario: Subscribe to 'Improve focus' newsletter
    Given I choose 'Improve focus' newsletter
    When I enter my e-mail address for 'Improve focus'
    Then I should get a successful subscription message for improve focus
