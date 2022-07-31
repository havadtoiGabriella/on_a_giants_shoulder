Feature: Blog articles test

  Scenario Outline: Opening <nth>. article
    Given I navigate to the <page> blog page
    And I accept the data handling dialog box
    When I choose the <nth> article
    Then I should be redirected to the article's landing page
    Examples:
      | page               | nth |
      | FOCUS              | 2   |
      | GOAL_GETTING       | 6   |
      | DIET_AND_NUTRITION | 17  |

  Scenario Outline: Opening <nth>. article with pagination
    Given I navigate to the <page> blog page
    And I accept the data handling dialog box
    When I click on the 'See older posts' link
    And I choose the <nth> article
    Then I should be redirected to the article's landing page
    Examples:
      | page            | nth |
      | LIFE_BALANCE    | 27  |
      | GOAL_GETTING    | 28  |
      | SUCCESS_MINDSET | 30  |

  Scenario Outline: Opening <nth>. article author's profile page
    Given I navigate to the <page> blog page
    And I accept the data handling dialog box
    And I choose the <nth> article
    When I click on the author's name
    Then I should be redirected to the author's profile page
    Examples:
      | page               | nth |
      | FOCUS              | 2   |
      | MENTAL_WELLNESS    | 6   |
      | DIET_AND_NUTRITION | 8   |

  Scenario Outline: Opening 'Posts' on <nth>. article author's profile page
    Given I navigate to the <page> blog page
    And I accept the data handling dialog box
    And I choose the <nth> article
    And I click on the author's name
    When I click on 'Posts'
    Then I should see that the posts contains the previous article
    Examples:
      | page               | nth |
      | FOCUS              | 2   |
      | MENTAL_WELLNESS    | 6   |
      | DIET_AND_NUTRITION | 8   |

  # Scenario Outline: Opening a blog article's Reference page
  #  Given I open the <page> blog page
  #  And I choose the <article> article
  #  When I click on the <reference> reference link
  #  Then I should be redirected to the reference's landing page
  #  Examples:
  #    | page             | article                                                      | reference                                                         |
  #    | Focus            | The Flowtime Technique: A Pomodoro Alternative               | Urgent Pigeon: Asset-Based Thinking: What can I build upon?       |
  #    | Leadership       | How to Deal With Coworkers Who Complain A Lot                | Harvard Business Review: Managing a Chronic Complainer            |
  #    | Diet & Nutrition | How to Create a Delicious and Healthy Meal Plan for the Week | Healthy Eating Dr: How Much Water Do You Need to Drink Every Day? |

